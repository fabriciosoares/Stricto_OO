package exercicio.exercicio_06_02.aula14.br.ufpe.cin.banco;

import exercicio.exercicio_06_02.aula14.br.ufpe.cin.banco.ContaAbstrata;
import exercicio.exercicio_06_02.aula14.br.ufpe.cin.banco.ContaEspecial;
import exercicio.exercicio_06_02.aula14.br.ufpe.cin.banco.Poupanca;
import exercicio.exercicio_06_02.aula14.br.ufpe.cin.banco.dados.RepositorioContasArray;

public class Banco {

	private RepositorioContasArray repositorio;
	private double taxaJuros;
	
	// Método Construtor
	public Banco(){
		this.repositorio = new RepositorioContasArray();
	}

	// Métodos Gets e Sets
	public RepositorioContasArray getRepositorio() {
		return repositorio;
	}

	public void setRepositorio(RepositorioContasArray repositorio) {
		this.repositorio = repositorio;
	}
	
	// Outros Métodos
	public void creditar(ContaAbstrata conta, double valor) {
		ContaAbstrata contaAtualizada = conta;
		contaAtualizada.creditar(valor);
		this.repositorio.atualizar(contaAtualizada);
	}
	
	public void debitar(ContaAbstrata conta, double valor) {
		ContaAbstrata contaAtualizada = conta;
		contaAtualizada.debitar(valor);
		this.repositorio.atualizar(contaAtualizada);
	}
	
	public double getSaldo(ContaAbstrata conta) {
		return this.repositorio.procurar(conta.getNumero()).getSaldo();
	}
	
	public void renderJuros(String numero, double taxaJuros) {
		this.taxaJuros = taxaJuros;
		if (repositorio.procurar(numero) instanceof Poupanca) {
			((Poupanca) repositorio.procurar(numero)).renderJuros(this.taxaJuros);;
		} else {
			throw new RuntimeException("Erro: A conta solicitada não é de Poupança");
		}
	}
	
	public void renderBonus(String numero, double credito) {
		if (repositorio.procurar(numero) instanceof ContaEspecial) {
			((ContaEspecial) repositorio.procurar(numero)).renderBonus(credito);
		} else {
			throw new RuntimeException("Erro: A conta solicitada não é de Poupança");
		}
	}
	
	public void transferir(String numeroDebito, String numeroCredito, double valor) {
		ContaAbstrata contaDebitada = repositorio.procurar(numeroDebito);
		contaDebitada.debitar(valor);
		debitar(contaDebitada, valor);
		
		ContaAbstrata contaCreditada = repositorio.procurar(numeroCredito);
		contaCreditada.creditar(valor);
		creditar(contaCreditada, valor);
	}
	
}
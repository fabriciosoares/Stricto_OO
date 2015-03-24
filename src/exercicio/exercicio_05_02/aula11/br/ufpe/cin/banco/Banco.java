package exercicio.exercicio_05_02.aula11.br.ufpe.cin.banco;

public class Banco {

	private Conta[] contas;
	private int indice;
	private double taxaJuros;
	
	// Método Construtor
	public Banco () {
		this.contas = new Conta[100];
		this.indice = 0;
	}
	
	// Outros Métodos
	public void cadastrar(Conta conta) {
		this.contas[this.indice] = conta;
		this.indice++;
	}
	
	public void creditar(Conta conta, double valor) {
		for(int i = 0; i < this.indice; i++) {
			if (this.contas[i].equals(conta)) {
				this.contas[i].creditar(valor);
			}
		}
	}
	
	public void debitar(Conta conta, double valor) {
		for(int i = 0; i < this.indice; i++) {
			if (this.contas[i].equals(conta)) {
				this.contas[i].debitar(valor);
			}
		}
	}
	
	public double getSaldo(Conta conta) {
		double saldo = 0;
		for(int i = 0; i < this.indice; i++) {
			if (this.contas[i].equals(conta)) {
				saldo = this.contas[i].getSaldo();
			}
		}
		return saldo;
	}
	
	public Conta procurar(String numero) {
		
		boolean achou = false;
		Conta contaProcurada = null;
		
		for(int i = 0; i < this.indice; i++) {
			if(this.contas[i].getNumero() == numero) {
				achou = true;
				contaProcurada = contas[i];
			}
		}
		if (achou == true) {
			return contaProcurada;
		} else {
			throw new RuntimeException("Erro: A conta solicitada não é de Poupança");
		}

	}
	
	public void renderJuros(String numero, double taxaJuros) {
		this.taxaJuros = taxaJuros;
		for(int i = 0; i < this.indice; i++) {
			if (this.contas[i].getNumero().equals(numero)) {
				if (this.contas[i] instanceof Poupanca) {
					((Poupanca) contas[i]).renderJuros(this.taxaJuros);;
				} else {
					throw new RuntimeException("Erro: A conta solicitada não é de Poupança");
				}
			}
		}
	}
	
	public void renderBonus(String numero, double credito) {
		for(int i = 0; i < this.indice; i++) {
			if (this.contas[i].getNumero().equals(numero)) {
				if (this.contas[i] instanceof ContaEspecial) {
					((ContaEspecial) contas[i]).renderBonus(credito);
				} else {
					throw new RuntimeException("Erro: A conta solicitada não é de Poupança");
				}
			}
		}
	}
	
	public void transferir(String numeroDebito, String numeroCredito, double valor) {
		for(int i = 0; i < this.indice; i++) {
			if (this.contas[i].getNumero().equals(numeroDebito)) {
				this.contas[i].debitar(valor);
			}
		}
		for(int j = 0; j < this.indice; j++) {
			if (this.contas[j].getNumero().equals(numeroCredito)) {
				this.contas[j].creditar(valor);
			}
		}
	}
}

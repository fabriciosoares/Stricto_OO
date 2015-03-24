package exercicio.exercicio_05_01.aula11.br.ufpe.cin.banco;

public class Banco {

	private Conta[] contas;
	private int indice;
	
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
	
}

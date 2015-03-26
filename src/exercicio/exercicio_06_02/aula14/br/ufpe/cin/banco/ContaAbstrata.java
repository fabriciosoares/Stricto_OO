package exercicio.exercicio_06_02.aula14.br.ufpe.cin.banco;

public abstract class ContaAbstrata {

	private String numero;
	private double saldo;
	
	// Metodos Gets
	public String getNumero() { return numero; }
	public double getSaldo() { return saldo; }
	
	// Metodos Sets
	public void setNumero(String numero) { this.numero = numero; }
	public void setSaldo(double saldo) { this.saldo = saldo; }	
	
	// Outros Metodos
	public void creditar(double valor) { 
		this.saldo = this.saldo + valor;
	}
	
	public abstract void debitar(double valor);
}

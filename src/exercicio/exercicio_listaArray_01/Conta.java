package exercicio.exercicio_listaArray_01;

public class Conta {

	private String numero;
	private double saldo;
	
	// Métodos Construtores
	public Conta(String numero, double saldo) {
		super();
		this.numero = numero;
		this.saldo = saldo;
	}
	public Conta(String numero) {
		this(numero, 0.0);
	}
	
	// Métodos Gets
	public String getNumero() { return numero; }
	public double getSaldo() { return saldo; }
	
	// Métodos Sets
	public void setSaldo(double saldo) { this.saldo = saldo; }	
	
	// Outros Metodos
	public void creditar(double valor) { 
		this.saldo = this.saldo + valor;
	}
	
	public void debitar(double valor) {
		this.saldo = this.saldo - valor;
	}
	
}

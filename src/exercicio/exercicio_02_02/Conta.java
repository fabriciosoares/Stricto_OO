package exercicio.exercicio_02_02;

/*
 * Defina os dois construtores da classe Conta conforme mostrado na aula de hoje 
 */

public class Conta {

	private String numero;
	private double saldo;
	
	// Metodos Construtores
	public Conta(String numero, double saldo) {
		super();
		this.numero = numero;
		this.saldo = saldo;
	}
	public Conta(String numero) {
		this(numero, 0.0);
	}
	
	// Metodos Gets
	public String getNumero() { return numero; }
	public double getSaldo() { return saldo; }
	
	// Outros Metodos
	public void creditar(double valor) { 
		this.saldo = this.saldo + valor;
	}
	
	public void debitar(double valor) {
		this.saldo = this.saldo - valor;
	}
	
}

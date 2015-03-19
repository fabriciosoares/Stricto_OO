package exercicio.exercicio_01_02;

/*
 * Crie a classe Conta conforme apresentado em sala 
 * - atributos ( numero e saldo )
 * - métodos ( creditar , debitar , getSaldo , getNumero ) 
 */

public class Conta {
	private String numero;
	private double saldo;
	
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
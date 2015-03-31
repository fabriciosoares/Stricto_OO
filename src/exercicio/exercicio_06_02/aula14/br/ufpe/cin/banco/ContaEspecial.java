package exercicio.exercicio_06_02.aula14.br.ufpe.cin.banco;

public class ContaEspecial extends Conta {
	
	private double bonus;
	
	// Método Construtor
	public ContaEspecial(String numero, double saldo) {
		super(numero, saldo);
	}
	
	// Getters
	public double getBonus() {
		return this.bonus;
	}
	
	public void renderBonus(double credito) {
		super.creditar(credito);
		this.bonus = this.bonus + (credito * 0.01);
	}

}

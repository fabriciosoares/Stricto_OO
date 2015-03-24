package exercicio.exercicio_05_02.aula11.br.ufpe.cin.banco;

public class ContaEspecial extends Conta {
	
	private double bonus;
	
	// Método Construtor
	public ContaEspecial(String numero, double saldo) {
		super(numero, saldo);
	}
	
	// Getters
	public double getBonus() {
		return bonus;
	}
	
	public void renderBonus(double credito) {
		super.creditar(credito);
		bonus = bonus + (credito * 0.01);
	}

}

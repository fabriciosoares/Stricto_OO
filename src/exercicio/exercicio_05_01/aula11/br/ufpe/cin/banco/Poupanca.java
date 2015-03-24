package exercicio.exercicio_05_01.aula11.br.ufpe.cin.banco;

public class Poupanca extends Conta {
	
	// Método Construtor
	public Poupanca (String numero) {
		super(numero);
	}
	
	public void renderJuros(double taxaJuros) {
		
		super.creditar(getSaldo() * (taxaJuros / 100));
	}

}
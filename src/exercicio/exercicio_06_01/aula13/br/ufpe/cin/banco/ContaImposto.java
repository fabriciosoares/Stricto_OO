package exercicio.exercicio_06_01.aula13.br.ufpe.cin.banco;

public class ContaImposto extends ContaAbstrata {
	
	private static double CPMF;

	public ContaImposto(String numero, double saldo) {
		super();
		super.setNumero(numero);
		super.setSaldo(saldo);	
		CPMF = 0.01;
	}

	public void debitar(double valor) {
		super.setSaldo(super.getSaldo() - valor - (valor * CPMF));
	}

}

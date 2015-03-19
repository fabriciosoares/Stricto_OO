package exercicio.exercicio_03_01;

public class MeuArray {

	private int[] inteiros = new int[5];

	// Metodo Construtor
	public MeuArray(int[] inteiros) {
		super();
		this.inteiros = inteiros;
	}
	
	// Outros Metodos
		
	public int[] getInteiros() {
		return inteiros;
	}
	
	public int getSum() {
		int soma = 0;
		for(int i = 0; i < 5; i++) {
			soma = soma + this.inteiros[i];
		}
		return soma;
	}
	
	public int getGreater() {
		int maior = 0;
		for(int i = 0; i < 5; i++) {
			if(i == 0) {
				maior = this.inteiros[0];
			} else {
				if(this.inteiros[i] > this.inteiros[i - 1]) {
					maior = this.inteiros[i];
				}
			}
		}
		return maior;
	}

	public int countNumber(int numero) {
		int quantidade = 0;
		for(int i = 0; i < 5; i++) {
			if(this.inteiros[i] == numero) {
				quantidade++;
			}
		}
		return quantidade;
	}

	public void changePosition() {
		int[] arrayArrumado = new int[5];
		for(int i = 0; i < 5; i++){
			arrayArrumado[i] = this.inteiros[4 - i];
		}
		this.inteiros = arrayArrumado;
	}
	
}
package prova.br.ufpe.cin.livraria;

/*
 * 3) Implemente a classe br.ufpe.cin.livraria.RepositorioMidiaArray, que possui um array de Midia. 
 * Esta classe deve ter os seguintes métodos: 
 * 
 * - inserir - recebe um objeto Midia e insere no array;
 * - procurar - recebe um código e retorna o objeto Midia, caso ele esteja no array, caso contrário,
 *   retorna null;
 * - remover - recebe um código e remove o objeto Midia, caso ele esteja no array, caso contrário
 *   não faz nada;
 * - existe - recebe um código e retorna um boolean informando se o objeto Midia está (true) ou 
 *   não (false) no array;
 */

public class RepositorioMidiaArray {
	
	private Midia[] midias;
	private int contador;
	
	public RepositorioMidiaArray(int tamanho) {
		midias = new Midia[tamanho];
		contador = 0;
		}
	public void inserir(Midia midia) {
		if (this.contador < midias.length){  
            this.midias[contador] = midia;  
            contador++;  
        }  
        else  
            System.out.println("Inclusão não Permitida: Repositório Lotado");
	}

	public Midia procurar(String codigo) {
		Midia achei = new Midia();
		for (int i = 0; i < this.contador; i++) {
			if (this.midias[i].getCodigo().equals(codigo)) {
				achei = this.midias[i];
			}
		}
		return achei;
	}
	
	public void remover(String codigo) {
		int apaga = 0;
		for (int i = 0; i < this.contador; i++) {
			if (apaga == 0) {
				if (this.midias[i].getCodigo().equals(codigo)) {
					contador--;
					this.midias[i] = this.midias[this.contador];
					this.midias[contador] = null;
					apaga = 1;
				}
			}
		}
	}
	
	public boolean existe(String codigo) {
		boolean achei = false;
		for (int i = 0; i < this.contador; i++) {
			if (achei == false) {
				if (this.midias[i].getCodigo().equals(codigo)) {
					achei = true;
				}
			}
		}
		return (achei == true);
	}
}
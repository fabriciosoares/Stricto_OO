package br.ufpe.cin.livraria;

/*
 * 3) Implemente a classe br.ufpe.cin.livraria.RepositorioMidiaArray, que possui um array de Midia. Esta classe 
 * deve ter os seguintes métodos: 
 * 
 * - inserir – recebe um objeto Midia e insere no array;
 * - procurar – recebe um código e retorna o objeto Midia, caso ele esteja no array, caso contrário, retorna null;
 * - remover – recebe um código e remove o objeto Midia, caso ele esteja no array, caso contrário não faz nada;
 * - existe – recebe um código e retorna um boolean informando se o objeto Midia está (true) ou não (false) no array;
 */

public class RepositorioMidiaArray {
	
	private Midia[] midias = new Midia[999];
	int contador = 0;
	
	public void inserir(Midia midia) {
		if (this.contador < midias.length){  
            this.midias[contador] = midia;  
            contador++;  
        }  
        else  
            System.out.println("Inclusão não permitida");
//		int escrita = 0;
//		for (int i = 0; i < this.midias.length; i++) {
//			if (escrita == 0) {
//				if (this.midias[i].getCodigo().isEmpty()) {
//					this.midias[i] = midia;
//					escrita = 1;
//				}
//			}
//		}
	}

	public Midia procurar(String codigo) {
		Midia achei = new Midia();
		int busca = 0;
		for (int i = 0; i < this.midias.length; i++) {
			if (busca == 0) {
				if (this.midias[i].getCodigo().equals(codigo)) {
					achei = this.midias[i];
					busca = 1;
				}
			}
		}
		if (busca == 0) {
			return null;
		} else {
			return achei;
		}
	}
	
	public void remover(String codigo) {
		int apaga = 0;
		for (int i = 0; i < this.midias.length; i++) {
			if (apaga == 0) {
				if (this.midias[i].getCodigo().equals(codigo)) {
					this.midias[i] = null;
					apaga = 1;
				}
			}
		}
	}
	
	public boolean existe(String codigo) {
		boolean achei = false;
		for (int i = 0; i < this.midias.length; i++) {
			if (achei == false) {
				if (this.midias[i].getCodigo().equals(codigo)) {
					achei = true;
				}
			}
		}
		return achei;
	}
}

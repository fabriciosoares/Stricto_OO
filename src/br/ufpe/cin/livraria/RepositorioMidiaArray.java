package br.ufpe.cin.livraria;

/*
 * 3) Implemente a classe br.ufpe.cin.livraria.RepositorioMidiaArray, que possui um array de Midia. Esta classe 
 * deve ter os seguintes m�todos: 
 * 
 * - inserir � recebe um objeto Midia e insere no array;
 * - procurar � recebe um c�digo e retorna o objeto Midia, caso ele esteja no array, caso contr�rio, retorna null;
 * - remover � recebe um c�digo e remove o objeto Midia, caso ele esteja no array, caso contr�rio n�o faz nada;
 * - existe � recebe um c�digo e retorna um boolean informando se o objeto Midia est� (true) ou n�o (false) no array;
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
            System.out.println("Inclus�o n�o permitida");
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

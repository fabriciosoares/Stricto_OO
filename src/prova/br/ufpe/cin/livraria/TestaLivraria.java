package prova.br.ufpe.cin.livraria;

import java.io.IOException;

public class TestaLivraria {

	public static void main(String[] args) throws IOException {

		// CARGA DOS LIVROS
		String[] autores1 = {"Fabricio", "Bruna"};
		Midia midia1 = new Midia("123", "Vida Real", autores1);
		
		String[] autores2 = {"Tolkien"};
		Midia midia2 = new Midia("125", "O Senhor dos Anéis", autores2);
		
		// TESTE DO MÉTODO CONSTRUTOR
		Livraria livraria = new Livraria(10);
		
		// TESTE DO MÉTODO CADASTRAR
		livraria.cadastrar(midia1);
		livraria.cadastrar(midia2);
		livraria.cadastrar(midia1);

		// TESTE DO MÉTODO PROCURAR
		System.out.println();
		System.out.println("TESTE DO MÉTODO PROCURAR");
		System.out.println("===== == ====== ========");
		try {
			System.out.println(livraria.procurar("123").toString());
		} catch(NullPointerException e) {
		    System.out.println("Nulo");
		}
	
		System.out.println();
		try {
			System.out.println(livraria.procurar("125").toString());
		} catch(NullPointerException e) {
		    System.out.println("Nulo");
		}
		
	}

}
package prova.br.ufpe.cin.livraria;

import java.io.IOException;

public class TestaRepositorioArray {

	public static void main(String[] args) throws IOException {

		// CARGA DOS LIVROS
		String[] autores1 = {"Fabricio", "Bruna"};
		Midia midia1 = new Midia("123", "Vida Real", autores1);
		
		String[] autores2 = {"Tolkien"};
		Midia midia2 = new Midia("125", "O Senhor dos Anéis", autores2);
		
		String[] autores3 = {"Marcos Rey"};
		Midia midia3 = new Midia("128", "O Mistério do Cinco Estrelas", autores3);
		
		String[] autores4 = {"C.S.Lewis"};
		Midia midia4 = new Midia("130", "Cronicas de Nárnia", autores4);
		
		String[] autores5 = {"Douglas Adams"};
		Midia midia5 = new Midia("135", "Guia do Mochileiro das Galáxias", autores5);
		
		// TESTE DO MÉTODO CONSTRUTOR
		RepositorioMidiaArray repositorio = new RepositorioMidiaArray(10);
		
		// TESTE DO MÉTODO INSERIR
		repositorio.inserir(midia1);
		repositorio.inserir(midia2);
		repositorio.inserir(midia3);
		repositorio.inserir(midia4);
		repositorio.inserir(midia5);
		
		// TESTE DO MÉTODO PROCURAR
		System.out.println("TESTE DO MÉTODO PROCURAR");
		System.out.println("===== == ====== ========");
		try {
			System.out.println(repositorio.procurar("123").toString());
		} catch(NullPointerException e) {
		    System.out.println("Nulo");
		}

		System.out.println();
		try {
			System.out.println(repositorio.procurar("125").toString());
		} catch(NullPointerException e) {
		    System.out.println("Nulo");
		}
		
		System.out.println();
		try {
			System.out.println(repositorio.procurar("128").toString());
		} catch(NullPointerException e) {
		    System.out.println("Nulo");
		}
		
		System.out.println();
		try {
			System.out.println(repositorio.procurar("130").toString());
		} catch(NullPointerException e) {
		    System.out.println("Nulo");
		}
		
		System.out.println();
		try {
			System.out.println(repositorio.procurar("135").toString());
		} catch(NullPointerException e) {
		    System.out.println("Nulo");
		}
		
		// TESTE DO MÉTODO REMOVER
		repositorio.remover("125");
		
		System.out.println();
		System.out.println();
		System.out.println("TESTE DO MÉTODO REMOVER (125)");
		System.out.println("===== == ====== ======= =====");
		try {
			System.out.println(repositorio.procurar("125").toString());
		} catch(NullPointerException e) {
		    System.out.println("Nulo");
		}
		
		// TESTE DO MÉTODO EXISTE
		System.out.println();
		System.out.println();
		System.out.println("TESTE DO MÉTODO EXISTE");
		System.out.println("===== == ====== ======");
		System.out.println(repositorio.existe("130"));
		System.out.println();
		System.out.println(repositorio.existe("125"));
		
	}

}
package br.ufpe.cin.livraria;

/*
 * PENDENCIAS:  1) Array Dinâmico;
 * 				2) Testar o retorno do nulo;
 * 				3) Testar o retorno do false;
 */

public class TestaRepositorioArray {

	public static void main(String[] args) {

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
		
		RepositorioMidiaArray repositorio = new RepositorioMidiaArray();
		
		repositorio.inserir(midia1);
		repositorio.inserir(midia2);
		repositorio.inserir(midia3);
		repositorio.inserir(midia4);
		repositorio.inserir(midia5);
		
		System.out.println(repositorio.procurar("123").toString());
		System.out.println();
		System.out.println(repositorio.procurar("125").toString());
		System.out.println();
		System.out.println(repositorio.procurar("128").toString());
		System.out.println();
		System.out.println(repositorio.procurar("130").toString());
		System.out.println();
		System.out.println(repositorio.procurar("135").toString());
		
		repositorio.remover("135");
		
		System.out.println();
	//	System.out.println(repositorio.procurar("135").toString());
		
		System.out.println();
		System.out.println(repositorio.existe("130"));
		System.out.println();
	//	System.out.println(repositorio.existe("135"));

	}

}

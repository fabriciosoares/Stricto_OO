package prova.br.ufpe.cin.livraria;

public class TestaMidia {

	public static void main(String[] args) {

		String[] autores = {"Fabricio", "Bruna"};
		Midia midia = new Midia("123", "Vida Real", autores);
		
		System.out.println(midia.toString());
		
		midia.adicionarEstoque(10);
		
		System.out.println();
		System.out.println(midia.toString());
		
		midia.subtrairEstoque(2);
		
		System.out.println();
		System.out.println(midia.toString());
		
	}

}

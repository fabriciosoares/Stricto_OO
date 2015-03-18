package exercicio_03_01;

/*
 * Crie a classe MeuArray que 
 * –  Possui um array de inteiros como atributo 
 * –  Possui um construtor que inicializa o atributo com um array para 5 
 *    inteiros e já define os 5 valores inteiros 
 * –  Possui os seguintes métodos:
 * 		- getSum – retorna a soma dos inteiros do array;
 * 		- getGreater – retorna o maior inteiro do array;
 * 		- countNumber–recebe um número inteiro (como parâmetro) e retorna 
 * 		  o número de ocorrências desse inteiro no array;
 * 		- changePosition– troca a posição de todos os elementos do array 
 * 		  (o primeiro será o último, o segundo o penúltimo e assim por diante)
 * - Crie a classe ProgramaMeuArraypara testar a classe MeuArray
 */

import java.io.IOException;
import java.util.Scanner;

public class ProgramaMeuArray {

	public static void main(String[] args) throws IOException {
		
		Scanner s = new Scanner(System.in);

	    final MeuArray meuArray;
	    
	    System.out.println("******************************");
	    System.out.println("*** EXERCICIO SOBRE ARRAYS ***");
	    System.out.println("******************************");
	    System.out.println("");
	    
		System.out.print(" - Digite 5 números (separados por espaço): ");
		final String userInts = s.nextLine();
		final String[] numeros = userInts.split(" "); 
		
		if(numeros.length == 5) {
	    
		    final int[] ArrayUsuario = {Integer.parseInt(numeros[0]), 
		    							Integer.parseInt(numeros[1]), 
		    							Integer.parseInt(numeros[2]), 
		    							Integer.parseInt(numeros[3]), 
		    							Integer.parseInt(numeros[4])};
		    meuArray = new MeuArray(ArrayUsuario);
	
			System.out.print("");
			System.out.print(" - Escolha o numero a pesquisar: ");
		    final int pesq = s.nextInt();
		    
		    System.out.println("");
		    System.out.println("***********************************************");
		    System.out.println("");
		    System.out.println("RESULTADO");
		    System.out.println("---------");
		    System.out.println("");
		    System.out.println(" * SOMA DOS NUMEROS         :  " + meuArray.getSum());
		    System.out.println(" * MAIOR NUMERO             :  " + meuArray.getGreater());
		    System.out.println(" * CONTAGEM DO NUMERO  '" + pesq + "'  :  " + meuArray.countNumber(pesq));
		    meuArray.changePosition();
		    System.out.print(" * NOVO ARRAY               :  ");
		    for(int i = 0; i < 5; i++) {
		    	System.out.print(meuArray.getInteiros()[i] + " ");
		    }
		    s.close();
		} else {
			System.out.println("");
			System.out.println("*** ERRO! Era para ter digitado 5 numeros. ***");
		}
	
	}

}

package exercicio.exercicio_01_01;

/* 
 * Faça uma classe chamada Exercicio1 para ler o nome completo de 
 * uma pessoa e imprimir o primeiro e último nomes 
 * - o nome completo deve ter pelo menos dois nomes  
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercicio_1 {

	public static void main(String[] args) throws IOException {

	    InputStreamReader in = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(in);
		
		System.out.print(" - Digite o nome completo: ");
	    final String nomeCompleto = br.readLine();
	    SeparaNomes(nomeCompleto);
	}

	private static void SeparaNomes(String nomeCompleto) {
		String[] nome = nomeCompleto.split(" ");
		System.out.println();
		if (nome.length < 2) {
			System.out.println(" - Atenção: O nome completo deve conter pelo menos 2 nomes.");
		} else {
			System.out.println(" - Primeiro Nome:  " + nome[0]);
			System.out.println(" - Último Nome:  " + nome[nome.length - 1]);
		}
	}

}
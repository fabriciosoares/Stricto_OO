package exercicio_listaArray_01;

import java.io.IOException;
import java.util.Scanner;

/*
 * Defina uma nova classe ProgramaMenu a qual mantém uma variável do 
 * tipo array de Conta e imprime um menu com as opções:
 *       Cadastrar conta
 *       Creditar
 *       Debitar
 *       Transferir
 *       Saldo
 *       Sair
 * O programa deve ficar em loop lendo as opções e executando as operações até que a opção sair seja selecionada. use o comando switch para escolher a opção selecionada pelo usuário, exemplo:
 *
 * switch (opcao) {
 * 		case(1): // pede dados para cadastrar uma conta no array
 * 			break;
 *		case(2): // pede dados para creditar em uma conta
 *			break;
 *		...
 * 		default: // caso nenhum case seja executado
 * }
 *     
 * Compile, execute e teste o programa;
 */

public class ProgramaMenu {
	
	public static void main(String[] args) throws IOException {
		
		Scanner s = new Scanner(System.in);

		Conta[] arrayConta;
		
		System.out.println("****************************");
		System.out.println("***   SISTEMA BANCARIO   ***");
		System.out.println("****************************");
		System.out.println();
		System.out.println(" - MENU PRINCIPAL:");
		System.out.println();
		System.out.println("01 - Cadastrar Conta");
		System.out.println("02 - Creditar");
		System.out.println("03 - Debitar");
		System.out.println("04 - Transferir");
		System.out.println("05 - Saldo");
		System.out.println("06 - Sair");
		System.out.println();
		System.out.print(" - Digite a opção desejada:  ");
		int opcao = s.nextInt();
		System.out.println();
		
		switch (opcao) {
			case(1):
				System.out.println(" - Digite o número da conta");
				int numero = s.nextInt();
				arrayConta = new Conta(numero);
				break;
			case(2):
				// pede dados para creditar em uma conta
				break;
			case(2):
				// pede dados para creditar em uma conta
				break;
			case(2):
				// pede dados para creditar em uma conta
				break;
			case(2):
				// pede dados para creditar em uma conta
				break;
			case(2):
				// pede dados para creditar em uma conta
				break;
			default:
			 // caso nenhum case seja executado
		}
		
		
	}
}
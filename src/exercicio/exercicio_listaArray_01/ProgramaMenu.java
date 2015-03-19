package exercicio.exercicio_listaArray_01;

import java.io.IOException;
import java.text.DecimalFormat;
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
 * O programa deve ficar em loop lendo as opções e executando as operações
 * até que a opção sair seja selecionada. use o comando switch para escolher
 * a opção selecionada pelo usuário, exemplo:
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
		Conta[] arrayConta = new Conta[4];
		int contador = 1;
		String numero;
		double valor;
		DecimalFormat df = new DecimalFormat("0.00");  
		String valorFormatado;
		
		while (contador > 0) {
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
					System.out.print(" - Digite o número da conta para cadastrar:  ");
					numero = s.next();
					arrayConta[contador] = new Conta(numero);
					for(int i = 0; i < 25; i++) {
						System.out.println();
					}
				    System.out.println("*** Conta " + arrayConta[contador].getNumero() + " cadastrada com sucesso (Saldo: R$ " + arrayConta[contador].getSaldo() + ")");
					System.out.println();
				    break;
				case(2):
					System.out.print(" - Digite o número da conta para crédito:  ");
					numero = s.next();
					for(int i = 1; i <= contador - 1; i++) {
						if (arrayConta[i].getNumero() == numero) {
							System.out.println(" - Digite o valor para crédito (só será computado até a 2a casa decimal):  R$ ");
							valor = s.nextDouble();
							valorFormatado = df.format(valor);
							arrayConta[contador].creditar(Double.parseDouble(valorFormatado));
							for(int j = 0; j < 25; j++) {
								System.out.println();
							}
						    System.out.println("*** Crédito Confirmado na Conta " + arrayConta[contador].getNumero() + " (Saldo: R$ " + arrayConta[contador].getSaldo() + ")");
							System.out.println();
							break;
						}
						System.out.println("*** Número da Conta Errado! Favor Digitar Novamente.  ");
						System.out.println();
					}
					break;
//				case(3):
//					System.out.print(" - Digite o número da conta para dédito:  ");
//					numero = s.next();
//					System.out.println(" - Digite o valor para dédito (só será computado até a 2a casa decimal):  R$ ");
//					valor = s.nextDouble();
//					valorFormatado = df.format(valor);
//					arrayConta[contador] = new Conta(numero);
//					arrayConta[contador].debitar(Double.parseDouble(valorFormatado));
	//				for(int i = 0; i < 25; i++) {
//						System.out.println();
//					}
//				    System.out.println("*** Dédito Confirmado na Conta " + arrayConta[contador].getNumero() + " (Saldo: R$ " + arrayConta[contador].getSaldo() + ")");
//					System.out.println();
//				    break;
//				case(4):
					// pede dados para creditar em uma conta
//					break;
//				case(5):
// pede dados para creditar em uma conta
//					break;
//				case(2):
					// pede dados para creditar em uma conta
//					break;
//				default:
				 // caso nenhum case seja executado
			}
			contador++;
		}
		s.close();
	}
}
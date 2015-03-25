package exercicio.exercicio_listaArray_01;

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
					for (int i = 0; i < 25; i++) {
						System.out.println();
					}
				    System.out.println("*** Conta " + arrayConta[contador].getNumero() + " cadastrada com sucesso (Saldo: R$ " + arrayConta[contador].getSaldo() + ")");
				    contador++;
				    System.out.println();
				    break;
				case(2):
					System.out.print(" - Digite o número da conta para crédito:  ");
					numero = s.next();
					for (int i = 1; i < contador; i++) {
						if (arrayConta[i].getNumero().equals(numero)) {
							System.out.print(" - Digite o valor para crédito (só será computado até a 2a casa decimal):  R$ ");
							valor = s.nextDouble();
							arrayConta[i].creditar(valor);
							for(int j = 0; j < 25; j++) {
								System.out.println();
							}
						    System.out.print("*** Crédito Confirmado na Conta " + arrayConta[i].getNumero() + " ( Saldo: R$ ");
						    System.out.printf("%.2f", arrayConta[i].getSaldo());
						    System.out.println(" )");
							System.out.println();
							break;
						}
						System.out.println("*** Número da Conta Errado! Favor Digitar Novamente.  ");
						System.out.println();
					}
					break;
				case(3):
					System.out.print(" - Digite o número da conta para débito:  ");
					numero = s.next();
					for (int i = 1; i < contador; i++) {
						if (arrayConta[i].getNumero().equals(numero)) {
							System.out.print(" - Digite o valor para débito (só será computado até a 2a casa decimal):  R$ ");
							valor = s.nextDouble();
							arrayConta[i].debitar(valor);
							for(int j = 0; j < 25; j++) {
								System.out.println();
							}
						    System.out.print("*** Débito Confirmado na Conta " + arrayConta[i].getNumero() + " ( Saldo: R$ ");
						    System.out.printf("%.2f", arrayConta[i].getSaldo());
						    System.out.println(" )");
							System.out.println();
							break;
						}
						System.out.println("*** Número da Conta Errado! Favor Digitar Novamente.  ");
						System.out.println();
					}
					break;
				case(4):
					System.out.print(" - Digite o número da conta para débitar a transferência:  ");
					numero = s.next();
					for (int i = 1; i < contador; i++) {
						if (arrayConta[i].getNumero().equals(numero)) {
							System.out.print(" - Digite o valor da transferência (só será computado até a 2a casa decimal):  R$ ");
							valor = s.nextDouble();
							System.out.println(" - Digite o número da conta para creditar a transferência:  ");
							String numeroCredito;
							numeroCredito = s.next();
							for (int k = 0; k < contador; k++) {
								if (arrayConta[k].getNumero().equals(numeroCredito)) {
									arrayConta[i].debitar(valor);
									arrayConta[k].creditar(valor);
								}
								for(int j = 0; j < 25; j++) {
									System.out.println();
								}
							    System.out.println("*** Transferência Confirmado:  ");
							    System.out.print("         - Conta Debitada " + arrayConta[i].getNumero() + " ( Saldo: R$ ");
							    System.out.printf("%.2f", arrayConta[i].getSaldo());
							    System.out.print("         + Conta Creditada " + arrayConta[k].getNumero() + " ( Saldo: R$ ");
							    System.out.printf("%.2f", arrayConta[i].getSaldo());
							    System.out.println(" )");
								System.out.println();
							}
							break;
						}
						System.out.println("*** Número da Conta Errado! Favor Digitar Novamente.  ");
						System.out.println();
					}
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
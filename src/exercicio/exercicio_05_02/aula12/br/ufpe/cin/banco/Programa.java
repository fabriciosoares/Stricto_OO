package exercicio.exercicio_05_02.aula12.br.ufpe.cin.banco;

import java.io.IOException;

/*
 * Modifique a classe Bancoda aula passada para que seja possível render
 * juros de uma poupança.
 * 		- Adicione em Bancoo método renderJurosque recebe o número da
 * 		    poupança por parâmetro
 * 		- a taxa de juros deve ser um atributo de Banco.
 * 
 * Defina aula12.br.ufpe.cin.banco.ContaEspecialque herda de Contae tem
 * um atributo bonus. Defina ainda seu construtor e os métodos
 * renderBonuse getBonus
 * 
 *  Modifique a classe Bancopara que seja possível computar o bônus de
 *  uma ContaEspecial. O método renderBonus de Banco deve receber o
 *  número da ContaEspecial.
 *  
 *  Crie o método transferirna classe Bancoque recebe dois números de
 *  conta um valor e transfere o valor entre as contas
 *  
 *  Altere a classe a classe Programapara testar a nova classe e os
 *  novos métodos de Banco
 *  
 *  Se necessário, utilize a solucão da aula passada  
 */

public class Programa {

	public static void main(String[] args) throws IOException {
		Conta conta1 = new Conta("1234", 100.0);
		Conta conta2 = new Conta("1357", 150.0);
		Conta conta3 = new Conta("2468", 230.0);
		Banco banco = new Banco();
		
		banco.cadastrar(conta1);
		banco.creditar(conta1, 250.50); 
		banco.debitar(conta1, 37.28);
		
		banco.cadastrar(conta2);
		banco.creditar(conta2, 75.37); 
		banco.debitar(conta2, 6.03);
		
		banco.cadastrar(conta3);
		banco.creditar(conta3, 128.45); 
		banco.debitar(conta3, 234.89);
		
		System.out.println(" - Saldo da Conta " + conta1.getNumero() +
				": R$ " + banco.getSaldo(conta1));
		System.out.println(" - Saldo da Conta " + conta2.getNumero() +
				": R$ " + banco.getSaldo(conta2));
		System.out.println(" - Saldo da Conta " + conta3.getNumero() +
				": R$ " + banco.getSaldo(conta3));
		
		System.out.println();
		System.out.println("**************************");
		System.out.println();
		
		Conta conta4 = new Poupanca("0987");
		Conta conta5 = new ContaEspecial("9753", 570.00);
		
		banco.cadastrar(conta4);
		banco.creditar(conta4, 200.00);
		banco.renderJuros("0987", 2.3);
		
		banco.cadastrar(conta5);
//		banco.renderBonus("0987", 180.00);
		banco.renderBonus("9753", 145.00);
		
		banco.transferir("2468", "0987", 57.00);
		
		System.out.println(" - Saldo da Conta " + conta3.getNumero() +
				": R$ " + banco.getSaldo(conta3));	
		System.out.println(" - Saldo da Poupança " + conta4.getNumero() +
				": R$ " + banco.getSaldo(conta4));
		System.out.println(" - Saldo da ContaEspecial " + conta5.getNumero() +
				": R$ " + banco.getSaldo(conta5));
		
		System.out.println();
		
		System.out.println(" - Bonus da ContaEspecial " + conta5.getNumero() +
				": R$ " + ((ContaEspecial) conta5).getBonus());
		
	}

}

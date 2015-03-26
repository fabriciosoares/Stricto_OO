package exercicio.exercicio_06_02.aula14.br.ufpe.cin.banco;

import java.io.IOException;

/*
 * - Utilize a solução do último exercício
 * 
 * - Defina no pacote aula13.br.ufpe.cin.banco, a classe abstrata
 *     ContaAbstrata que tem os mesmos atributos e métodos de Conta,
 *     só que o método debitar é abstrato, como visto em sala
 *     
 * - Altere a classe Conta para herdar da classe ContaAbstrata e
 *     implementar o método debitar
 *     
 * - Modifique a classe Banco para que seja possível trabalhar com
 *     todos os tipos de conta da aplicação bancária. Execute a
 *     classe Programa e observe que o teste funciona como antes
 *     
 * - Defina a classe aula13.br.ufpe.cin.banco.ContaImposto que
 *     herda de ContaAbstrata e tem uma constante CPMF que armazena
 *     o imposto a ser cobrado quando um valor for debitado na 
 *     ContaImposto 
 *     
 * - É necessário alterar as classes Poupanca e ContaEspecial?
 * 
 * - Altere a classe Programa para testar todas as classes do projeto  
 */

public class Programa {

	public static void main(String[] args) throws IOException {
		ContaAbstrata conta1 = new Conta("1234", 100.00);
		ContaAbstrata conta2 = new Conta("1357", 150.00);
		ContaAbstrata conta3 = new Conta("2468", 230.00);
		Banco banco = new Banco();
		
		banco.getRepositorio().inserir(conta1);
		banco.getRepositorio().creditar(conta1, 250.50); 
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
		
		System.out.println();
		System.out.println("**************************");
		System.out.println();
		
		ContaAbstrata conta6 = new ContaImposto("4321", 450.00);
		banco.cadastrar(conta6);
		banco.creditar(conta6, 100.00); 
		banco.debitar(conta6, 50.00);
		
		System.out.println(" - Saldo da Conta " + conta6.getNumero() +
				": R$ " + banco.getSaldo(conta6));
		
	}

}

package exercicio.exercicio_05_02.aula11.br.ufpe.cin.banco;

/*
 * Defina as classes:
 * 
 * * aula11.br.ufpe.cin.banco.Conta com:
 * 		— Atributos: numero(String) e saldo(double)
 * 		— Construtor que recebe o número como parâmetro e inicializa 
 *   	   o saldo sempre com zero
 * 		— Métodos: creditar, debitare getpara os atributos
 *  
 * * aula11.br.ufpe.cin.banco.Poupanca que herda de Conta
 * 		— Define um construtor que recebe o número como parâmetro 
 * 		   e chama o construtor da superclasse
 * 		— Define o método renderJurosque recebe a taxa de juros 
 * 		   como parâmetro e rende o juros (como na aula)
 * 
 * * aula11.br.ufpe.cin.banco.Banco:
 * 		- Com os seguintes atributos (sempre private):
 *    		— contas – um array de Conta
 *    		— indice – um inteiro que guarda o índice 
 *    	       do array onde será inserido a próxima Conta (inicia 
 *    	   	   pelo índice zero)
 *    	- Um construtor que inicializa o array com 100 posições e o
 *    	   indicecom zero 
 *    	- Os métodos (lembre-se de usar o atributo indice):
 *    		— cadastrar – recebe uma Contae insere no array
 *    		— creditar – recebe o numero de uma conta e o valor a
 *    			ser creditado e faz o crédito na conta do array
 *    		— debitar - recebe o número e o valor a ser debitado
 *    		— getSaldo – recebe o número da conta e retorna o saldo
 *    
 * * aula11.br.ufpe.cin.banco.Programa com um método main que 
 *    testa os metodos da classe Banco pelo menos três vezes.
 *    
 */

public class Programa {

	public static void main(String[] args) {
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
	}

}

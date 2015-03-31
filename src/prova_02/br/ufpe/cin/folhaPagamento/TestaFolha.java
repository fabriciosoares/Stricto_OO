package prova_02.br.ufpe.cin.folhaPagamento;

/*
 * (1) Considere uma aplica��o de folha de pagamento que possui a rela��o de todos os funcion�rios 
 * de uma empresa. Atualmente a aplica��o armazena apenas dados sobre os funcion�rios da empresa. 
 * Considere a classe Funcionario definida na p�gina 2. Agora, voc� foi contratado para fazer uma 
 * modifica��o na aplica��o de controle de pagamento. Agora, a empresa cresceu e possui diferentes 
 * pol�ticas de sal�rio para diferentes tipos de funcion�rio, e a folha de pagamento deve considerar 
 * os mesmos. Al�m dos funcion�rios que possuem nome, cpf e sal�rio, a empresa tem vendedores, que 
 * possuem o total de vendas realizadas (em reais) e o percentual de comiss�o (um valor real), e 
 * diretores, que possuem uma gratifica��o fixa (em reais) sobre o sal�rio. O c�lculo do sal�rio 
 * dos funcion�rios deve ser feito por um m�todo calcularSalario, que no caso do funcion�rio comum 
 * apenas retorna o salario, para o vendedor retorna a soma do sal�rio ao percentual da comiss�o 
 * sobre as vendas, e para o gerente retorna a soma do sal�rio a gratifica��o. Al�m disso, o 
 * funcion�rio tem um m�todo iniciaMes que zera o valor das vendas do funcion�rio. 
 * 
 * (2) Ao implementar a 1a vers�o da aplica��o de folha de pagamento, os desenvolvedores n�o se 
 * preocuparam em tornar o c�digo de neg�cio independente dos c�digo de armazenamento de dados. 
 * Considerando a defini��o da classe RepositorioFuncionariosArray na p�gina 2, implemente uma 
 * interface para a classe reposit�rio, de modo que a classe possa ser desacoplada do 
 * CadastroFuncionarios (tamb�m na p�gina 2). O que se espera � que a classe cadastro possa usar 
 * apenas a interface declarada, mudando apenas a declara��o do atributo e seu construtor 
 * (linhas 3 e 4), sem mudar mais nenhuma das linhas.
 * 
 * (3) Implemente as classes de exce��o FuncionarioNaoEncontradoException, utilizada pela classe 
 * RepositorioFuncionariosArray, e FuncionarioJaCadastradoException, utilizada pela classe 
 * CadastroFuncionarios, vide a p�gina 2.
 * 
 * (4) Descreva um outro exemplo de subclasse para Funcionario ou Vendedor justificando por que 
 * o exemplo � de subclasse. Implemente a subclasse.
 */

public class TestaFolha {

	public static void main(String[] args) throws FuncionarioNaoEncontradoException, FuncionarioJaCadastradoException {
		
		System.out.println();
		System.out.println("QUEST�O 01:");
		System.out.println("===========");
		System.out.println();

		Funcionario func1 = new Funcionario("Paulo Victor", "11111", 1000);
		Funcionario func2 = new Vendedor("Par�", "22222", 1200);
		Funcionario func3 = new Diretor("Wallace", "33333", 2500);
		
		((Vendedor) func2).iniciaMes();
		((Vendedor) func2).acumulaVenda(200);
		((Vendedor) func2).acumulaVenda(300);
		((Vendedor) func2).acumulaVenda(500);
		((Vendedor) func2).setPercentualComissao(2);
		
		((Diretor) func3).setGratificacao(800);
		
		System.out.println();
		System.out.println("- JANEIRO:");
		System.out.println();
		System.out.print("- " + func1.getNome() + ": R$ ");
		System.out.printf("%.2f", func1.calcularSalario());
		System.out.println();
		System.out.print("- " + func2.getNome() + ": R$ ");
		System.out.printf("%.2f", func2.calcularSalario());
		System.out.println();
		System.out.print("- " + func3.getNome() + ": R$ ");
		System.out.printf("%.2f", func3.calcularSalario());
		System.out.println();
		
		((Vendedor) func2).iniciaMes();
		((Vendedor) func2).acumulaVenda(200);
		((Vendedor) func2).acumulaVenda(200);
		((Vendedor) func2).setPercentualComissao(1.5);
		
		((Diretor) func3).setGratificacao(600);
		
		System.out.println();
		System.out.println("- FEVEREIRO:");
		System.out.println();
		System.out.print("- " + func1.getNome() + ": R$ ");
		System.out.printf("%.2f", func1.calcularSalario());
		System.out.println();
		System.out.print("- " + func2.getNome() + ": R$ ");
		System.out.printf("%.2f", func2.calcularSalario());
		System.out.println();
		System.out.print("- " + func3.getNome() + ": R$ ");
		System.out.printf("%.2f", func3.calcularSalario());
		System.out.println();
		
		// ================================================================================
		
		System.out.println();
		System.out.println("QUEST�O 02:");
		System.out.println("===========");
		System.out.println();

		RepositorioFuncionario rep1 = new RepositorioFuncionariosArray(10);
		
		CadastroFuncionarios cadastro = new CadastroFuncionarios(rep1);
		
		rep1.inserir(func1);
		Funcionario func4 = new Funcionario("Samir", "44444", 1000);
		Funcionario func5 = new Funcionario("C�ceres", "55555", 1000);
		rep1.inserir(func4);
		rep1.inserir(func5);
		
		System.out.println(" - Funcion�rio Procurado: " + cadastro.procurar("55555").getNome());
		
		rep1.inserir(func2);
		Funcionario func6 = new Funcionario("Anderso Pico", "66666", 1000);
		Funcionario func7 = new Funcionario("Gabriel", "77777", 1000);
		rep1.inserir(func6);
		rep1.inserir(func7);
		
		System.out.println(" - Vendedor Procurado: " + cadastro.procurar("77777").getNome());
		
		// ================================================================================
		
		System.out.println();
		System.out.println("QUEST�O 03:");
		System.out.println("===========");
		System.out.println();

//		cadastro.cadastrar(func1);
//		cadastro.procurar("12345");
//		cadastro.remover("09876");
//		rep1.procurar("09876");
//		rep1.remover("67890");
		System.out.println(rep1.existe("48489"));

		// ================================================================================
				
		System.out.println();
		System.out.println("QUEST�O 04:");
		System.out.println("===========");
		System.out.println();

		Funcionario func8 = new Funcionario("Canteros", "88888", 4500);
		rep1.inserir(func8);
		System.out.println();
		System.out.println("- Funcion�rio Procurado: " + rep1.procurar("11111").getNome());
		System.out.println();
		
		// ================================================================================
		
	}
	
}
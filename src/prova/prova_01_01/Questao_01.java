package prova.prova_01_01;

/*  
 * 1) Os dados das folhas de pagamento dos funcionários de uma empresa foram 
 * totalmente embaralhados, mas os números que representam os salários estão
 * intactos. Você foi designado a obter o custo de todos os salários, a fim
 * de reservar o dinheiro necessário no fim do mês, ou seja, somar os
 * números. Crie uma classe com um método que realiza este processamento.
 * O método recebe um array de String onde cada String é uma linha do
 * arquivo embaralhado e retorna um int com a soma dos valores de todas as 
 * linhas. Por exemplo, se os valores dos String da entrada forem
 * “123abc123”, “asd2675hsd1887asd565askvLOL900xD99” e “wdd678mdf898”, a
 * resposta deve ser 7948, que é a soma de 246 (123+123) com 6126
 * (2675+1887+565+900+99) e 1576 (678+898).
 */

public class Questao_01 {
	
	public int somaSalario(String[] tupla) {
		int soma = 0;
		for(int i = 0; i < tupla.length; i++){
			String[] linha = tupla[i].split("[a-zA-Z]");
			for(int j = 0; j < linha.length; j++){
				if (!linha[j].equals("")) {
					soma = soma + Integer.parseInt(linha[j]);
				}
			}
		}
		return soma;
	}
}
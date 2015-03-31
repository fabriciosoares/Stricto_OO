package prova_01.br.ufpe.cin.salario;

import java.io.IOException;

public class TestaSalario {
	
	public static void main(String[] args) throws IOException {
		
		String[] tupla = {"123abc123", "asd2675hsd1887asd565askvLOL900xD99", "wdd678mdf898"};
		Salario questao_01 = new Salario();
		System.out.println(questao_01.somaSalario(tupla));
		
	}

}
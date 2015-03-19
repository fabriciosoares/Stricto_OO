package exercicio.exercicio_02_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * - Crie uma classe Curso com código e nome
 * - Crie uma classe Aluno, contendo nome, cpf, idade e o Curso que o aluno 
 *   frequenta
 * - Lembre-se de criar um construtor, bem como os métodos get e set para as 
 *   classes
 * - Crie uma classe TestaAluno para testar as classes criada (essa classe 
 *   tem o main) 
 */

public class TestaAluno {
	
	public static void main(String[] args) throws IOException {
		
		final Aluno aluno;
		final Curso curso;
		
	    InputStreamReader in = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(in);
	    
	    System.out.println("INSCRIÇÃO DO ALUNO");
	    System.out.println("--------- -- -----");
	    System.out.println("");
		
		System.out.print(" - Digite o nome completo do Aluno: ");
	    final String nomeAluno = br.readLine();
	    
		System.out.print(" - Digite o cpf do Aluno: ");
	    final String cpfAluno = br.readLine();

	    System.out.print(" - Digite a idade do Aluno: ");
	    final int idadeAluno =  Integer.parseInt(br.readLine());
	    
		System.out.print(" - Digite o codigo do Curso: ");
	    final int codigoCurso =  Integer.parseInt(br.readLine());    
	    
		System.out.print(" - Digite o nome do Curso: ");
	    final String nomeCurso = br.readLine();    

	    curso = new Curso(codigoCurso, nomeCurso);
	    aluno = new Aluno(nomeAluno, cpfAluno, idadeAluno, curso);
	    
	    System.out.println("");
	    System.out.println("***********************************************");
	    System.out.println("");
	    System.out.println("FICHA DO ALUNO");
	    System.out.println("----- -- -----");
	    System.out.println("");
	    System.out.println(" * NOME:  " + aluno.getNome());
	    System.out.println(" * CPF:   " + aluno.getCpf());
	    System.out.println(" * IDADE: " + aluno.getIdade());
	    System.out.println("------------------------------------------------");
	    System.out.println(" * CURSO: " + aluno.getCurso().getCodigo() + " - " + aluno.getCurso().getNome());
	    
	    
	}

}

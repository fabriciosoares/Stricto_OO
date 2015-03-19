package exercicio.exercicio_02_01;

public class Aluno {

	private String nome;
	private String cpf;
	private int idade;
	private Curso curso;
	
	// Metodo Construtor
	public Aluno(String nome, String cpf, int idade, Curso curso) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.curso = curso;
	}
	
	// Metodos Gets
	public String getNome() { return nome; 	}
	public String getCpf() { return cpf; }
	public int getIdade() { return idade; }
	public Curso getCurso() { return curso; }
	
	// Metodos Sets
	public void setNome(String nome) { this.nome = nome; }
	public void setCpf(String cpf) { this.cpf = cpf; }
	public void setIdade(int idade) { this.idade = idade; }
	public void setCurso(Curso curso) { this.curso = curso; }
	
}

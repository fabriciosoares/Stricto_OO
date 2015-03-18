package exercicio_02_01;

public class Curso {
	
	private int codigo;
	private String nome;
	
	// Metodo Construtor
	public Curso(int codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}
	
	// Metodos Gets
	public int getCodigo() { return codigo; }
	public String getNome() { return nome; }
	
	// Metodos Sets
	public void setCodigo(int codigo) { this.codigo = codigo; }
	public void setNome(String nome) { this.nome = nome; }

}

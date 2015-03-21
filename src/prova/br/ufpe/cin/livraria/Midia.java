package prova.br.ufpe.cin.livraria;


/* 2) Uma livraria deseja desenvolver um sistema para cadastrar todos os livros comercializados
 * pela empresa. O sistema deve conter uma classe chamada br.ufpe.cin.livraria.Midia, utilizada
 * para representar os livros, com as seguintes características:
 *  
 *  a. Possui os atributos:
 *  	I. codigo – String com o código da mídia;
 *  	II. titulo – String com o título da mídia;
 *  	III. autores – array de String com o nome dos autores da mídia;
 *  	IV. estoque – inteiro com a quantidade de mídias em estoque;
 *  
 *  b. O construtor da classe recebe o código da mídia, o título e o array de autores. Toda
 *  mídia é cadastrada com valor de estoque igual a zero, indicando que ainda não existe um 
 *  exemplar da mídia em estoque.
 *  
 *  c. Possui um método chamado toString, que retorna um String formatado com todos os atributos 
 *  para, por exemplo, serem impressos na tela do terminal de vídeo. Atenção, o seu método apenas
 *  retorna o String, não deve imprimir na tela.
 *  
 *  d. Possui um método chamado adicionarEstoque, que recebe um int, referente à quantidade de 
 *  mídias adquiridas e soma esse valor ao valor atual do estoque.
 *  
 *  e. Possui um método chamado subtrairEstoque, que recebe um int, referente à quantidade de 
 *  mídias vendidas e subtrai esse valor do valor atual do estoque.
 *  
 *  f. Implemente os métodos get e set apenas para o atributo codigo.
 */  

public class Midia {

	private String codigo;
	private String titulo;
	private String[] autores;
	private int estoque;
	
	//Método Construtor
	public Midia(String codigo, String titulo, String[] autores) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.autores = autores;
		this.estoque = 0;
	}
	public Midia(){};
	
	//Gets e Sets	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	//Outros Métodos
	public String toString() {
		String tela;
		tela = " - Codigo: " + this.codigo + "\n - Título: " + this.titulo;
		for(int i = 0; i < this.autores.length; i++) {
			tela = tela + "\n - Autor " + (i + 1) + ": " + autores[i];
		}
		tela = tela + "\n - Qtd Estoque: " + this.estoque;
		return tela;
	}
	
	public void adicionarEstoque(int acrescimo) {
		this.estoque = this.estoque + acrescimo;
	}
	
	public void subtrairEstoque(int decrescimo) {
		this.estoque = this.estoque - decrescimo;
	}
}
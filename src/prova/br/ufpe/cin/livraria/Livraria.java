package prova.br.ufpe.cin.livraria;

/*
 * 4) Implemente a classe br.ufpe.cin.livraria.Livraria, que possui um atributo do tipo
 * br.ufpe.cin.livraria.RepositorioMidiaArray. Além do construtor, crie dois métodos na classe
 * Livraria: 
 * (i) o método cadastrar recebe um objeto Midia e insere no repositório se não houver uma mídia
 * no repositório com o mesmo código; 
 * (ii) o método procurar recebe um código e procura pela mídia com o respectivo código no
 * repositório.
 */

public class Livraria {
	
	RepositorioMidiaArray repositorio;
	
	//Método Construtor
	public Livraria(int tamanho) {
		this.repositorio = new RepositorioMidiaArray(tamanho);
	}
	
	public void cadastrar(Midia midia) {
		if (this.repositorio.existe(midia.getCodigo()) == false) {
			this.repositorio.inserir(midia);
		}
	}
		
	public Midia procurar(String codigo) {
		return this.repositorio.procurar(codigo);
	}

}
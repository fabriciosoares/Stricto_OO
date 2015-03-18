package exercicio_01_03;

/*
 * - Crie uma classe Produto para representar produtos de supermecado
 * 
 * - Cada produto tem uma descri��o (texto), valor (real) e quantidade 
 * em estoque (inteiro)
 * 
 * - Lembre-se de definir m�todos para ler e alterar os atributos dos produtos 
 * 
 */

public class Produto {
	
	private String descricao;
	private double valor;
	private int quantidade;
	
	// Metodos Gets
	
	public String getDescricao() { return descricao; }
	public double getValor() { return valor; }
	public int getQuantidade() { return quantidade; }
	
	// metodos Sets
	
	public void setDescricao(String descricao) { this.descricao = descricao; }
	public void setValor(double valor) { this.valor = valor; }
	public void setQuantidade(int quantidade) { this.quantidade = quantidade; }
	
}

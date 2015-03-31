package prova_02.br.ufpe.cin.folhaPagamento;

/*
 * Esta a classe "Seguranca" � uma subclasse da superclasse "Funcionario" porque, como o seguran�a trabalha
 * em hor�rio noturno, apenas ele tem um percentual fixo aplicado sobre o sal�rio (constante "ADICIONALNOTURNO")
 */

public class Seguranca extends Funcionario {

	final double ADICIONALNOTURNO;
	
	// Construtor
	public Seguranca(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
		this.ADICIONALNOTURNO = 12.5;
	}
	
	public double calcularSalario () {
		return super.getSalario() + ((super.getSalario() * this.ADICIONALNOTURNO) / 100);
	}
}

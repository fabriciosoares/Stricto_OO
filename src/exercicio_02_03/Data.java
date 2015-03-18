package exercicio_02_03;

/*
 * Defina uma classe chamada Data, para representar datas consistindo em dia, 
 * m�s e ano, com tr�s construtores:
 * 
 *  - Um que recebe inteiros relativos ao dia, ao m�s e ao ano
 *  - Um que recebe apenas o ano e o m�s e considera que este � o primeiro 
 *    dia do m�s
 *  - Um que recebe outro objeto do tipo Data e cria um novo objeto que 
 *    representa a mesma data
 *    
 *  Os dois �ltimos construtores devem simplesmente usar o primeiro 
 */

public class Data {

	private int dia;
	private int mes;
	private int ano;
	
	// Metodos Construtores
	public Data(int dia, int mes, int ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public Data(int mes, int ano) {
		this(01, mes, ano);
	}
	
	public Data(Data data) {
		this(data.dia, data.mes, data.ano);
	}
	
}

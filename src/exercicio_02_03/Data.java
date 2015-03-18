package exercicio_02_03;

/*
 * Defina uma classe chamada Data, para representar datas consistindo em dia, 
 * mês e ano, com três construtores:
 * 
 *  - Um que recebe inteiros relativos ao dia, ao mês e ao ano
 *  - Um que recebe apenas o ano e o mês e considera que este é o primeiro 
 *    dia do mês
 *  - Um que recebe outro objeto do tipo Data e cria um novo objeto que 
 *    representa a mesma data
 *    
 *  Os dois últimos construtores devem simplesmente usar o primeiro 
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

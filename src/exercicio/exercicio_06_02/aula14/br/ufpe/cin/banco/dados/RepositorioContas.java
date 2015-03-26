package exercicio.exercicio_06_02.aula14.br.ufpe.cin.banco.dados;

import exercicio.exercicio_06_02.aula14.br.ufpe.cin.banco.ContaAbstrata;

public interface RepositorioContas {
	void inserir (ContaAbstrata conta);
	ContaAbstrata procurar (String numero);
	void remover (String numero);
	void atualizar (ContaAbstrata conta);
	boolean existe (String numero);
}
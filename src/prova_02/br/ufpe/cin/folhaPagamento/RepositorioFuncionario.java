package prova_02.br.ufpe.cin.folhaPagamento;

public interface RepositorioFuncionario {

	void inserir(Funcionario funcionario);
	Funcionario procurar(String cpf) throws FuncionarioNaoEncontradoException;
	void remover(String cpf) throws FuncionarioNaoEncontradoException ;
	boolean existe(String cpf);
	
}
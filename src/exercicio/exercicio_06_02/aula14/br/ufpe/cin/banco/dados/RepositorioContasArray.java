package exercicio.exercicio_06_02.aula14.br.ufpe.cin.banco.dados;

import exercicio.exercicio_06_02.aula14.br.ufpe.cin.banco.ContaAbstrata;

public class RepositorioContasArray implements RepositorioContas {

	private ContaAbstrata[] contas;
	private int indice;
	 
	public RepositorioContasArray() {
		this.contas = new ContaAbstrata[100];
		this.indice = 0;
	}
	
	public void inserir(ContaAbstrata conta) {
		this.contas[this.indice] = conta;
		this.indice++;
	}

	public ContaAbstrata procurar(String numero) {
		boolean achou = false;
		ContaAbstrata contaProcurada = null;
		
		for(int i = 0; i < this.indice; i++) {
			if(this.contas[i].getNumero() == numero) {
				achou = true;
				contaProcurada = contas[i];
			}
		}
		if (achou == true) {
			return contaProcurada;
		} else {
			throw new RuntimeException("Erro: Conta não localizada");
		}
	}

	public void remover(String numero) {
		int apaga = 0;
		for (int i = 0; i < this.indice; i++) {
			if (apaga == 0) {
				if (this.contas[i].getNumero().equals(numero)) {
					indice--;
					this.contas[i] = this.contas[this.indice];
					this.contas[indice] = null;
					apaga = 1;
				}
			}
		}
	}

	public void atualizar(ContaAbstrata conta) {
		boolean achou = false;
		for(int i = 0; i < this.indice && achou == false; i++) {
			if(this.contas[i].getNumero() == conta.getNumero()) {
				achou = true;
				this.contas[i] = conta;
			}
		}
	}

	public boolean existe(String numero) {
		boolean achou = false;
		for(int i = 0; i < this.indice; i++) {
			if(this.contas[i].getNumero() == numero) {
				achou = true;
			}
		}
		return achou;
	}

}
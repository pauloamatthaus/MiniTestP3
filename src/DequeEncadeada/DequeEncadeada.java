package DequeEncadeada;

public class DequeEncadeada {
	private Conta inicio;
	private int posicao;
	
	public void insertFront(Conta conta) {
		if(this.inicio == null) {
			this.inicio = conta;
		}else {
			Conta temp = this.inicio;
			this.inicio = conta;
			this.inicio.setProximo(temp);
		}
		posicao++;
	}
	
	public void insertLast(Conta conta) {
		if(this.inicio == null) {
			this.inicio = conta;
		}else {
			Conta temp = this.inicio;
			while(temp.getProximo() != null) {
				temp = temp.getProximo();
			}
			temp.setProximo(conta);
		}
		posicao++;
	}
	
	public void deleteFront() {
		if(this.inicio == null) {
			throw new NullPointerException();
		}else {
			this.inicio = this.inicio.getProximo();
		}
		posicao--;
	}
	
	public void deleteLast() {
		if(posicao == 0) {
			throw new NullPointerException();
		}else if(posicao == 1) {
			this.inicio = null;
		}else if(posicao > 1) {
			Conta temp = this.inicio;
			while(temp.getProximo().getProximo() != null) {
				temp = temp.getProximo();
			}
			temp.setProximo(null);
		}
		posicao--;
	}
	
	public int getFront() {
		return this.inicio.getNumero();
	}
	
	public int getReare() {
		Conta temp = this.inicio;
		while(temp.getProximo() != null) {
			temp = temp.getProximo();
		}
		return temp.getNumero();
	}
	
	public int size() {
		return posicao;
	}
	
	public boolean isEmpty() {
		return posicao == 0;
	}
	
}

package FilaEncadeada;

public class FilaEncadeada {
	private Conta inicio;
	private int posicao;
	
	public void enqueue(Conta conta) {
		if(this.inicio == null) {
			this.inicio = conta;
			posicao ++;
		}else {
			Conta temp = this.inicio;
			while(temp.getProximo() != null) {
				temp = temp.getProximo();
			}
			temp.setProximo(conta);
			posicao++;
		}
	}
	
	public void dequeue() {
		if(this.inicio == null) {
			throw new NullPointerException();
		}else {
			this.inicio = this.inicio.getProximo();
			posicao --;
		}
	}
	
	public int size() {
		return posicao;
	}
	
	public int getFront() {
		return this.inicio.getNumero();
	}
	
	public int getReare() {
		if(this.inicio == null) {
			throw new NullPointerException();
		}
		Conta temp = this.inicio;
		while(temp.getProximo() != null) {
			temp = temp.getProximo();
		}
		return temp.getNumero();
	}
	
	public boolean isEmpty() {
		return this.inicio == null;	
	}
}

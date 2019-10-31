package PilhaEncadeada;

public class Conta {
	private int numero;
	private Conta proximo;
	
	public Conta (int numero) {
		this.numero = numero;
		
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Conta getProximo() {
		return proximo;
	}

	public void setProximo(Conta proximo) {
		this.proximo = proximo;
	}
}

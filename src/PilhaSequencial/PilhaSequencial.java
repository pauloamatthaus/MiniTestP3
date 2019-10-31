package PilhaSequencial;

public class PilhaSequencial {
	public static final int SIZE = 3;
	private Object[]objetos = new Object[SIZE];
	private int posicao;
	
	public void push(Object o){
		if(posicao == objetos.length){
			Object[]novoArray = new Object[objetos.length * 2];
			for(int i = 0; i < posicao; i++) {
				novoArray[i] = objetos[i];
			}
			objetos = novoArray;
			objetos[posicao] = o;
			posicao++;
		}else {
			objetos[posicao] = o;
			posicao++;
		}
	}
	
	public Object pop() {
		if(objetos[0] == null) {
			throw new NullPointerException();
		}else {
			objetos[posicao - 1] = null;
		}
		posicao --;
		return objetos[posicao -1];
	}
	
	public Object top() {
		if(posicao == 0) {
			throw new NullPointerException();
		}
		return objetos[posicao -1];
	}
	
	public int size() {
		return posicao;
	}
	
	public void clear() {
		if(posicao == 0) {
			System.out.println("pilha vazia");
		}else {
			for (int i = 0; i < objetos.length; i++) {
				objetos[i] = null;
			}
		}
		this.posicao = 0;
	}
}

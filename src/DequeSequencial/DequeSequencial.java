package DequeSequencial;

public class DequeSequencial {
	public static final int SIZE = 3;
	private Object[]objetos = new Object[SIZE];
	private int posicao;
	
	public void insertFront(Object o) {
		if(posicao == objetos.length) {
			Object [] novoArray = new Object[objetos.length * 2];
			for(int i = 0; i < posicao; i++) {
				novoArray[i+1] = objetos[i];
			}
			novoArray[0] = o;
			objetos = novoArray;
		}else {
			Object [] novoArray = new Object[objetos.length];
			for(int i = 0; i < posicao; i++) {
				novoArray[i+1] = objetos[i];
			}
			novoArray[0] = o;
			objetos = novoArray;
		}
		posicao++;
	}
	
	public void insertLast(Object o) {
		if(posicao == objetos.length) {
			Object [] novoArray = new Object[objetos.length * 2];
			for(int i = 0; i < posicao; i++) {
				novoArray[i] = objetos[i];
			}
			novoArray[posicao] = o;
			objetos = novoArray;
		}else {
			objetos[posicao] = o;
		}
		posicao++;
	}
	
	public Object deleteFront() {
		if(objetos[0] == null) {
			System.out.println("Deque vazio");
		}else {
			for (int i = 0; i < posicao; i++) {
				objetos[i] = objetos[i+1];
			}
			posicao--;
		}
		return objetos[0];
	}
	
	public Object deleteLast() {
		if(posicao == 0) {
			throw new NullPointerException();
		}else {
			objetos[posicao -1] = null;
			posicao--;
		}
		return objetos[posicao -1];
	}
	
	public Object getFront() {
		return objetos[0];
	}
	
	public Object getReare(){
		if(posicao == 0) {
			throw new NullPointerException();
		}
		return objetos[posicao -1];
	}
	
	public int size() {
		return posicao;
	}
	
	public boolean isEmpty(){
		return posicao == 0;
	}	
}

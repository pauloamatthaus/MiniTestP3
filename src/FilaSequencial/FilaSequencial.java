package FilaSequencial;

public class FilaSequencial {
	public static final int SIZE = 3;
	private Object[]objetos = new Object[SIZE];
	private int posicao;
	
	public void enqueue(Object o){
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
	
	public Object dequeue() {
		if(objetos[0] == null){
			throw new NullPointerException();
		}else {
			for(int i = 0; i < posicao; i++) {
				objetos[i] = objetos [i + 1];
			}
			posicao --;
		}
		return objetos[0];
	}
	
	public int size(){
		return posicao;
	}
	
	public Object getFront() {
		if(objetos[0] == null) {
			throw new NullPointerException();
		}
		return objetos[0];
	}
	
	public Object getReare() {
		if(posicao == 0) {
			throw new NullPointerException();
		}
		return objetos[posicao - 1];
	}
	
	public boolean isEmpty() {
		return posicao == 0;
	}
}

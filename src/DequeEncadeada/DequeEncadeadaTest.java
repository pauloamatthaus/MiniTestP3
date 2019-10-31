package DequeEncadeada;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DequeEncadeadaTest {

	@Test
	void testInsertFront() {
		Conta Joao = new Conta(0102);
		Conta Jose = new Conta(3456);
		Conta Pedro = new Conta(8754);
		Conta Marcos = new Conta(4431);
		DequeEncadeada deque = new DequeEncadeada();
		deque.insertFront(Joao);
		deque.insertFront(Jose);
		deque.insertLast(Pedro);
		deque.insertFront(Marcos);
		assertEquals(4431, deque.getFront());
	}
	
	@Test
	void testInsertLast() {
		Conta Joao = new Conta(0102);
		Conta Jose = new Conta(3456);
		Conta Pedro = new Conta(8754);
		Conta Marcos = new Conta(4431);
		DequeEncadeada deque = new DequeEncadeada();
		deque.insertFront(Joao);
		deque.insertFront(Jose);
		deque.insertFront(Pedro);
		deque.insertLast(Marcos);
		assertEquals(4431, deque.getReare());
	}
	
	@Test
	void testIsEmpty() {
		Conta conta = new Conta(0102);

		DequeEncadeada deque = new DequeEncadeada();
		deque.insertFront(conta);

		assertEquals(false, deque.isEmpty());
	}
	
	@Test
	void testDeleteFront() {
		Conta Joao = new Conta(0102);
		Conta Jose = new Conta(3456);
		DequeEncadeada deque = new DequeEncadeada();
		deque.insertFront(Joao);
		deque.insertFront(Jose);
		deque.deleteFront();
		assertEquals(0102, deque.getFront());
	}
	
	@Test
	void testDeleteLast() {
		Conta Joao = new Conta(0102);
		Conta Jose = new Conta(3456);
		Conta Pedro = new Conta(8754);
		Conta Marcos = new Conta(4431);
		DequeEncadeada deque = new DequeEncadeada();
		deque.insertFront(Joao);
		deque.insertFront(Jose);
		deque.insertFront(Pedro);
		deque.insertLast(Marcos);
		deque.deleteLast();
		assertEquals(0102, deque.getReare());
	}
	
	@Test
	void testSize() {
		Conta Joao = new Conta(0102);
		Conta Jose = new Conta(3456);
		DequeEncadeada deque = new DequeEncadeada();
		deque.insertFront(Joao);
		deque.insertFront(Jose);
		deque.deleteLast();
		assertEquals(1, deque.size());
	}
}


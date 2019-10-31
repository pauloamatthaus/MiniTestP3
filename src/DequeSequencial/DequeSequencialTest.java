package DequeSequencial;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class DequeSequencialTest {

	@Test
	void testInsertFront() {
		DequeSequencial deque = new DequeSequencial();
		deque.insertFront("Mesa");
		deque.insertFront("Prato");
		deque.insertFront("Copo");
		deque.insertFront("Colher");
		deque.insertLast("Cadeira");
		assertEquals("Colher", deque.getFront());
	}
	
	@Test
	void testInsertLast() {
		DequeSequencial deque = new DequeSequencial();
		deque.insertFront("Mesa");
		deque.insertFront("Prato");
		deque.insertFront("Copo");
		deque.insertLast("Cadeira");
		deque.insertFront("Colher");
		assertEquals("Cadeira", deque.getReare());
	}
	
	@Test
	void testIsEmpty() {
		DequeSequencial deque = new DequeSequencial();
		deque.insertFront("Mesa");
		assertEquals(false, deque.isEmpty());
	}
	@Test
	void testDeleteFront() {
		DequeSequencial deque = new DequeSequencial();
		deque.insertFront("Mesa");
		deque.insertFront("Prato");
		deque.insertFront("Copo");
		deque.insertFront("Cadeira");
		deque.insertLast("Colher");
		deque.deleteFront();
		assertEquals("Copo", deque.getFront());
		
	}
	@Test
	void testDeleteLast() {
		DequeSequencial deque = new DequeSequencial();
		deque.insertFront("Mesa");
		deque.insertFront("Prato");
		deque.insertFront("Copo");
		deque.insertFront("Cadeira");
		deque.insertLast("Colher");
		deque.deleteLast();
		assertEquals("Mesa", deque.getReare());
	}
	@Test
	void testSize() {
		DequeSequencial deque = new DequeSequencial();
		deque.insertFront("Mesa");
		deque.insertFront("Prato");
		deque.insertFront("Copo");
		assertEquals(3, deque.size());
	}
}

package FilaSequencial;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class FilaSequencialTest {

	@Test
	void testEnqueue() {
		FilaSequencial fila = new FilaSequencial();
		fila.enqueue("Cadeira");
		fila.enqueue("Mesa");
		fila.enqueue("Copo");
		fila.enqueue("Prato");
		assertEquals("Cadeira", fila.getFront());
	}
	@Test
	void testDequeue() {
		FilaSequencial fila = new FilaSequencial();
		fila.enqueue("Cadeira");
		fila.enqueue("Mesa");
		fila.enqueue("Copo");
		fila.enqueue("Prato");
		fila.dequeue();
		assertEquals("Mesa", fila.getFront());
	}
	
	@Test
	void testSize() {
		FilaSequencial fila = new FilaSequencial();
		fila.enqueue("Cadeira");
		fila.enqueue("Mesa");
		fila.enqueue("Copo");
		fila.enqueue("Prato");
		assertEquals(4, fila.size());
	}
	
	@Test
	void testIsEmpty() {
		FilaSequencial fila = new FilaSequencial();
		fila.enqueue("Cadeira");
		fila.enqueue("Mesa");
		fila.enqueue("Copo");
		fila.enqueue("Prato");
		assertEquals(false, fila.isEmpty());
	}
	
}
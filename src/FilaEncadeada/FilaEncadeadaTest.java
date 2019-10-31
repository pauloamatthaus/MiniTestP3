package FilaEncadeada;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class FilaEncadeadaTest {

	@Test
	void testEnqueue() {
		Conta Leandro = new Conta(1234);
		Conta Abella = new Conta(4567);
		Conta Robinho = new Conta(8901);
		
		FilaEncadeada fila = new FilaEncadeada();
		fila.enqueue(Leandro);
		fila.enqueue(Abella);
		fila.enqueue(Robinho);
		assertEquals(1234, fila.getFront());
	}
	@Test
	void testDequeue() {
		Conta Leandro = new Conta(1234);
		Conta Abella = new Conta(4567);
		Conta Robinho = new Conta(8901);
		
		FilaEncadeada fila = new FilaEncadeada();
		fila.enqueue(Leandro);
		fila.enqueue(Abella);
		fila.enqueue(Robinho);
		fila.dequeue();
		fila.dequeue();
		assertEquals(8901, fila.getFront());
	}
	
	@Test
	void testReare() {
		Conta Leandro = new Conta(1234);
		Conta Abella = new Conta(4567);
		Conta Robinho = new Conta(8901);
		
		FilaEncadeada fila = new FilaEncadeada();
		fila.enqueue(Leandro);
		fila.enqueue(Abella);
		fila.enqueue(Robinho);
		fila.dequeue();
		assertEquals(8901, fila.getReare());
	}
	@Test
	void testSize() {
		Conta Leandro = new Conta(1234);
		Conta Abella = new Conta(4567);
		Conta Robinho = new Conta(8901);
		
		FilaEncadeada fila = new FilaEncadeada();
		fila.enqueue(Leandro);
		fila.enqueue(Abella);
		fila.enqueue(Robinho);
		assertEquals(3, fila.size());
	}
	@Test
	void testIsEmpty() {
		Conta Leandro = new Conta(1234);
		Conta Abella = new Conta(4567);
		Conta Robinho = new Conta(8901);
		
		FilaEncadeada fila = new FilaEncadeada();
		fila.enqueue(Leandro);
		fila.enqueue(Abella);
		fila.enqueue(Robinho);
		assertEquals(false, fila.isEmpty());
	}
}
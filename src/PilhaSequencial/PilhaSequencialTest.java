package PilhaSequencial;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PilhaSequencialTest {

	@Test
	void testPush() {
		PilhaSequencial pilha = new PilhaSequencial();
		pilha.push("Mesa");
		pilha.push("Cadeira");
		pilha.push("Copo");
		pilha.push("Prato");
		assertEquals("Prato", pilha.top());
	}
	@Test
	void testPop() {
		PilhaSequencial pilha = new PilhaSequencial();
		pilha.push("Mesa");
		pilha.push("Cadeira");
		pilha.push("Copo");
		pilha.push("Prato");
		pilha.pop();
		assertEquals("Copo", pilha.top());
	}
	@Test
	void testTop() {
		PilhaSequencial pilha = new PilhaSequencial();
		pilha.push("Mesa");
		pilha.push("Cadeira");
		pilha.push("Copo");
		pilha.push("Prato");
		assertEquals("Prato", pilha.top());
	}
	@Test
	void testSize() {
		PilhaSequencial pilha = new PilhaSequencial();
		pilha.push("Mesa");
		pilha.push("Cadeira");
		pilha.push("Copo");
		pilha.push("Prato");
		assertEquals(4, pilha.size());
	}
	@Test
	void testClear() {
		PilhaSequencial pilha = new PilhaSequencial();
		pilha.push("Mesa");
		pilha.push("Cadeira");
		pilha.push("Copo");
		pilha.push("Prato");
		pilha.clear();
		assertEquals(0, pilha.size());
	}
}

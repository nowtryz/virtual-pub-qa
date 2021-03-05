package pub;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BoissonTest {
	private Boisson b1;
	private Boisson b2;
	private Boisson b3;

	@BeforeEach
	void setUp() throws Exception {	
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testBoissonString() {
		b1 = new Boisson("Coca-Cola");
		assertNotNull(b1);
		assertTrue(b1.nom.equals("Coca-Cola"));
		assertTrue(!b1.nom.equals("Orangina"));
		assertTrue(b1.alcoolise.equals(false));
		assertTrue(!b1.alcoolise.equals(false));
		
	}

	@Test
	void testBoissonStringFloat() {
		b2 = new Boisson("Whisky", (float) 40.0);
		b3 = new Boisson("Biere", (float) 0);
		assertNotNull(b2);
		assertNotNull(b3);
		assertTrue(b2.alcoolise.equals(true));
		assertTrue(b3.alcoolise.equals(false));
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}

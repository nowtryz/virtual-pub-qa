package pub;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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
		assertEquals("Coca-Cola", b1.nom);
		assertNotEquals("Orangina", b1.nom);
		assertFalse(b1.alcoolise);
		
	}

	@ParameterizedTest
	@CsvSource({
		"Whisky, 40.0",
		"Biere, .0"
	})
	void testBoissonStringFloat(String nom, float degre) {
		b2 = new Boisson(nom, degre);
		assertTrue(b2.alcoolise);
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}

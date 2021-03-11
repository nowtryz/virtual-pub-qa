package pub;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class BoissonTest {

	@BeforeEach
	void setUp() throws Exception {	
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testBoissonString() {
		Boisson b1 = new Boisson("Coca-Cola");
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
		Boisson b2 = new Boisson(nom, degre);
		assertTrue(b2.alcoolise);
	}

	@Test
	void testToString_BoissonSansAlcool() {
		String nom = "Coca-Cola";
		Boisson boisson = new Boisson(nom);
		String expected = nom;
		assertEquals(expected, boisson.toString());

	}
	
	@Test
	void testToString_BoissonAvecAlcool() {
		String nom = "Leffe Rituel";
		float degre = 9;
		Boisson boisson = new Boisson(nom, degre);
		String expected = nom + " (l'abus d'alcool est dangereux pour la sante)";
		assertEquals(expected, boisson.toString());
	}
	
	

}

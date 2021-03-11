package pub;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CocktailTest {
	Cocktail c1;

	@BeforeEach
	void setUp() throws Exception {
		c1 = new Cocktail("Mojito");
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCocktail() {
		assertNotNull(c1);
		assertTrue(c1.nom.equals("Mojito"));
	}

	@Test
	void testAdd() {
		c1.add("Menthe", 10.0);
		c1.add("Rhum", 30.0);
		c1.add("Eau gazeuse", 60.0);
		assertFalse(c1.ingrediants.isEmpty());
	}

	@Test
	void testAlcoolFree() {
		assertFalse(c1.alcoolFree());
	}

	@Test
	void testToString() {
		Double quantite1 = 30.0;
		String ingrediant1 = "Rhum";
		Double quantite2 = 70.0;
		String ingrediant2 = "Eau gazeuse";
		c1.add(ingrediant1, quantite1);
		c1.add(ingrediant2, quantite2);
		String expected = ingrediant1 + " " + quantite1 + "%" + "\t" + ingrediant2 + " " + quantite2 + "%" + "\t";
		assertEquals(expected, c1.toString());
		
	}

}

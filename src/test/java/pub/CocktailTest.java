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
		c1.add("Menthe", 2.0);
		c1.add("Rhum", 6.0);
		c1.add("Eau gazeuse", 12.0);
		assertFalse(c1.ingrediants.isEmpty());
	}

	@Test
	void testAlcoolFree() {
		assertTrue(c1.alcoolFree());
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}

package pub;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BarTest {
	Bar bar;

	@BeforeEach
	void setUp() throws Exception {
		bar = new Bar();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAddBoisson_AvecAlcool() {
		Boisson boisson = new Boisson("Whisky", 40f);
		bar.add(boisson);
		assertTrue(bar.boissonAlcoolisee.contains(boisson));
		
	}

	@Test
	void testAddBoisson_SansAlcool() {
		Boisson boisson = new Boisson("Jus d'orange");
		bar.add(boisson);
		assertTrue(bar.boissonFroide.contains(boisson));
	}

	@Test
	void testAddCocktail_AvecAlcool() {
		Cocktail cocktail = new Cocktail("Sex on the beach");
		cocktail.alcoolise = true;
		bar.add(cocktail);
		assertTrue(bar.cocktailAvecAlcoole.contains(cocktail));
	}
	
	@Test
	void testAddCocktail_SansAlcool() {
		Cocktail cocktail = new Cocktail("Sex on the beach");
		cocktail.alcoolise = false;
		bar.add(cocktail);
		assertTrue(bar.cocktailSansAlcoole.contains(cocktail));
	}

	@Test
	void testServ() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}

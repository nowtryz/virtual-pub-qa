package pub;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BarTest {
	Bar bar;

	@BeforeEach
	void setUp() {
		bar = new Bar();
	}

	@AfterEach
	void tearDown() {
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
		Boisson jus = new Boisson("Jus d'orange");
		Boisson sky = new Boisson("Whisky", 40f);
		Cocktail sex = new Cocktail("Sex on the beach");
		Cocktail virgin = new Cocktail("Virgin sex on the beach");
		
		jus.alcoolise = false;
		sky.alcoolise = true;
		sex.alcoolise = true;
		virgin.alcoolise = false;
		
		sex.add("jus d'orange", 20d);
		sex.add("jus de cranberry", 20d);
		sex.add("schnaps pêche", 12d);
		sex.add("vodka", 12d);
		
		virgin.add("jus d'orange", 20d);
		virgin.add("jus de cranberry", 20d);
		virgin.add("sirop de grenadine", 2d);
		virgin.add("nectar de pêche", 20d);
		
		bar.add(jus);
		bar.add(sky);
		bar.add(sex);
		bar.add(virgin);
		
		
		String eol = System.getProperty("line.separator"); 
		assertEquals(
				"Bar : " + eol + 
					"\t Sans alcool" + eol + 
						"\t\tJus d'orange" + eol + 
					"\t Avec alcool" + eol + 
						"\t\tWhisky (l'abus d'alcool est dangereux pour la sante)" + eol + 
					"\t Cocktail sans alcool" + eol + 
						"\t\tjus d'orange 20.0%\t" +
						"jus de cranberry 20.0%\t" +
						"schnaps pêche 12.0%\t" +
						"vodka 12.0%\t" + eol + 
					"\t Cocktail avec alcool" + eol + 
						"\t\tjus d'orange 20.0%\t" +
						"jus de cranberry 20.0%\t" +
						"sirop de grenadine 2.0%\t" +
						"nectar de pêche 20.0%\t" + eol + 
					"\t Boissons chaudes" + eol,
				bar.toString()
		);
	}

}

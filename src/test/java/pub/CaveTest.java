package pub;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CaveTest {
	Cave cave;

	@BeforeEach
	void setUp() throws Exception {
		cave = new Cave();
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAdd() {
		Boisson b1 = new Boisson("Coca-Cola");
		cave.add(b1);
		assertFalse(cave.rayons.isEmpty());
		assertTrue(cave.rayons.contains(b1));
	}

	@Test
	void testTake_BoissonPresente() {
		String nom = "Cognac";
		float degre = 38;
		Boisson boisson = new Boisson(nom, degre);
		cave.add(boisson);
		assertEquals(boisson, cave.take(nom));
		assertFalse(cave.rayons.contains(boisson));
	}
	
	@Test
	void testTake_BoissonAbsente() {
		String nom = "Tropico";
		assertEquals(null, cave.take(nom));
	}
	
	
	@Test
	void testToString() {
		Boisson b1 = new Boisson("Ice Tea");
		Boisson b2 = new Boisson("Minute Maid");
		cave.add(b1);
		cave.add(b2);
		String expected = "";
		assertEquals(expected, cave.toString());
		
	}

}

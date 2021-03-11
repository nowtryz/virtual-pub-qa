package pub;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PubTest {
	Pub pub;

	@BeforeEach
	void setUp() throws Exception {
		pub = new Pub();
	}

	@Test
	void testApprovisionnerBar_BoissonInconnue() {
		assertThrows(Exception.class, () -> pub.approvisionnerBar("Polynectar"));
	}

	@Test
	void testApprovisionnerBar_BoissonConnue() {
		String nom = "Vodka";
		Boisson boisson = new Boisson(nom);
		boisson.alcoolise = true;
		
		pub.cave.add(boisson);
		pub.approvisionnerBar(nom);
		
		assertTrue(pub.bar.boissonAlcoolisee.contains(boisson));
	}
}

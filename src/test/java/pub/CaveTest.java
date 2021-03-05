package pub;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CaveTest {
	private Cave cave;
	private Boisson b1;

	@BeforeEach
	void setUp() throws Exception {
		cave = new Cave();
		b1 = new Boisson("Coca-Cola");
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCave() {
		fail("Not yet implemented");
	}

	@Test
	void testAdd() {
		cave.rayons.add(b1);
		assertFalse(cave.rayons.isEmpty());
	}

	@Test
	void testTake() {
		assertTrue(b1.equals(cave.take("Coca-Cola")));
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}

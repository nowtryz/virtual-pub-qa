package pub;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CaveTest {
	private Cave cave;

	@BeforeEach
	void setUp() throws Exception {
		Cave cave = new Cave();
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
		Boisson b1 = new Boisson("Whisky");
		cave.rayons.add(b1);
		assertFalse(cave.rayons.isEmpty());
	}

	@Test
	void testTake() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}

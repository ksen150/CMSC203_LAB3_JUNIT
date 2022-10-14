import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {

	private GradeBook g1;
	private GradeBook g2;
	
	@BeforeEach
	void setUp() throws Exception {
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		
		g1.addScore(78);
		g1.addScore(82);
		
		g2.addScore(86);
		g2.addScore(82);
	}

	@AfterEach
	void tearDown() throws Exception {
		g1 = null;
		g2 = null;
	}

	@Test
	void testAddScore() {
		assertTrue(g1.toString().equals("78.0 82.0 "));
		assertEquals(2, g1.getScoreSize(), .001);
	}

	@Test
	void testSum() {
		assertEquals(160, g1.sum(), .0001);	
		assertEquals(168, g2.sum(), .0001);	
	}

	@Test
	void testMinimum() {
		assertEquals(78, g1.minimum(), .001);
		assertEquals(82, g2.minimum(), .001);
	}

	@Test
	void testFinalScore() {
		assertEquals(82, g1.finalScore(), .001);
		assertEquals(86, g2.finalScore(), .001);
	}

	@Test
	void testGetScoreSize() {
	
		
	}

	@Test
	void testToString() {
		
	}

}

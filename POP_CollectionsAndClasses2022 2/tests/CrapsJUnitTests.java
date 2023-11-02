import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CrapsJUnitTests {

	Craps craps;

	@BeforeEach
	void setUp()  {
		craps = new Craps();
	}
	
	@Test
	//Task 1
	void testShoot() {
		assertTrue(craps.getDice1().getFaceValue() == 0);
		assertTrue(craps.getDice2().getFaceValue() == 0);
		craps.shoot();
		assertTrue(craps.getDice1().getFaceValue() > 0);
		assertTrue(craps.getDice2().getFaceValue() > 0);
	}
	
	@Test
	//Task 2
	void testAddUpScore() {
		craps.shoot();
		assertEquals(craps.addUpScore(), craps.getDice1().getFaceValue() +craps.getDice2().getFaceValue() );
	}

	@Test
	//Task 3
	void testDecideOutcome() {
		craps.shoot();
		assertEquals("You lose".toLowerCase(), craps.decideOutcome(2).toLowerCase());
		assertEquals("You lose".toLowerCase(), craps.decideOutcome(3).toLowerCase());
		assertEquals("You lose".toLowerCase(), craps.decideOutcome(12).toLowerCase());

		assertEquals("You win".toLowerCase(), craps.decideOutcome(7).toLowerCase());
		assertEquals("You win".toLowerCase(), craps.decideOutcome(11).toLowerCase());

		assertEquals("Throw again".toLowerCase(), craps.decideOutcome(4).toLowerCase());
		assertEquals("Throw again".toLowerCase(), craps.decideOutcome(5).toLowerCase());
		assertEquals("Throw again".toLowerCase(), craps.decideOutcome(6).toLowerCase());
		assertEquals("Throw again".toLowerCase(), craps.decideOutcome(8).toLowerCase());
		assertEquals("Throw again".toLowerCase(), craps.decideOutcome(9).toLowerCase());
		assertEquals("Throw again".toLowerCase(), craps.decideOutcome(10).toLowerCase());
	}
}





import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * LabExampleJUnitTests - part of Control Flow
 * JUnit testing the LabExample class
 * Selection and Iteration examples
 * @author Dr Suzy Atfieldcutts adapted from Melanie Coles
 * @since 2020
 */
class LabExampleJUnitTests {

	LabExample labExample;

	@BeforeEach
	void createObject() {
		labExample = new LabExample();
	}

	//Task 1
	@Test
	void testHighestOfTwo() {
		assertEquals(20, labExample.highestOfTwo(10,20));
		assertEquals(-1, labExample.highestOfTwo(5,5));
		assertEquals(345, labExample.highestOfTwo(345,5));
	}

	//Task 2
	@Test
	void testCalculateGrade() {
		assertEquals("Fail", labExample.calculateGrade(30));
		assertEquals("3rd", labExample.calculateGrade(44));
		assertEquals("Invalid mark", labExample.calculateGrade(123));
		assertEquals("1st", labExample.calculateGrade(70));
		assertEquals("2i", labExample.calculateGrade(65));
		assertEquals("Invalid mark", labExample.calculateGrade(-2));
	}

	//Task 3
	@Test
	void testHeadsOrTails() {
		String[] answers = {"Correct: you guessed heads and I flipped heads",
				"Correct: you guessed tails and I flipped tails",
				"Incorrect: you guessed heads and I flipped tails",
		"Incorrect: you guessed tails and I flipped heads"};
		assertTrue(Arrays.asList(answers).contains(labExample.headsOrTails("heads")));
		assertTrue(Arrays.asList(answers).contains(labExample.headsOrTails("tails")));

	}

	//Task 4
	@Test
	void testSumFromOneToWhat() {
		assertEquals(55, labExample.sumFromOneToWhat(10));
		assertEquals(1, labExample.sumFromOneToWhat(1));
		assertEquals(0, labExample.sumFromOneToWhat(0));
		assertEquals(5151, labExample.sumFromOneToWhat(101));
		assertEquals(0, labExample.sumFromOneToWhat(-1));
	}

	//Task 5
	@Test
	void testSumFromWhatToWhat() {
		assertEquals(55, labExample.sumFromWhatToWhat(1,10));
		assertEquals(3, labExample.sumFromWhatToWhat(1,2));
		assertEquals(55, labExample.sumFromWhatToWhat(0, 10));
		assertEquals(-1, labExample.sumFromWhatToWhat(-1,0));
		assertEquals(-55, labExample.sumFromWhatToWhat(-10,0));
	}
}

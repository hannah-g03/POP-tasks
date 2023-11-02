import java.util.Arrays;

/**
 * WordPlayStudentOuputTests class - part of Control Flow
 * For students to use to test and see output from the
 * WordPlay tasks.
 * Advanced String manipulation tasks examples
 * @author Dr Suzy Atfieldcutts adapted from Melanie Coles
 * @since 2020
 */

public class WordPlayStudentOuputTests {

	public static void main(String[] args) {
		WordPlay wordPlay = new WordPlay();
		System.out.println(wordPlay.whatComesFirst("ANT", "ant"));
		//System.out.println(wordPlay.whatComesFirst("fred", "bob"));
		//System.out.println(wordPlay.whatComesFirst("ant", "Ant"));
		//System.out.println(wordPlay.whatComesFirst("Fred", "ddddddd"));

		System.out.println(wordPlay.backwardsString("This is programming!"));

		String[] names = {"Tom","Dick","Harry"};
		String[] numbers = {"0111","0554","4532"};
		System.out.println(Arrays.toString(wordPlay.addressBook(names, numbers)));

		//System.out.println(wordPlay.rockPaperScissors("rock"));
		System.out.println(wordPlay.rockPaperScissors("paper"));
		//System.out.println(wordPlay.rockPaperScissors("scissors"));

	}

}
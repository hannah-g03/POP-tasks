import java.util.Random;

public class Craps {
    int dice1;
    int dice2;

	//Task 1
	public void shoot() {
       Random number = new Random();
	   int randomNumber1 = number.nextInt(1,7);
	   int randomNumber2 = number.nextInt(1,7);
	   dice1 = randomNumber1;
	   dice2 = randomNumber2;
	}


	//Task 1
	public int getDice1() {
		return dice1;
	}


	//Task 1
	public int getDice2() {
		return dice2;
	}


	/*Task 2
	public ?? addUpScore(??) {
		??
	}
	*/

	/*Task 3
	public ?? decideOutcome(??) {
		??
	}
	*/

	/*Task 4 - No UNIT TEST FOR THIS ONE - Check the output
	public ?? getResults(??) {
		??
	}
	*/

	/*Task 5 - No UNIT TEST FOR THIS ONE - Check the output
	public ?? playCraps(??) {
		??
	}
	*/

	/*Task 6 Additional tasks - OPTIONAL AND NOT ASSESSED
	Can you add a method that asks the user if they want to play again?
	public ?? playAgain(??){

	}*/
}

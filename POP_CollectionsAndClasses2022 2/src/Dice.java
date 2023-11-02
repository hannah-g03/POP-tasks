import java.util.Random;

public class Dice {
	int faceValue;

	//Task 1
	public void roll() {
		Random number = new Random();
		int randNumber = number.nextInt(1,7);
		faceValue = randNumber;
	}

	//Task 1 - second bit
	public int getFaceValue() {
		return faceValue;
	}


	//Task 2
	public String toString() {
		return Integer.toString(faceValue);
	}


}

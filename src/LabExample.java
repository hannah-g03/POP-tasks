import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * LabExample class - part of Control Flow
 * Selection and Iteration examples
 * @author Dr Suzy Atfieldcutts adapted from Melanie Coles
 * @since 2020
 */
public class LabExample {

		// Task 1
		 public int highestOfTwo(int num1, int num2){
			 int answer = 0;
             if (num1 > num2) {
				 answer= num1;
			 }
			 else if (num2>num1) {
				 answer= num2;
			 }

			 else {
				 answer= -1;
			 }
			 return answer;
		}
	
		// Task 2
		 public String calculateGrade(int mark) {
			 String output = "";
			 if (mark<0){
				 output= "Invalid mark";
			 }
			   else if (mark<40){
				 output= "Fail";
			 } else if (mark <50) {
				 output= "3rd";
			 } else if (mark<60) {
				 output= "2ii";
			 } else if (mark<70) {
				 output= "2i";
			 } else if (mark>100) {
				 output= "Invalid mark";
			 } else
				 output= "1st";
			   return output;
		 }
		
		// Task 3
		 public String headsOrTails(String guess) {
			 Random number = new Random();
			 int randNumber = number.nextInt(2); //generates random number between 0&1
			 String coinFlip;
			 String answer;
			 if (randNumber == 1){
				 coinFlip = "heads";
			 } else coinFlip = "tails";
			 if (guess.equalsIgnoreCase(coinFlip)){
				 answer = "Correct: you guessed "+guess+" and I flipped "+coinFlip;
			 } else answer = "Incorrect: you guessed "+guess+" and I flipped "+coinFlip;

			 return answer;
		 }

		// Task 4
		   public int sumFromOneToWhat(int biggestNumber) {
			 int total=0;
			 if (biggestNumber<0){
				 total=0;
			 }
			 else if (biggestNumber>0){
			   int[] numbers = new int[biggestNumber]; //new array class

			   for (int i = 0; i < biggestNumber; i++) //adds values into array
				   numbers[i] = i + 1;
			   for (int index = 0; index < biggestNumber; index++) {
					   total = total + numbers[index]; //adds up the values within array
			   }
			 }
			   return total;

		   }
		
		// Task 5
		public int sumFromWhatToWhat(int bottomNumber,int topNumber) {
			 int total = 0;

			 int [] numbers = new int[(topNumber-bottomNumber)+1];
			 for (int i=0; i<(topNumber-bottomNumber)+1; i++) {
				 numbers[i] = bottomNumber+i;
			 }
			for (int index=0; index<(topNumber-bottomNumber)+1; index++){
				 total = total + numbers[index];
			 }

			return total;
		}

}
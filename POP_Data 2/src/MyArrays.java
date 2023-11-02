import java.util.Random;

/**
 * MyArrays class
 * This class contains tasks about using arrays.
 * @author Dr Suzy Atfield-Cutts adapted from Melanie Coles
 * @since 2020
 */

public class MyArrays {

	// Task 1
	 public int addUpNumbers(int num1, int num2, int num3, int num4, int num5) {
         return (num1+num2+num3+num4+num5);
	}

	// Task 2
	 public int addUpNumbers(int[] numbers) {
		 int total = 0;
		 for (int number:numbers)
		 {
			 total=total+number;
		 }
		 return total;

	}

	// Task 3
	 public double averageOfNumbers(int[] nums) {
		int total = 0;
		for (int number:nums)
		{
			total=total+number;
		}
		return (double)total/nums.length;
	}

	// Task 4
	 public int[] convertToCelsius(int[] fahrenheits) {
		 int[] celsius = {0, 0, 0, 0, 0};
		 for (int i=0; i< fahrenheits.length; i++)
		 {
			 celsius[i]=(fahrenheits[i] -32) * 5/9;
		 }
		 return celsius; //as the array used earlier

		}


	// Task 5
	 public String[] unitMarks(int[] grades) {
		String[] results = {"APP:", "BSAD:","CF:","DAD:","N&CS:","POP:","Average:"};
		double total=0;
		for (int number:grades)
		{
			total=total+number;
		}
		 double average = total/6; //finding the average of the grades

		for (int i=0; i< grades.length; i++)
		{
			results[i]=results[i]+grades[i]; //to insert the grades into the string above^^
		}
		results[6]=results[6]+average; //[6] indicates the amount of inputs, and adding the average to the end of the string
		return results;
	 }

	// Task 6
	 public String andTheWinnerIs(String[] names) {
		 Random randomNumberGenerator = new Random();
		  int randomNumber= randomNumberGenerator.nextInt(names.length); //generates a random number based on the array length
		  String theWinner = names[randomNumber]; //the random number is indexed to a specific point in the array
		  return theWinner;

	}
}

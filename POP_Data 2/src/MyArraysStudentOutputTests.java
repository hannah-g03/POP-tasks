import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * myArraysStudentOutputTest class
 * YOU SHOULD EDIT THIS CLASS to run the methods of the myArrays class and produce output.
 * @author Dr Suzy Atfield-Cutts adapted from Melanie Coles
 * @since 2020
 */

public class MyArraysStudentOutputTests {

    public static void main(String[] args) {
        MyArrays myArrays = new MyArrays();

        // Task1 test
        System.out.println(myArrays.addUpNumbers(10,20,30,40,50));

        // Task 2 test
        int[] numbers = {10,20,30,40,50};
        System.out.println(myArrays.addUpNumbers(numbers));

        // Task 3 test
        int [] nums = {1,2,3,4,5};
        System.out.println(myArrays.averageOfNumbers(nums));


         // Task 4 test
        int[] fahrenheits = {70,65,84,90,45};
        System.out.println(Arrays.toString(myArrays.convertToCelsius(fahrenheits)));
        //arrays.toString displays it as an array


        //Task 5 test
        int[] grades = {50,75,88,64,79,46};
        System.out.println(Arrays.toString(myArrays.unitMarks(grades)));


        // Task 6 test
        String[] names = {"Hannah","Ed","Millie","Jess"};
        System.out.println(myArrays.andTheWinnerIs(names));

    }
}
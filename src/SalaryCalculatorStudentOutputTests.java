import java.util.Arrays;

/**
 * SalaryCalculatorStudentOutputTests class - part of Control Flow
 * For students to use to test and see output from the
 * SalaryCalculator tasks.
 * Selection and Iteration examples
 * @author Dr Suzy Atfieldcutts adapted from Melanie Coles
 * @since 2020
 */

public class SalaryCalculatorStudentOutputTests {

	public static void main(String[] args) {
		SalaryCalculator salary = new SalaryCalculator();
		
		//Task1
		System.out.println(salary.salaryTax(30000));
		System.out.println(salary.calculateNI(50000, 'C'));

		//Task 2
		double[] salaries = {23000.50, 25478.66, 78496.50};
		System.out.println(salary.salaryTotal(salaries));
		System.out.println(salary.salaryAverage(salaries));
		System.out.println(Arrays.toString(salary.salaryIncrease(salaries)));
	}

}

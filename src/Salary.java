import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/**
 * Salary class
 * This class contains tasks about calculating salaries.
 * @author Dr Suzy Atfield-Cutts adapted from Melanie Coles
 * @since 2020
 */

public class Salary {

	// Task 1
  	public int salaryIncrease(int salary) {
  		 return salary+200;
	}

	// Task 2
	 public double salaryIncrease(double salary) {
		return salary+ 200.50;
	}

	// Task 3:
	 public double salaryIncrease(double salary, double percentage) {
		  percentage= (percentage/100)+1;
		return salary*percentage;
	}

	// Task 4
	 public double calculatePay(double salary) {
		double tax = salary*0.15;
		double pension= salary*0.13;
		 return (salary-(tax+pension))/12.00;
	}

	// Task 5 - this one is more of a challenge - you can come back to it later
	 public String formatCurrency(double salary) {
		 DecimalFormat decimalFormat = new DecimalFormat("###,###,##0.00");
		  return ("£" + decimalFormat.format(salary));
	}
}

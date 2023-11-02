import java.text.DecimalFormat;
import java.util.Arrays;

/**
 * SalaryCalculator class - part of Control Flow
 * Selection and Iteration examples
 * @author Dr Suzy Atfieldcutts adapted from Melanie Coles
 * @since 2020
 */

public class SalaryCalculator {

	//Task 1
	public double salaryTax(double grossSalary) {
        double taxRate=0;
        if(grossSalary>=45000){
            taxRate = 0.5;
        } else if (grossSalary >=30000) {
            taxRate = 0.3;
        } else
            taxRate = 0.15;
        double tax = grossSalary*taxRate;
        double netSalary = grossSalary-tax;

        return netSalary;
	}

	//Task 2
	public double calculateNI(double grossSalary, char nationalInsuranceCategory) {
        double nationalInsurance=0;
        if (nationalInsuranceCategory=='A'){
            nationalInsurance=0.12;
        } else if (nationalInsuranceCategory=='B') {
            nationalInsurance=0.0585;
        } else if (nationalInsuranceCategory=='C'){
            nationalInsurance =0.02;
        }
        double nationalInsurancePayment= grossSalary*nationalInsurance;
        double netSalary= grossSalary-nationalInsurancePayment;

        return netSalary;
	}
	
	//Task 3
	 public double salaryTotal(double[] salaries) {
        double total = 0;
        for (double salary:salaries){
            total=total+salary;
        }
		return total;
	}

	// Task 4
	 public double salaryAverage(double[] salaries) {
        double total = 0;
        for (double salary:salaries){
            total=total+salary;
        }
		return total/salaries.length;
	}

	//Task 5
	 public double[] salaryIncrease(double[] salaries) {
        double [] salaryIncrease2 = new double[salaries.length];

        for (int i=0; i<salaries.length;i++){
            salaryIncrease2[i]=salaries[i]+(salaries[i]*0.05);
        }
        DecimalFormat decimalFormat=new DecimalFormat("#####0.00");


        return salaryIncrease2;



}}

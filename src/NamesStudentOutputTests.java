/**
 * NamesStudentOutputTests class
 * YOU SHOULD EDIT THIS CLASS to run the methods of the Names class and produce output.
 * @author Dr Suzy Atfield-Cutts adapted from Melanie Coles
 * @since 2020
 */
public class NamesStudentOutputTests {

    public static void main(String[] args) {
        Names names = new Names();

        System.out.println("Upper case name is "+names.upperCaseName("hannah")); // Task 1
        System.out.println("Full name is "+names.fullName("Hannah", "Gorry")); // Task 2
        System.out.println("Count of letters in the name Hannah = " +names.letterCount("Hannah")); // Task 3
        System.out.println("Are the names the same? "+names.theSameName("hannah", "Hannah")); // Task 4
        System.out.println("Proper case name is "+names.properCaseName("hanNAh")); // Task 5
    }
}

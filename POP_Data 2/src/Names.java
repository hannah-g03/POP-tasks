import java.util.Locale;

/**
 * Names class
 * This class contains tasks related to the use of the Strings class.
 *
 * @author Dr Suzy Atfield-Cutts adapted from Melanie Coles
 * @since 2020
 */

public class Names {

	// Task 1
	public String upperCaseName(String name) {
		return name.toUpperCase() ;
	}

	// Task 2

	 public String fullName(String firstName, String lastName) {
		return firstName+' '+lastName;
	}
	//used the char value ' ' to add a space

	// Task 3

	 public int letterCount(String name) {

		return name.length();
	}

	// Task 4
	 public Boolean theSameName(String name1, String name2) {

		 return name1.toUpperCase().equals(name2.toUpperCase());
		 //Changed both names to uppercase to account for the same name but not case-sensitive

	}

	// Task 5
	 public String properCaseName(String name) {

		return (name.substring(0,1).toUpperCase())+(name.substring(1).toLowerCase());
 //used substring method to split the string, therefore able to capitalise part of it and leave the rest lowercase
	}
}

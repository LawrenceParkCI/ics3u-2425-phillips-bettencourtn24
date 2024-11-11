package unit2;

import java.util.Scanner;

/**
 * Description: Comparing strings worksheet 
 * Date: November 11 2024
 * @author Noa Phillips-Bettencourt
 */

class StringComparison {
	/**
	 * Entry point to the program 
	 * @param args unused 
	 */
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String answer;

		System.out.println("What is the capital of Ontario?");
		answer = in.nextLine();

		if (answer == "Toronto") {
			System.out.println("Correct!");
		} else {
			System.out.println("Sorry, that's incorrect.");
		}



		String name1, name2;

		System.out.println("Enter two names:");
		name1 = in.nextLine();
		name2 = in.nextLine();


		if (name1.compareTo(name2)==0) {
			System.out.println("The names are the same");
		} else if (name1.compareTo(name2)<0) {
			System.out.println("Name 1 comes first in the alphabet");
		} else {
			System.out.println("Name 1 comes after first name in the alphabet ");
		}

		if (name1.equalsIgnoreCase(name2)) {
			System.out.println("The names are the same");
		} else {
			System.out.println("The names are not the same");
		}

		if (name1.equals(name2)) {
			System.out.println("The names are the same");
		} else {
			System.out.println("The names are not the same");
		}

		//Run the code. What happens when you type the correct answer? The incorrect answer?
		// Even when you put the correct answer the program says its wrong.  
		/*
      Strings are objects, not primitives and as such are a 
		 *reference* data type. These variables hold an address 
      to the value. (Scanner is also a reference data type)

      int, double, char, etc. are all *primitive* data types. 
      These variables hold the actual value.

      Look at the website:
      https://www.javatpoint.com/string-comparison-in-java

      Demonstrate the use of the functions:
        .compareTo() 
        The String class compareTo() method compares values lexicographically and returns an integer value that describes if first string is less than, equal to or greater than second string. 
        .equals() 
        The String class equals() method compares the original content of the string. It compares values of string for equality. 
        .equalsIgnoreCase() 
         compares this string to another string, ignoring case.
		 */


		//What values does compareTo() return? How can we 
		//interpret the value?
		// compareTo() returns and integer values that describes if the first string is less than, equal to or greater then the second string.

		//what value does equals() and equalsIgnoreCase() return? 
		//What is the difference between these two functions?
		// equals() returns true if the integers are equal and false if the integers are not equal. equalsIgnoreCase() returns true if integers are equal while ignoring case and false if numbers are not equal. 
	}
}


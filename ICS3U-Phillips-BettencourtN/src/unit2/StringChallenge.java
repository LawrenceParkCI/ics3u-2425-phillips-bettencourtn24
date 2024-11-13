package unit2;

import java.util.Scanner;

/**
 * Description: String challenge worksheet 
 * Date: November 13 2024 
 * @author Noa Phillips Bettencourt
 */

public class StringChallenge {
	/**
	 * Entry point to the program 
	 * @param args unused
	 */
	public static void main(String[] args) {
		//This is for the portfolio

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your first word:");
		String word1= scanner.nextLine();

		System.out.println("Enter your second word");
		String word2 = scanner.nextLine();

		//Using .equals() method
		if (word1.equals(word2)) {
			System.out.println("Wow! The words are the exact same.");
		} else {
			System.out.println ("That's too bad, the words are not the same.");
		}

		// Using .equalsIgnoreCase() method 
		if (word1.equalsIgnoreCase(word2)) {
			System.out.println("Cool! The words are the same ignoring the case.");
		} else {
			System.out.println("Oops! The words are not the same even when ignoring case.");
		}

		// Using .compareTo() method 
		int result = word1.compareTo(word2);
		if (result==0) {
			System.out.println("The words are equal in alphabetical order");

		}else if (result<0) {
			System.out.println("The first word comes before the second word in the alphabet");

		}else {
			System.out.println("The first word comes after the second word in the alphabet");
		}


		//Demonstrate implicit casting (automatic)
		int number = 16;
		double doubleNumber = number;  // Implicit casting: int to double
		System.out.println("Implicit Casting:");
		System.out.println("My age is " + number + " years, but as a double: " + doubleNumber);


		//Demonstrate explicit casting (manuel)
		double pi = 3.14159;
		int intPi = (int) pi;  // Explicit casting: double to int
		System.out.println("Explicit Casting:");
		System.out.println("Pi is " + pi + ", but as an integer: " + intPi);

		scanner.close();

		/*
    Create a program that demonstrates the use of .equals(), .equalsIgnoreCase(), .compareTo().  You should be using if statements for this program.

    Also, include an example of explicit and implicit casting.

    Comment to explain:
      -when you use the different String functions
      -when you are casting and how the value is changed
		 */
	}
}
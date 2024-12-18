package unit2;
import java.util.Scanner;
/**
Description: using string methods with a for loop 
Date: November 27 2024
@author Noa Phillips-Bettencourt
 */

public class StringLengthAndChars {

	private static int i;

	/**
	 * Entry point to the program 
	 * @param args unused
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*
      Goal: Using string methods with a for loop
        .length()
        .charAt(<position>)
		 */

		String name = "Ms. Kemp";

		//write comments for the following code - what does it print out, and why?
		System.out.println(name.length()); // the code prints out 8 because the string name has 8 characters 
		System.out.println(name.charAt(1)); // the code prints out s because the first character is 0 so the second character is one being s 
		System.out.println(name.charAt(2)); // the code prints . because . is the second character in the code 
		System.out.println(name.charAt(3)); // the code prints nothing becasue the third character is a space. 

		//.length() gets the _____number of characters in a string ________
		//.charAt(position) gets the ____gets the character at the specified position ___________
		//counting starts at ____0_________

		/**
      Ask for user input for name. Print out each individual letter of the name on separate lines, using a for loop
		 */


		System.out.println("Enter a name: ");
		String userName = scanner.nextLine();

		for (int i = 0; i < userName.length(); i++){
			System.out.println(userName.charAt(i));
		}
		scanner.close();
	}
}


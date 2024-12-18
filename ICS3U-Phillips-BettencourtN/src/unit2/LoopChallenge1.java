package unit2;

import java.util.Scanner;
/**
Description: This code asks the user for a password 
Date: November 25 2024 
@author Noa Phillips-Bettencourt
 */

public class LoopChallenge1 {
	/**
	 * Entry point to the program 
	 * @param args unused 
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String correctPassword = "NoaTheGreat";
		String enteredPassword;
		int attempts = 0;
		boolean isCorrect = false;

		do { 
			System.out.print("Enter the password: ");
			enteredPassword = scanner.nextLine();
			attempts++;  // Increase attempt count

			if (enteredPassword.equals(correctPassword)) {
				isCorrect = true;  // Password is correct
			} else {
				System.out.println("Incorrect password. Try again.");
			}
		} while (!isCorrect && attempts < 3);  // Repeat while the password is wrong and attempts are less than 3
		// Check if the user was successful or failed after 3 attempts
		if (isCorrect) {
			System.out.println("Welcome!");
		} else {
			System.out.println("Sorry, you have exceeded the maximum number of attempts.");
		}
		scanner.close();


		/*
     Create a program that will ask for the password.  If they answer 
     incorrectly, tell them, and repeat. If they answer correctly, 
     welcome them in.

     Extra: if they don't give a proper answer within 3 
     Decide on whether you should use the while or do while loop.
		 */
	}
}

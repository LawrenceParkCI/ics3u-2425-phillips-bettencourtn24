package unit2;
import java.util.Scanner;

/**
 Description: This code asks to enter a positive number, then calculate the square root  
 Date: November 26 2024
 @author Noa Phillips-Bettencourt
 */

public class LoopChallenge2 {
	/**
	 * Entry point to the program 
	 * @param args unused 
	 */
	public static void main(String[] args) {
		/*
      Write a program to take the square root of a number typed in by 
      the user. Your program should use a loop to ensure that the number 
      they typed in is positive. If the number is negative, you should 
      print out some sort of warning and make them type it in again.

      You can get the square root of a number n with Math.sqrt(n). Make 
      sure you don't do this until the loop is done and you know for 
      sure you've got a positive number.

      Use the loop that you didn't use in LoopChallenge1

		 */

		Scanner scanner = new Scanner(System.in);
		double number;
		// Ask to enter a number
		System.out.print("Please enter a positive number: ");
		// Use a while loop for positive number
		while (true) {
			number = scanner.nextDouble();
			// Check if the number is positive
			if (number >= 0) {
				break;  // Exit loop if positive
			} else {
				System.out.println("This number is negative. Please enter a positive number.");
			}
		}
		// Calculate and show  square root of number entered
		double squareRoot = Math.sqrt(number);
		System.out.println("The square root of " + number + " is: " + squareRoot);
		scanner.close();

	}
}
package unit2;

import java.util.Scanner;
/**
Description: code asks user for a numbers then creates a loop that counts by decimal 
Date: November 27 2024
@author Noa Phillips-Bettencourt
 */

public class ForChallenge1 {
	/**
	 * Entry point to the program 
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a starting number: ");
		double start = scanner.nextDouble();

		System.out.println("Enter an ending number");
		double end = scanner.nextDouble();
		System.out.println("Enter how much do you want to count by: ");
		double increment = scanner.nextDouble();

		System.out.println("Results: ");
		for (double num = start; num<= end; num+= increment) {
			System.out.printf("%.1f ", num);
		}

		System.out.println();

		scanner.close();
		/*
      Create a program that asks for the starting number, the ending number, and how much you should count by. Then print out the numbers using a for loop.  You should be able to count by decimals.
      ie.

      Starting Num: 
        0
      Ending Num: 
        1
      Count by: 
        0.1
      Result: 
        0 0.1 0.2 0.3 0.4 0.5 0.6 0.7 0.8 0.9 1.0
		 */
	}
}
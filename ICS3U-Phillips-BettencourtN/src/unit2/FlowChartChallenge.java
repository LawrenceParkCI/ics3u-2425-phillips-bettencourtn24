package unit2;

import java.util.Scanner;

/**
 Description: This code craetes a flow chart 
 Date: November 26 2024 
 @author Noa Phillips-Bettencourt
 */

class FlowChartChallenge {
	/**
	 * Entry point to the program 
	 * @param args unused 
	 */
	public static void main(String[] args) {
		/*Create a flow chart for this program. Add the Share link
    to your flowchart as a comment in this program.

    https://drive.google.com/file/d/13kQezUbKwkZ8mk78kud1b7ygvFnR9-_u/view?usp=sharing

    How would the flow chart of the do-while loop
     and while loop differ?
     While loop: Checks the condition before running.
     Do-while loop: Runs the loop body first, then checks the condition.


		 */

		Scanner in = new Scanner(System.in);
		String name;
		do {
			System.out.print("What is your name? ");
			name = in.nextLine();
		} while (!name.equals("Ms. Kemp"));

		System.out.println("You are welcome into the secret secret pogchamp club.");

		in.close();

	}
}
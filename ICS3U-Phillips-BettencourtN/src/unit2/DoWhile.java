package unit2;

import java.util.Scanner;
/**
Description: do while worksheet
Date: November 21 2024
@author Noa Phillips-Bettencourt
 */
public class DoWhile {
	/** 
	 * Entry point to the program 
	 * @param args unused
	 */
	public static void main(String[] args) {
		/*
	    A loop is another control structure that allows for repetition. It 
	    does not make a decision on which branch to go on, like the 
	    conditional.
	    It makes a decision whether it should go back to redo a set of code.
		 */
		Scanner in = new Scanner(System.in);
		String name;
		do {
			System.out.print("What is your name? ");
			name = in.nextLine();
		} while (!name.equals("Mr. Lee"));

		System.out.println("You are welcome into the secret secret pogchamp club.");



		//Run the code. Explain the code in your own words
		// The program will ask for your name until you say Mr. Lee

		//What code is repeated?
		// "What is your name?"

		//When does it decide whether to repeat or not?
		// It decides when you input a name and weather it is what they are looking for. 

		//What is the condition for repeating?
		// Repeat "what is your name?" until the user inputs Mr. Lee 


		/*
	     Note:Pay attention to the brackets, and the semicolon
		 */

		/*
	      When constructing a loop, there are many strategies. I like to 
	      break down the problems this way:
	        1. What commands am I going to repeat?
	        2. How many times/until when will I repeat the code?
		 */

		//Create a do-while loop that asks for a word, and 
		//prints it out 20 times.

		System.out.println("Enter a word:");
		String word = in.nextLine();
		int repeat = 1;
		do {
			System.out.println(word);
			repeat ++;
		} while (repeat<=20);

		in.close();
	}
}

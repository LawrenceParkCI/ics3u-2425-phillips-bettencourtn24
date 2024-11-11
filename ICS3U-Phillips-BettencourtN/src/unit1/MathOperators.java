package unit1;

import java.util.Scanner;
/**
 * Date: October 1, 2024
 * Description:
 * @author Noa Phillips-Bettencourt
 */
public class MathOperators {
	/**
	 * Entry point to the program 
	 * @param args unused 
	 */
	public static void main (String [] args) {
		/*
	         Pre: Kind of Math, but not really
	         What do you notice is happening?
		 */

		System.out.println("Butter" + "fly");

		System.out.println("1 + 2 + 3 + 4 + 5");

		System.out.println(1 + 2 + 3 + 4 + 5);

		System.out.println(1 + 2 + "3 + 4 + 5");

		System.out.println("1 + 2 + 3" + 4 + 5);


		//Why do you think the last two outputs act so differently?
		//* because different numbers are quoted 

		//Summary: What are two possible roles of the + operator?
		//* combine words or add numbers

		/*
	         Part 1 
	         Figure out what is the meaning of each operator. Use print statements
	         to verify your answer and explain.
		 */

		System.out.println(" + means : addition");

		System.out.println("- means: subtraction"); 

		System.out.println("* means: multiplication");

		System.out.println("/ means: division");



		//Print the following expression: (3 + 2) * 5
		//Print the following expression: 3 + 2 * 5
		System.out.println((3+2)*5);
		System.out.println(3+2*5);
		//Was this expected? Why or why not?
		System.out.println("Yes it is because if you are following the rules of BEDMAS the answers are expected.");;
		//* Part 2 - Calculate Using Operators
		//* Print out, using one println statement, what is 45 degrees Celsius is in Fahrenheit

		System.out.println();
		//*  Print out, using a print and a println statement, what 900 Fahrenheit is in Celsius


		/*
	         Part 3
	         Figure out what is the meaning of % as a math operator. Use print statements
	         to check your answer.
		 */

		System.out.println("I think % means: solving for the remainder (what's left) of an inperfect division equation");

	}
}



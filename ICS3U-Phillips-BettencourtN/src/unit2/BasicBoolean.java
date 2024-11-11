package unit2;

/**
 * Description: Basic Boolean Worksheet
 * Date: November 4 2024
 * @author Noa Phillips-Bettencourt
 */

public class BasicBoolean {
	/**
	 * Entry point to the program 
	 * @param args unused 
	 */
	public static void main(String[] args) {
		//we've declared a variable called isPurple of boolean type
		//Recall: boolean holds either __1______ or __0________
		boolean isPurple = false;


		/*
      Boolean Operators, Expressions
		 */

		//boolean expressions are ways we can "calculate" whether
		//something is true or false

		int firstNum = 5;
		int secondNum = 10;
		double thirdNum = 5.5;

		//this prints out ___true ____ because ____the first number is five which is smaller than 10 ____________
		System.out.println("1: " + (firstNum < secondNum)); 

		//this prints out __false______ because _____the first number is smaller than the second ___________
		System.out.println("2: " + (firstNum > secondNum)); 

		//this prints out ___true_____ because ______the first number is even to the thrid but only because the third number was turned to an int rather than a double __________
		System.out.println("3: " + (firstNum <= (int)thirdNum)); 
		//this prints out _____true___ because _______the first number is 5 and the third number is 5.5 meaning it is either considered smaller or even depending on if you change the third number to an int. _________
		System.out.println("4: " + (firstNum <= thirdNum)); 

		/*Test out these boolean operators. Figure out the meaning
		 * > means: left side  is bigger than right side 
		 * < means: right side is bigger than left side 
		 * <= means: right side is either bigger or even to left side 
		 * >= means: left side is bigger or even to the right side 
		 * == means: both sides are equal 
		 * != means: not equal to
		 */

	}
}
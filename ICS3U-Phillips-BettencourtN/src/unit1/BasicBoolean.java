package unit1;

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

		//this prints out ___true ____ because ________________
		System.out.println("1: " + (firstNum < secondNum)); 

		//this prints out ________ because ________________
		System.out.println("2: " + (firstNum > secondNum)); 

		//this prints out ________ because ________________
		System.out.println("3: " + (firstNum <= (int)thirdNum)); 
		//this prints out ________ because ________________
		System.out.println("4: " + (firstNum <= thirdNum)); 

		/*Test out these boolean operators. Figure out the meaning
		 * > means:
		 * < means:
		 * <= means:
		 * >= means:
		 * == means:
		 * != means:
		 */

	}
}
package unit2;

/**
 * Description:  If Statement 1 worksheet 
 * Date: November 5 2024
 * @author Noa Phillips-Bettencourt
 */

public class IfStatements1 {
	/**
	 * Entry point to the program 
	 * @param args unused
	 */
	public static void main(String[] args) {
		int firstNum = 10;
		int secondNum = 30;

		System.out.println("Part 1: If");
		System.out.println("----------");
		if (firstNum > secondNum) {
			System.out.println("KEKW");
			System.out.println("OMEGLUL");
		}    

		//What prints out? Why?

		// Part 1: If 
		//-----------
		// It onyl prints that because the if statement is false and there is not statement for what to do otherwise therefore nothing is printed. 

		System.out.println("\nPart 2: If, Else");
		System.out.println("----------------");
		if (firstNum > secondNum) {
			System.out.println("KEKW");
			System.out.println("OMEGALUL");
		} else {
			System.out.println("XQCL");
		}

		//What prints out? Why?

		//prints on a new line = Part 2: If, Else
		// -----------
		// XQCL
		// The above is printed because the system read the first two lines of System.out.println as well as the else statement meaning, because the if statement is false it printed the else. 


		System.out.println("\nPart 3: If, Else if, Else");
		System.out.println("-------------------------");
		if (firstNum > secondNum) {
			System.out.println("KEKW");
			System.out.println("OMEGALUL");
		} else if (firstNum % 2 == 0 && secondNum % 3 == 0){
			System.out.println("sykSHY");
		} else {
			System.out.println("XQCL");
		}

		//What prints out? Why?

		// The first two line for syatem.out.println are printed 
		// The if statement is false and the else if statement is true because the first number is divisible by two and the second number is divisible by 3 therefore the program only executed sykSHY. 

		System.out.println("\nPart 4: What's the difference?");
		System.out.println("------------------------------");
		System.out.println(1);
		if (firstNum < secondNum) {
			System.out.println("KEKW");
			System.out.println("OMEGALUL");
		} else if (firstNum % 2 == 0 && secondNum % 3 == 0){
			System.out.println("sykSHY");
		} else {
			System.out.println("XQCL");
		}

		System.out.println(2);
		if (firstNum < secondNum) {
			System.out.println("KEKW");
			System.out.println("OMEGALUL");
		}

		if (firstNum % 2 == 0 && secondNum % 3 == 0){
			System.out.println("sykSHY");
		}

		if (!(firstNum < secondNum)) {
			System.out.println("XQCL");
		}

		//What prints out? Why?
		// The first three system.out.println were printed as well as KEKW and OMEGALUL because the if statement was true menaing the program ignored the rest of the program and only printed if. 
		// The second part printed KEKW OMEGALUL, sykSHY because each of those statements were true were as the last one was not. 
		
		//What is the difference between the first and second part?
		// The difference between the two parts is that the first part used if, else if and else meaning the program only evaluated the first true statement and ignored the rest where as in the second part it read each statement individually 
	}

}

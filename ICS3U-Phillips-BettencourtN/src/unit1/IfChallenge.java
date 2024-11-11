package unit1;

import java.util.Scanner;

/**
 * Description: If challenge worksheet 
 * Date: November 5 2024
 * @author Noa Phillips-Bettencourt 
 */

public class IfChallenge {
	/**
	 * Entry point to the program 
	 * @param args unused 
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("What is your favourite number?");
		int favouriteNumber = in.nextInt();

		if (favouriteNumber < 0) {
			System.out.println("Look on the bright side");
		} 
		if (favouriteNumber % 2==1) {
			System.out.println("That's a bit strange");
		}



	if (favouriteNumber % 3==0 || favouriteNumber % 2 ==0) {
		System.out.println(" You should start thinking about 6");
	} 
	else { System.out.println("keep wholesome");
	}
	

	
	int oneDigit = favouriteNumber % 10;
	if (oneDigit ==8) {
			System.out.println("I too am full!");
	}else if (oneDigit == 9) {
		System.out.println("Canada is a nice country.");
	} else {
		System.out.println("Don't count on it.");
		
	}
	/*

    (IF)



    ask for the user's favourite number.
    if the number is negative, say that they need to look on
    the bright side.  If their number is odd, say that it's a 
    bit strange.

    (IF, ELSE)

    If their number is divisible by 3 and by 2, 
    say that they should really consider thinking about 6, 
    otherwise say they can keep wholesome.  

    (IF, ELSE IF, ELSE)

    Finally, if the 
    ones digit of the number is 8, say that you too are full, 
    if the ones digit is 9, say Canada is a nice country, 
    and any other number should result in "don't count on 
    it". 
	 */


	}
}
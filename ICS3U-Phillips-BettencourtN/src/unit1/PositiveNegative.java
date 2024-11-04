package unit1;

import java.util.Scanner;

/**
 * Description:
 * Date:
 * @author Noa Phillips-Bettencourt 
 */
public class PositiveNegative {

	private int number;

	/**
	 * Entry point to program 
	 * @param args unused 
	 */
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number:");
		
		int number = sc.nextInt();
	

		if (number >= 0) {
			System.out.println(number + " is a positive number.");

		} else {
			System.out.println(number + " is a negative number.");

		}

		if (number % 7 == 0) {
			System.out.println(number + " is divisible by 7.");

		} else {
			System.out.println(number + " is not divisible by 7.");

		}
	}

}

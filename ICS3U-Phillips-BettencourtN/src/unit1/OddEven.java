package unit1;

import java.util.Scanner; 
/**
 * Description: OddEven Worksheet that takes an integer as input. 
 * Date: November 1 2024 
 * @author Noa Phillips-Bettencourt 
 */
public class OddEven {
	private int number; 

	public OddEven (int number) {
		this.number = number;
	}

	public void checkOddEven() {
		if (number % 2==0) {
			System.out.println(number + " is an even number.");
		} else { 
			System.out.println(number + " is an odd number.");
		}
	}


	/**
	 * Entry point to the program
	 * @param args unused 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		System.out.print("Enter an integer: ");
		int num = scanner. nextInt();

		OddEven oddevenChecker = new OddEven(num);
		oddevenChecker.checkOddEven();
		scanner.close();

	}

}

package unit1;

import java.util.Scanner;
/** 
 * Description: Character Worksheet 
 * Date:October 12 2024
 * @author Noa Phillips-Bettencourt 
 */
public class InputChars {
	/** 
	 * Entry point to the program 
	 * @param args unused 
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);

		char ch1, ch2, ch3;
		System.out.println("Type in any three characters on the keyboard");
		System.out.println("Press <Enter> after each.");
		ch1 = sc.nextLine().charAt (0);
		ch2 = sc.nextLine().charAt (0);
		ch3 = sc.nextLine().charAt (0);
		System.out.println();
		System.out.print("Together these 3 letters spell: " + (ch1 + ch2 +ch3));

	}

}

package unit2;
/**
Description: Randomness worksheet
Date: November 18 2024
@author: Noa Phillips-Bettencourt
 */


public class Randomness {
	/**
	 * Entry point to the program 
	 * @param args unused
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(Math.random());
			int y = (int)(Math.random()*901)+100;
			System.out.println(y);
		}

		//Run the program a few times. What do you think is the 
		//range of the numbers generated?
		// The range of the numbers is any integer greater than 0.0 and smaller but not including 1.0

		//Read the demo program. Write the code so that the program 
		//will produce a random number between 100 and 1000.

	}
}

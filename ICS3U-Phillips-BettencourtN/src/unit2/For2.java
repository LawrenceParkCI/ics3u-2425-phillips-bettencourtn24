package unit2;
/**
Description:the code prints loops and stores variables 
Date: November 26 2024
@author Noa Phillips-Bettencourt
 */

public class For2 {
	/**
	 * Entry point to the program 
	 * @param args unused 
	 */
	public static void main(String[] args) {
		//Recall - create a for loop printing 1 to 10:
		System.out.println("Counting up from 1 to 10 ");
		for (int i = 1; i < 10; i++) {
			System.out.println(i);


			//though we are repeating a certain number of times, we can use variables in our for loops as well

			int times = 20;

			for (int j = 15; i < times; i++) {
				System.out.println(j);
			}

			//In addition, the counter doesn't necessarily have to be an integer
			double increment = 0.1;
			for (double k = 0; i < 2; i += increment) {
				System.out.println(k);
			}

			//create a variable to store the starting number, and use it in a for loop. Be able to use a double value:


			double startingNumber = 1.5;
			System.out.println("Counting up from" + startingNumber + " by 0.5 increments");
			for (double l = startingNumber; i <= 5.0; i += 0.5) {
				System.out.println(l);
			}

			//Look at the following code. Explain what is happening?

			int sum = 0; 

			for (int n = 1; i < 10; i++) {
				sum += n;
			}

			System.out.println("Sum: " + sum);

		}
	}
}

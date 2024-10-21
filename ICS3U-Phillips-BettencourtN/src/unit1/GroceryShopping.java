package unit1;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;

/** 
 * Description:
 * Date: 21 October, 2024
 * @author Noa Phillips- Bettencourt 
 */
public class GroceryShopping {
	/** 
	 * Entry point to the program. 
	 * @param args unused 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		

		//Variables 
		String item1, item2;
		Double price1, price2;
		int quantity1, quantity2;
		
		System.out.format("%-80s%n", " || $$$ \\\\\\\\ ============= < \"Noa's Grocery\" > ============== //////// $$$ || ");


		// Gathering user input on their items
		System.out.format("\n");
		System.out.println( "Hello Customer");
		System.out.println(" \n Welcome to Noa's Grocery");
		System.out.print(" What would you like to buy?");
		item1 = sc.nextLine();
		System.out.print(" How much does it cost? $");
		price1 = sc.nextDouble();
		System.out.print("How many are you buying?");
		quantity1 = sc.nextInt();
		sc.nextLine();
		System.out.println("Perfect!");

		System.out.print(" What would you like to buy?");
		item2 = sc.nextLine();
		System.out.print(" How much does it cost? $");
		price2 = sc.nextDouble();
		System.out.print("How many are you buying?");
		quantity2 = sc.nextInt();
		sc.nextLine();
		System.out.println("Thank You!");
		
		//Calculating total prices
		double totalPrice1 = price1 * quantity1;
		
		//Printing their receipt
		System.out.println("\n This is your receipt!");
		System.out.println("Noa's Grocery");
		
		//Finding the date and time for printing
		LocalDate date  = LocalDate.now();
		LocalTime time = LocalTime.now();
		
		System.out.println(date);
		System.out.println(time);
		
		//Printing the item information based on user input
		System.out.printf("\n%-15s|%-15s|%-15s|%-15s", "Item", "Price", "Quant.", "Total Price");
		System.out.println("\n-----------------------------------------------------------------");
		System.out.printf("\n%-15s|%-5s%10s|%-15s|%-5s%10s", item1, "$", price1 + " ", quantity1, "$", totalPrice1 + " ");
		System.out.format("\n");
		System.out.format("\n");
		
		System.out.println("Thank you for shopping at Noa's Grocery we hope to see you again soon!");
		

	}

}

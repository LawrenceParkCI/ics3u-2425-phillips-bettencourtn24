package unit1;
/**
 * Description: NFOutput worksheet 
 * Date: 17 October, 2024
 * @author Noa Phillips Bettencourt
 */
import java.text.NumberFormat;
import java.util.Scanner;

public class NFOutput {
/**
 * Entry point to the program
 * @param args unused 
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final double TAX_RATE = 0.13;
		NumberFormat money = NumberFormat.getCurrencyInstance();
		NumberFormat percent = NumberFormat.getPercentInstance();

		double cost;
		System.out.print("Please enter the cost of an item then press <Enter>: $");
		cost = sc.nextDouble();
		double total = cost + (cost * TAX_RATE);
		System.out.println("The cost of your item with tax is " + money.format(total));
		System.out.println("The tax rate is " + percent.format(TAX_RATE));

		//How can you change how your value is displayed?
		// You can use a decimal format instead of percentage to isplay the tax. 
		// ex. NumberFormat money = NumberForma.getCurrencyInstance();

		//What other formats does NumberFormat offer?
		// Number format offers: compact number instance, Integer instance, percentage instance, and Currency instance formats.   

		sc.close();
	}

}

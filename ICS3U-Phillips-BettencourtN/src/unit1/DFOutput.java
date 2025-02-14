package unit1;
/** 
 * Description: DFOutput Worksheet 
 * Date: 17 October, 2024
 * @author Noa Phillips-Bettencourt 
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class DFOutput {
	/** 
	 * Entry point to the program 
	 * @param args unused 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//Run the following program with a cost of 10.00.
		//What value is displayed in the output?

		final double TAX_RATE = 0.13;
		DecimalFormat money = new DecimalFormat("$#,###,##0.00");
		DecimalFormat percent = new DecimalFormat("#.#%");

		double cost;
		System.out.print("Please enter the cost of an item then press <Enter>: $");
		cost = sc.nextDouble();
		double total = cost + (cost * TAX_RATE);

		System.out.println("The cost of your item with tax is " + total);


		//Change the above print statement on line 19 to:
		System.out.println("The cost of your item with tax is " + money.format(total));
		//Run the program again, how is the output different? Why?
		// There is an extra decimal place.


		//Modify the parameter for the DecimalFormat on line 15 to be "$0.00"
		//Run the program again with the cost of 10, how is the output different?
		// The output is different because this output includes the dollar sign. 


		//Modify the parameter for the DecimalFormat on line 15 to be "$0.##"
		//Run the program again with the cost of 10, how is the output different?
		// The output included one less decimal place. 


		//Modify the parameter for the DecimalFormat on line 15 to be "$0.##"
		//Calculate 10.50 x 1.13 = 11.865
		//Run the program again with the cost of 10.50, what is happening?
		// The output rounded the number to 2 decimal places. 


		//Modify the parameter for the DecimalFormat on line 15 as you think is appropriate for money.
		//Run the program again with the cost of 123456, what is displayed?
		// The cost of your item with tax is 139505.28.


		//Modify the parameter for the DecimalFormat on line 15 to be "$#,###,##0.00"
		//Run the program again with the cost of 123456, how is the output different? Explain what is happening.
		// $139,505.28 There are comas. 


		//Uncomment the following print line, and run the program with any value for the cost.
		//What value is printed for the TAX_RATE?
		// The tax rate is 0.13
		System.out.println("The tax rate is " + percent.format(TAX_RATE));

		//Change the above print statement to format the TAX_RATE using the percent DecimalFormat instance.
		//Run the program again with any cost, how is the TAX_RATE displayed differently?
		// The tax rate is displayed diffeently because it now displayes a percentage rather than a decimal number. 

		sc.close();
	}

}

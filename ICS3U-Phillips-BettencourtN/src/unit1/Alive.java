package unit1;

import java.util.Scanner;
/**
 * Description: Alive worksheet 
 * Date: October 23, 2024
 * @author Noa Phillips-Bettencourt
 */
public class Alive {
	/**
	 * Entry point to the program 
	 * @param args unused 
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); 
		// declare variables 
		int year1, month1, day1, year2, month2, day2, tdays;

		//get the user input
		System.out.println("ALIVE");
		System.out.print("Type in the year you were born and <ENTER>:");
		year1 = sc.nextInt();

		System.out.print("Enter the month # you were born and <ENTER>:");
		month1 = sc.nextInt();

		System.out.print("Enter the day you were born and <ENTER>:");
		day1 = sc.nextInt();

		System.out.print("Type in the current year and <Enter>:");
		year2 = sc.nextInt();

		System.out.print("Enter the current month # and <Enter>:");
		month2 = sc.nextInt();

		System.out.print("Enter the current day and <Enter>:");
		day2 = sc.nextInt();

		//print the output 
		System.out.format("\n");
		System.out.println("Enter your birthdate :");
		System.out.println("year: " + year1);
		System.out.println("Month: " + month1);
		System.out.println("Day:" + day1);
		System.out.println("Enter Todays Date:");
		System.out.println("Year: " + year2);
		System.out.println("Month: " + month2);
		System.out.println("Day: " + day2);
		System.out.println(" You have been alive for " + (tdays = ((year2 - year1)*365) + ((month2 - month1)*30) +((day2 - day1))) + "days");
		System.out.println(" you have been asleep for " + (tdays)*8);
		sc.close();


	}

}

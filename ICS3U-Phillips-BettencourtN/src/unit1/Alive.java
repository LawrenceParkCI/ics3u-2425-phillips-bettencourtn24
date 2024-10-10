package unit1;

import java.util.Scanner;

public class Alive {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); 
		//			declare variables 
		int month, day, year, born, today, daysperyear, sleep;
		//get the user input
		System.out.println("AREA PROGRAM");
		System.out.println("Type in the month you were born and <ENTER>:");
		month = sc.nextInt();
		
		System.out.println("Type in the day you were born and <ENTER>:");
		day = sc.nextInt();
		
		System.out.println("Type in the year you were born and <ENTER>:");
		year = sc.nextInt();

		System.out.print("Type in today's date and <Enter>:");
		today = sc.nextInt();

		System.out.println("Type in how many days are in a year and <Enter>:");
		daysperyear = sc.nextInt();

		System.out.println("Type in how hours of sleep you get everyday and <Enter>:");
		sleep = sc.nextInt();


		int length = 0;
		int width = 0;
		int depth = 0;
		//calculate the area
		int days = length * width* depth;

		//print the output 
		System.out.println(" You have been alive for " + days); 
		sc.close();
		
		String hours = null;
		System.out.println("You have slept for " + hours);
		sc.close();


	}

}

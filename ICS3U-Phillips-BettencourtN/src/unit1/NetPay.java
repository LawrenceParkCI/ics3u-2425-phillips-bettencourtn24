package unit1;

import java.util.Scanner;

public class NetPay {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); 
		//				declare variables 
		double insurance, wage, hours, tax;
		//get the user input
		System.out.println("AREA PROGRAM");
		System.out.println("Type in the insurance deducted and <ENTER>:");
		insurance = sc.nextInt();

		System.out.print("Type in the wage per hour and <Enter>:");
		wage = sc.nextInt();

		System.out.println("Type in the hours worked and <Enter>:");
		hours = sc.nextInt();
		
		System.out.println("Type in the mandatory tax deduction and <Enter>:");
		tax = sc.nextDouble();


		//calculate the area
		double netpay = (hours*wage-insurance) - tax*(hours*wage-insurance);

		//print the output 
		System.out.println(" The net pay for an employee is " + netpay); 
		sc.close();

	}

}

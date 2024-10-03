package unit1;

import java.util.Scanner;

/**
 * Description: Starting a new program called InputFP and working with floating-points
 * Date: Octobr 3, 2024
 * @author Noa Phillips-Bettencourt
 */
public class InputFP {
/*
 * 
 */
	public static void main(String[] args) {
		
		Object system;
		Scanner sc = new Scanner(System.in);
		double num1, num2; 
		System.out.println("Type in one floating-point ad <Enter>:");
		num1= sc.nextDouble();
		System.out.println("Type in another floating-point and <Enter>:");
		num2 = sc.nextDouble();
		
		System.out.println();
		
		System.out.println("The first number entered was " + num1);
		System.out.println("the second number entered was" + num2);
		
	}

}

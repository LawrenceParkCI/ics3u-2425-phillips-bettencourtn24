package unit1;

import java.util.Scanner;
/** 
 * Description: Rectangle Area Worksheet 
 * Date: October 15 2024
 * @author Noa Phillips-Bettencourt
 */
public class RectangleArea {
	/**
	 * Entry point to the program 
	 * @param args unused 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		//		declare variables 
		int length, width, depth;
		//get the user input
		System.out.println("AREA PROGRAM");
		System.out.println("Type in the length of the rectangle and <ENTER>:");
		length = sc.nextInt();

		System.out.print("Type in the width of the rectangle and <Enter>:");
		width = sc.nextInt();

		System.out.println("Type in the depth of the rectangle and <Enter>:");
		depth = sc.nextInt();


		//calculate the area
		int volume = length * width* depth;

		//print the output 
		System.out.println(" The volume of your rectangle is " + volume); 
		sc.close();

	}

}

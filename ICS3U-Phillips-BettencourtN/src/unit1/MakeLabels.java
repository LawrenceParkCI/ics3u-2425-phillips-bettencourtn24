package unit1;

import java.util.Scanner;
/**
 * Description: This program teaches the programmer about scanner
 * Date: October 2, 2024
 * @author Noa Phillips-Bettencourt
 */
public class MakeLabels {

	/** 
	 * This is the netry point to the program 
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		String subject;
		String name;
		System.out.println("Type in the subject and press <Enter>");
		subject = sc.nextLine();

		System.out.println("Type in the name and press <Enter>");
		name = sc.nextLine();

		System.out.println();
		System.out.println("******************************");
		System.out.println(name);
		System.out.println(subject);
		System.out.println("******************************");
		sc.close();
	}

}

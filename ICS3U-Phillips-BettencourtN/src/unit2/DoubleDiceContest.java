package unit2;

import java.util.Scanner;
/**
 * Description: Double dice contest worksheet
 * Date: November 19 2024 
 * @author Noa Phillips-Bettencourt
 */
public class DoubleDiceContest {
	/**
	 * Entry point to the program 
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		//user role
		System.out.println("The user roles:");
		int die1 = (int)(Math.random()*6)+1; 
		int die2 = (int)(Math.random()*6)+1;

		System.out.println(die1);
		System.out.println(die2);

		// User total calculations
		int userTotal = die1+ die2; 
		System.out.println("User dice total is: " + userTotal);
		System.out.println("");

		//Computer role 
		System.out.println("The computer roles:");
		int die3 = (int)(Math.random()*6)+1;
		int die4 = (int)(Math.random()*6)+1;

		System.out.println(die3);
		System.out.println(die4);

		//Computer total calculations
		int computerTotal = die3+ die4; 
		System.out.println ("The computer's dice total is: " + computerTotal);
		
		System.out.println("");
		System.out.println("--------------------------------");
		System.out.println("");
		
		//Results from dice roles
		if (userTotal > computerTotal) {
			System.out.println("The user won! Congradulations.");
			
		} else if (userTotal < computerTotal) {
			System.out.println("The computer won.");
			
		}else {
			System.out.println("It's a tie!");
		}
		
		in.close();

		/*
		 * Write code that simulates rolling two dice for the user and then two dice for the computer. 
		 * The program should output the total of the two dice for both the user and the computer, 
		 * then announce who won: the computer, the user, or say it was a tie.
		 */



	}

}


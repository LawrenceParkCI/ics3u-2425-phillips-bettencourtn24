package unit2;

import java.util.Scanner;
/**
Description: While worksheet 
Date: November 21 2024 
@author Noa Phillips-Bettencourt 
*/
public class While {
	/**
	 * Entry point to the program 
	 * @param args unused 
	 */
 public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   System.out.println("How many people are you planning to see?");

   //Why do you think I coded it this way?
   int numPeople = Integer.parseInt(in.nextLine());

   while (numPeople > 0) {
     System.out.print("What is this person's name? ");

     //Why do you think the variable is declared here?
     String name = in.nextLine();
     System.out.println("Welcome, " + name + "!");

     numPeople = numPeople - 1;
   }
   

   //Run the code Using the debugger. 
   
   //Explain the code in your own words
   // The code asks how many people you are planning to see and based off the number you input it will ask you that many times "what is this person's name?". 

   //What code is repeated?
   // "What is this person's name"
   
   //When does it decide whether to repeat or not?
   // Based on the number you originally inputed it will repeat the "What is this person's name?" question that many many times. 
   
   //What is the condition for repeating?
   // repeat "What is this person's name?" until it is repeated the amount of times the user answered to the question "how many people are you planning to see?".  


   //What is the difference between a while loop and a do-while loop?
   // The do-while loop is used when you don't know how mnay times you want to loop, while the while loop is used when you want to repeat something a certain number of times. 

   //Create a while loop that asks for a word, 
   //and prints it out 20 times.
   
	System.out.println("Enter a word:");
	String word = in.nextLine();
	int repeat = 1;
	 while (repeat<=20) {
		System.out.println(word);
		repeat ++;
 }

	in.close();
 }
}

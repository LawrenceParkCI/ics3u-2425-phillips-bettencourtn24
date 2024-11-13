package unit2;
import java.util.Scanner;

/**
 * Description: If challenge 3 worksheet
 * Date: November 13 2024
 * @author Noa Phillips-Bettencourt
*/

public class IfChallenge3 {
	/**
	 * Entry point to the program 
	 * @param args unused
	 */
  public static void main(String[] args) {
    //This is for the portfolio

	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Ready to start a quiz? (yes/no):");
	String userResponse = scanner.nextLine().trim().toLowerCase();
	
	//If the user says "yes", start the quiz. 
	
	if (userResponse.equals("yes")) {
		System.out.println("Great! Let's begin the quiz.");
		
		System.out.println("Question 1: What is the largest country in the world?");
		System.out.println("a) Canada n/ b) Russia n/ c) China n/ d) United States");

		
		System.out.println("Question 2: What is the capital of France?");
		System.out.println("a) Geneva n/ b) Lyon n/ c) Paris n/ d) Toronto");
		
		
		System.out.println("Question 3: ")
		
		
		
	} 
	else if (userResponse.equals("no")){ 
		System.out.println("That's too bad. Maybe next time.");
	}else {
		System.out.println(" Sorry, I don't understand that. please type in yes or no. ");
		
	}
	
	scanner.close();
    /*
    Write an interactive quiz. It should ask the user three 
    multiple-choice or true/false questions about something. 
    It must keep track of how many they get wrong, and print 
    out a "score" at the end.

    Sample:

    Are you ready for a quiz?  N
    Okay, here it comes!

    Q1) What is the capital of Alaska?
      1) Melbourne
      2) Anchorage
      3) Juneau

    > 3

    That's right!
    */
  }
}

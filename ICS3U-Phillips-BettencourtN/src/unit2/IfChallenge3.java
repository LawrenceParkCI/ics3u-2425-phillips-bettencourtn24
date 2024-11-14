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

		Scanner scanner = new Scanner(System.in);

		// Keep track of score
		int score = 0; 
		int totalQuestions = 5;

		System.out.println("Ready to start a quiz? (yes/no):");
		String userResponse = scanner.nextLine().trim().toLowerCase();

		//If the user says "yes", start the quiz. 

		if (userResponse.equals("yes")) {
			System.out.println("Great! Let's begin the quiz. ");
			System.out.println("");

			// Question 1
			System.out.println("Question 1: What is the largest country in the world?");
			System.out.println("a) Canada");
			System.out.println("b) Russia");
			System.out.println("c) China");
			System.out.println("d) United States");
			String answer1= scanner.nextLine().trim().toLowerCase();
			if (answer1.equals("b")) {
				System.out.println("That's correct!");
				score++;
			} else {
				System.out.println("You are incorrect. The correct answer is b) Russia");
			}

			//Question 2
			System.out.println("");
			System.out.println("Question 2: What is the capital of France?");
			System.out.println("a) Geneva");
			System.out.println("b) Lyon");
			System.out.println("c) Paris");
			System.out.println("d) Toronto");
			String answer2 = scanner.nextLine().trim().toLowerCase();
			if (answer2.equals("c")) {
				System.out.println("That's correct!");
				score++;
			} else {
				System.out.println("You are incorrect. The correct answer is c) Paris.");
			}

			//Question 3
			System.out.println("");
			System.out.println("Question 3: True/False Spanish is the offical spoken language in Mexico. ");
			System.out.println("a) True");
			System.out.println("b) False");
			String answer3 = scanner.nextLine().trim().toLowerCase();
			if (answer3.equals("a")) {
				System.out.println("That's correct!");
				System.out.println("Almost done.");
				score++;
			} else {
				System.out.println("You are incorrect. The correct answer is a) True.");
			}

			// Question 4
			System.out.println("");
			System.out.println("Question 4: How many continents are there in the world?");
			System.out.println("a) 4");
			System.out.println("b) 8");
			System.out.println("c) 7");
			System.out.println("d) 6");
			String answer4 = scanner.nextLine().trim().toLowerCase();
			if (answer4.equals("c")) {
				System.out.println("That's correct!");
				score++;
			} else {
				System.out.println("You are incorrect. The correct answer if c) 7");
			}

			// Question 5
			System.out.println("");
			System.out.println("Question 5: Which rapper is Rihanna dating? ");
			System.out.println("a) Drake");
			System.out.println("b) lil Baby");
			System.out.println("c) lil Tjay");
			System.out.println("d) A$AP Rocky");
			String answer5 = scanner.nextLine().trim().toLowerCase();
			if (answer5.equals("d")) {
				System.out.println("That's correct!");
				score++;
			} else {
				System.out.println("You are incorrect. The correct answer is d) A$AP Rocky");
			}

			// Calculate percentage 
			double percentage = ((double) score / totalQuestions) * 100;
			//Final Score
			System.out.println("");
			System.out.println("Quiz complete!");
			System.out.println("Your score is : " + score + " out of " + totalQuestions + " (" + String.format("%.2f", percentage) + "%)");
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

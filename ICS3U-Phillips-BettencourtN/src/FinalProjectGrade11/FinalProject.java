package FinalProjectGrade11;

import java.util.Scanner;
import java.util.Random;
/**
 * Description: This program contains code for a guessing game called Whisper Box 
 * Date: January 8 2025
 * @author Noa Phillips-Bettencourt
 */
public class FinalProject {

	static Scanner scanner = new Scanner(System.in);
	static Random random = new Random();

	/**
	 * Entry point to the program 
	 * @param args unused
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to the Whisper Box Guessing Game!");
		System.out.println("With Riddles and clues try to guess what's inside the mystery box.");
		System.out.println("Good luck! Press the space bar to continue.");

		// the game loop for 10 levels
		for(int level=1;level<=10;level++) {
			playLevel(level);
		}
	}
	/**
	 * Method to play a single level of the game. 
	 * @param level the current level of the game.
	 */
	public static void playLevel(int level) {
		String mysteryItem = getMysteryItem(level);
		String[]clues = getClues(mysteryItem);
		int guessesLeft = 3; // player has three guesses per level

		System.out.println("Level" +level);
		System.out.println("I have many keys yet can’t open a door. What am I?");
		for (int i = 0; i < clues.length; i++) {
			if (guessesLeft>0);
			System.out.println("Clue \" + (i + 1) + \": \" + clues[i])");
			System.out.print("Your guess: ");
			String playerGuess = scanner.nextLine().toLowerCase();
			
			String piano = null;
			if (playerGuess.equals(piano.toLowerCase())) {
				System.out.println("Correct! You guessed it!");
				break; // Player guessed correctly can now exit loop
			}else {
				guessesLeft--;
				if (guessesLeft>0) {
					System.out.println("Incorrect guess! You have" +guessesLeft+ "Guesses Left");
				} else {
					System.out.println("Out of guesses!the correct answer was piano.");
				}
			}
		}
	}
	private static String[] getClues(String mysteryItem) {
		// TODO Auto-generated method stub
		return null;
	}
	private static String getMysteryItem(int level) {
		// TODO Auto-generated method stub
		return null;
	}
}
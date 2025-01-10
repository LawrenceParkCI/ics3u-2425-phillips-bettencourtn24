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
		System.out.println("Good luck! Press any key and enter to continue.");
		scanner.nextLine(); 

		int level;
		// the game loop for 10 levels
		for(level=1;level<=10;level++) {
			if (playLevel(level)==false) {
				System.out.println("Game Over.");
				break;
			}
		}
		
		
		
		}
	/**
	 * Method to play a single level of the game. 
	 * @param level the current level of the game.
	 */
	public static boolean playLevel(int level) {
		String [] mysteryItem = {"piano","pen", "clock", "mirror", "Watermelon", "Umbrella", "Moon", "Shoes","book", "" };
		String [][] clues = {
				{"I have many keys, yet can't open doors. What am I?",
				"I am played with fingers, but I am not a game. What am I?", 
				"You sit infront of me to play me. What am I?"},
				
				{"I’m a small conductor of thought and can leave a mark that endures with age. What am I?", 
				"Though I have no feet, I leave a trace. What am I?", 
				"I write on paper, but I don’t erase. What am I?"},
				
				{"I am always running but never moving, with hands that reach, but never touch. What am I?",
				"I show you what's ahead, but never travel and help you plan, but am never in the race. What am I?",
				"With hands that move but never touch, I help you know when it's time to rush. What am I?"},
				
				{"I show you truth, but don’t speak a word, I stay silent, though my image is heard. What am I?",
				"Look at me and you might see, What you are, who you might be. What am I?",
				"I show your face, but I'm not your twin, you can see yourself, just look within. What am I?"},
				
				{},
				
				{"I appear only when the world weeps,I’m often carried, though I can’t walk or speak. What am I?",
				"I am designed to offer protection from above. What am I?",
				"I am a shield for a brief time, you might forget me, yet I will be missed when you can’t find. What am I?"},
				
				{"I move in silence, pulling tides with might, but you will never hear my footsteps at night. What am I?",
				"I’m far from you, yet you know me well, I change my shape and face, but I never tell. What am I?",
				"I shine without a source, though I’m not the sun. What am I?"},
				
				{"I’m worn to protect, yet I have no skin, I’ll travel the world without moving a limb. What am I?", 
				"I am made for walking, but I do not take a step, I have two companions but never any breath. What am I?",
				"I can be boots or sandals, or something between. What am I?"}, 
				
				{},
				
				{}
				
				
				
		};
		int guessesLeft = 3; // player has three guesses per level

		System.out.println("Level " +level);
		System.out.println("Clue 1: " +clues[level-1][0]);
		while(guessesLeft>0){
			System.out.print("Your guess: ");
			String playerGuess = scanner.nextLine().toLowerCase();

			String piano = null;
			if (playerGuess.equalsIgnoreCase(mysteryItem[level-1])) {
				System.out.println("Correct! You guessed it!");
				System.out.println("");
				break; // Player guessed correctly can now exit loop
			}else {
				guessesLeft--;
				if (guessesLeft>0) {
					System.out.println("Incorrect guess! You have " +guessesLeft+ " Guesses Left");
				} else {
					System.out.println("Out of guesses! The correct answer was: " + mysteryItem);
					return false;
				}
			
			if (guessesLeft>0 && !playerGuess.equalsIgnoreCase(mysteryItem[level-1])) {
				System.out.println("\nClue " + (4-guessesLeft) + ": " + clues[level-1][3-guessesLeft]);
			 
			}
		}
	}
		return true;

}
		}

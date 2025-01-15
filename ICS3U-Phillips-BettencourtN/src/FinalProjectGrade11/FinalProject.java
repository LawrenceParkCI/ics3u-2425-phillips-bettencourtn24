package FinalProjectGrade11;

import java.util.Scanner;

import javax.imageio.ImageIO;

import hsa_new.Console;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
/**
 * Description: This program contains code for a guessing game called Whisper Box, where the user is given a riddle and must guess what object is in the box using it.  
 * Date: January 8 2025
 * @author Noa Phillips-Bettencourt
 */
public class FinalProject {

	// Images used in the game 
	private static BufferedImage intro = null;
	private static BufferedImage mainbackground = null;
	private static BufferedImage congratulations = null;
	private static BufferedImage gameover = null;

	// Console for output and random number generator
	static Console c = new Console();
	static Random random = new Random();

	/**
	 * Entry point to the program 
	 * @param args unused
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {

		//Loop images for the game
		try {
			intro = ImageIO.read(new File ("src/FinalProjectGrade11/Intro.png"));
			mainbackground = ImageIO.read(new File ("src/FinalProjectGrade11/Mainbackground.png"));
			congratulations = ImageIO.read(new File ("src/FinalProjectGrade11/congratulations.png"));
			gameover = ImageIO.read(new File ("src/FinalProjectGrade11/gameover.png"));

		}catch (IOException e) {
			e.printStackTrace();
		}

		// Show introductory image and message
		c.drawImage (intro,  0, 100, 600, 500, null);
		c.println("Welcome to the Whisper Box Guessing Game!");
		Thread.sleep(2000);
		c.println("With riddles and clues try to guess what's inside the mystery box.");
		Thread.sleep(3000);
		c.println("You will be given three attempts to guess each object.");
		Thread.sleep(3000);
		c.println("Good luck! Press any key and enter to continue.");
		c.readLine(); 

		int level;
		// Loop through 10 levels of the game
		for(level=1;level<=10;level++) {
			if (playLevel(level)==false) {
				break;
			}
		}
		
		showFinalScreen(level);
	}

	/**
	 * Method to show the final screen with either the congratulations or game over message. 
	 * @param Level the current level, used to determine if the user completed all levels. 
	 */
	public static void showFinalScreen(int level) {
		// After all levels are completed, show congratulations
		c.clear();
		if (level>10) {
			c.drawImage (congratulations,  0, 150, 500, 350, null);
			c.println("Congratulations you have completed all 10 levels!");
		} else { // If game was ended before completing all levels
			c.drawImage (gameover,  0, 0, 600, 500, null);
			c.println("Game Over.");
		}

	}
	/**
	 * Method to play a single level of the game. 
	 * @param level the current level of the game.
	 * @return true if the player guesses correctly, false if they run out of attempts
	 */
	public static boolean playLevel(int level) {

		// Mystery items and their associated clues 
		String [] mysteryItem = {"Piano", "Pen", "Clock", "Mirror", "Watermelon", "Umbrella", "Moon", "Shoes","Book", "Candle" };
		String [][] clues = {
				{"I have many keys, yet can't open doors. What am I?",
					"I am played with fingers, but I am not a game. What am I?", 
				"You sit infront of me to play me. What am I?"},

				{"I’m a small conductor of thought and can leave a mark that endures with age. "
						+ "What am I?", 
						"Though I have no feet, I leave a trace. What am I?", 
				"I write on paper, but I don’t erase. What am I?"},

				{"I am always running but never moving, with hands that reach, \nbut never touch. What am I?",
					"I show you what's ahead, but never travel and help you plan, \nbut am never in the race. What am I?",
				"With hands that move but never touch, I help you know when it's time to rush. What am I?"},

				{"I show you truth, but don’t speak a word, I stay silent, \n though my image is heard. What am I?",
					"Look at me and you might see, What you are, who you might be. \nWhat am I?",
				"I show your face, but I'm not your twin, you \ncan see yourself, just look within. \nWhat am I?"},

				{"My exterior hides within, I thrive in the heat, though I'm chilled when you begin. What am I? ",
					"Though I’m mostly water, I’m a fruit with weight, I’m often split \nopen but never cut with hate. What am I?",
				"I’m green on the outside, red on the inside, and sweet to eat. \nWhat am I?"},

				{"I appear only when nature weeps, I’m often carried, though I can’t walk or speak. What am I?",
					"I am designed to offer protection from above. What am I?",
				"I am a shield for a brief time, you might forget me, yet I will be \nmissed when you can’t find. What am I?"},

				{"I move in silence, pulling tides with might, but you will never hear \nmy footsteps at night. What am I?",
					"I’m far from you, yet you know me well, I change my shape and face, \nbut I never tell. What am I?",
				"I shine without a source, though I’m not the sun. What am I?"},

				{"I’m worn to protect, yet I have no skin, I’ll travel the world without \nmoving a limb. What am I?", 
					"I am made for walking, but I do not take a step, I have \ntwo companions but never any breath. What am I?",
				"I can be boots or sandals, or something between. What am I?"}, 

				{"I hold knowledge and adventures, but I don’t have a \nmind of my own. What am I?",
					" I have a cover but no clothes. What am I?",
				"I contain stories, but I don’t speak. What am I?"},

				{"I shine bright but don’t last forever. What am I?",
					"I burn but never get hot to the touch. What am I?",
				"I melt away as I give light, but I’m not a fire. What am I?"}
		}; 

		//Player has three guesses per level
		int guessesLeft = 3; 

		//Clear previous output 
		c.clear();

		//Draw the background image
		c.drawImage (mainbackground,  0, 0, 600, 500, null); 

		//Display current level
		c.println("Level " +level);

		//Show the first clue
		c.println("Clue 1: " +clues[level-1][0]);

		//Loop for the player's guesses
		while(guessesLeft>0){
			c.print("Your guess: ");

			// Get player's guesses
			String playerGuess = c.readLine().toLowerCase();

			String piano = null;

			//Check if the guess is correct
			if (playerGuess.equalsIgnoreCase(mysteryItem[level-1])) {
				c.println("Correct! You guessed it!");
				c.println("");
				break; // Exit loop if guessed correctly

			}else {
				guessesLeft--; //Deduct one guess

				// If the player has guesses left, show remaining guesses
				if (guessesLeft>0) {
					c.println("Incorrect guess! You have " +guessesLeft+ " Guesses Left");
				} else {
					// If out of guesses show the correct answer
					c.println("Out of guesses! The correct answer was: " + mysteryItem[level-1]);
					return false; //End the game for this level
				}

				if (guessesLeft>0 && !playerGuess.equalsIgnoreCase(mysteryItem[level-1])) {
					c.println("\nClue " + (4-guessesLeft) + ": " + clues[level-1][3-guessesLeft]);

				}
			}
		}
		return true; // If the player guessed correctly or still had guesses, return true

	}
}

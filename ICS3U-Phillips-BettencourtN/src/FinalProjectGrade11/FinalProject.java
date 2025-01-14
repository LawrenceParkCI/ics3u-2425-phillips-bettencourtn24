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

	private static BufferedImage intro = null;
	private static BufferedImage mainbackground = null;
	private static BufferedImage congratulations = null;
	static Console c = new Console();
	static Random random = new Random();

	/**
	 * Entry point to the program 
	 * @param args unused
	 */
	public static void main(String[] args) {
			
		try {
			intro = ImageIO.read(new File ("src/FinalProjectGrade11/Intro.png"));
			mainbackground = ImageIO.read(new File ("src/FinalProjectGrade11/Mainbackground.png"));
			congratulations = ImageIO.read(new File ("src/FinalProjectGrade11/congratulations.png"));
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		c.drawImage (intro,  0, 100, 600, 500, null);
		c.println("Welcome to the Whisper Box Guessing Game!");
		c.println("With riddles and clues try to guess what's inside the mystery box.");
		c.println("You will be given three attempts to guess each object.");
		c.println("Good luck! Press any key and enter to continue.");
		c.readLine(); 

		int level;
		// the game loop for 10 levels
		for(level=1;level<=10;level++) {
			if (playLevel(level)==false) {
				c.println("Game Over.");
				break;
			}
		}
		
	// After completing all 10 levels 
		if (level>10) {
			c.drawImage (congratulations,  0, 150, 500, 350, null);
			c.println("Congratulations you have completed all 10 levels!");
		}

	}
	/**
	 * Method to play a single level of the game. 
	 * @param level the current level of the game.
	 */
	public static boolean playLevel(int level) {
		String [] mysteryItem = {"Piano", "Pen", "Clock", "Mirror", "Watermelon", "Umbrella", "Moon", "Shoes","Book", "Candle" };
		String [][] clues = {
				{"I have many keys, yet can't open doors. What am I?",
					"I am played with fingers, but I am not a game. What am I?", 
				"You sit infront of me to play me. What am I?"},

				{"I’m a small conductor of thought and can leave a mark that endures with age. "
						+ "What am I?", 
					"Though I have no feet, I leave a trace. What am I?", 
				"I write on paper, but I don’t erase. What am I?"},

				{"I am always running but never moving, with hands that reach, but never touch. What am I?",
					"I show you what's ahead, but never travel and help you plan, but am never in the race. "
					+ "What am I?",
				"With hands that move but never touch, I help you know when it's time to rush. What am I?"},

				{"I show you truth, but don’t speak a word, I stay silent, though my image is heard. What am I?",
					"Look at me and you might see, What you are, who you might be. What am I?",
				"I show your face, but I'm not your twin, you can see yourself, just look within. What am I?"},

				{"My exterior hides within, I thrive in the heat, though I'm chilled when you begin. What am I? ",
					"Though I’m mostly water, I’m a fruit with weight, I’m often split open but never cut with hate. What am I?",
				"I’m green on the outside, red on the inside, and sweet to eat. What am I?"},

				{"I appear only when nature weeps, I’m often carried, though I can’t walk or speak. What am I?",
					"I am designed to offer protection from above. What am I?",
				"I am a shield for a brief time, you might forget me, yet I will be missed when you can’t find. What am I?"},

				{"I move in silence, pulling tides with might, but you will never hear my footsteps at night. What am I?",
					"I’m far from you, yet you know me well, I change my shape and face, but I never tell. What am I?",
				"I shine without a source, though I’m not the sun. What am I?"},

				{"I’m worn to protect, yet I have no skin, I’ll travel the world without moving a limb. What am I?", 
					"I am made for walking, but I do not take a step, I have two companions but never any breath. What am I?",
				"I can be boots or sandals, or something between. What am I?"}, 

				{"I hold knowledge and adventures, but I don’t have a mind of my own. What am I?",
					" I have a cover but no clothes. What am I?",
				"I contain stories, but I don’t speak. What am I?"},

				{"I shine bright but don’t last forever. What am I?",
					"I burn but never get hot to the touch. What am I?",
				"I melt away as I give light, but I’m not a fire. What am I?"}



		}; 
		

	
		
		int guessesLeft = 3; // player has three guesses per level
		c.clear();
		c.drawImage (mainbackground,  0, 0, 600, 500, null); 
		
		c.println("Level " +level);
		c.println("Clue 1: " +clues[level-1][0]);
		while(guessesLeft>0){
			c.print("Your guess: ");
			String playerGuess = c.readLine().toLowerCase();

			String piano = null;
			if (playerGuess.equalsIgnoreCase(mysteryItem[level-1])) {
				c.println("Correct! You guessed it!");
				c.println("");
				break; // Player guessed correctly can now exit loop
			}else {
				guessesLeft--;
				if (guessesLeft>0) {
					c.println("Incorrect guess! You have " +guessesLeft+ " Guesses Left");
				} else {
					c.println("Out of guesses! The correct answer was: " + mysteryItem[level-1]);
					return false;
				}

				if (guessesLeft>0 && !playerGuess.equalsIgnoreCase(mysteryItem[level-1])) {
					c.println("\nClue " + (4-guessesLeft) + ": " + clues[level-1][3-guessesLeft]);

				}
			}
		}
		return true; 

	}
}

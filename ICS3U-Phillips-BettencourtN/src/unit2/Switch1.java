package unit2;
import java.util.Scanner;

/**
Description: Switch 1 worksheet 
Date: November 14 2024
@author Noa Phillips-Bettencourt
*/

public class Switch1 {
	/**
	 * Entry point to the program 
	 * @param args unused
	 */
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.println("What number day is it?");
    int day = in.nextInt();

    switch(day) {
      case 1:
        System.out.println("Sunday");
        break;
      case 2:
        System.out.println("Monday");
        break;
      case 3:
        System.out.println("Tuesday");
        break;
      case 4:
        System.out.println("Wednesday");
        break;
      case 5:
        System.out.println("Thursday");
        break;
      case 6:
        System.out.println("Friday");
        break;
      case 7:
        System.out.println("Saturday");
        break;
      default:
        System.out.println("We don't have that day yet");
        break;
    }
    
    in.close();

    //Run the program. Type in a number between 1-7, and then a number bigger than that. What is the result?
    // When I typed in a number between 1-7 it told me what told correlates to that number ex. 5 = Thursday. When I entered a number larger than 7 it told me "we don't have that day yet". 
    //What do you think default means?
    // default is used when no valid input is given, automatically choosing the fallback option, in this case being " We don't have that day yet".  
    //What do you think break means? What happens when you remove a break?
    // I think break is used to break a cycle so that the program doesn't reapeat something. When I removed a break the program once I entred a number provided all the possible results that folllow the response I gave. 

    //Create another program, this time asking what day it is (String), and printing out how many days until the weekend

    System.out.println("What day is it?");
    String day1 = in.toString();

    switch(day1) {
      case 1:
        System.out.println("Sunday. it's the weekend!");
        break;
      case 2:
        System.out.println("Monday. Five more days till the weekend.");
        break;
      case 3:
        System.out.println("Tuesday. Four more days till the weekend.");
        break;
      case 4:
        System.out.println("Wednesday. Three more days till the weekend.");
        break;
      case 5:
        System.out.println("Thursday. Two more days till the weekend.");
        break;
      case 6:
        System.out.println("Friday. Only one more day till the weekend.");
        break;
      case 7:
        System.out.println("Saturday. It's the weekend!");
        break;
      default:
        System.out.println("We don't have that day yet");
        break;
  }
}

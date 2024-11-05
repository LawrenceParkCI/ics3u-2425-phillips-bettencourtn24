package unit1;

import java.util.Scanner;

/**
* Description: If Statemnet 2 worksheet 
* Date: noveber 5 2024
* @author Noa Phillips-Bettencourt 
*/

public class IfStatement2 {
	/**
	 * Entry point to the program 
	 * @param args unused 
	 */
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("What is your age?");
    int userAge = in.nextInt();
    
    String title = "";
    if (userAge > 18) { //If they're over 18, they are titled an adult
       title = "Adult";
    } else {  //if they're not over 18, I don't want a title
      System.out.println("Sorry, not quite yet.");
    }

    System.out.println(title);
    
    //Looking at the logic above, why do you think the program won't work? 
    // It doesn't work because the information to execute the program is commented 

    //Copy the code below, and try to find a solution.
    //Comment the code above to avoid compilation errors.

    
//    String title = "";
//    
//    if (userAge > 18) { //If they're over 18, they are titled an adult
//       title = "Adult";
//    } else {  //if they're not over 18, I don't want a title
//      System.out.println("Sorry, not quite yet.");
//    }
//    if (!title.isEmpty()) {
//    	System.out.println(" You are an "+ title);
//    }

  }
}

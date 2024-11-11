package unit2;
import java.util.Scanner;

/**
 * Description: if challenge worksheet 
 * Date: November 11 2024
 * @author Noa Phillips-Bettencourt 
*/

public class IfChallenge2 {
	/**
	 * Entry point to the program 
	 * @param args unused 
	 */
  public static void main(String[] args) {
	  Scanner in = new Scanner(System.in);
	  
	  System.out.println("Enter the first number:");
	  int num1 = in.nextInt();
	  
	  System.out.println("Enter the second number:");
	  int num2 = in.nextInt();
	  
	  System.out.println("Enter the third number:");
	  int num3 = in.nextInt();
	  
	  if (num1<num2 && num2<num3) {
		  System.out.println("Numbers are strictly in order and increasing");
		  
	  }else if (num1>num2 && num2>num3) {
		  System.out.println("Numbers are strictly in order and decreasing");
		  
	  } else {
		  System.out.println("Numbers are strictly not in order");
	  }
    //This is for the portfolio

    /*Create a program that asks for three numbers.
    Tell the user if the numbers are strictly in order.
    ie.  2 5 11 or 5 6 7 are strictly in order.
    ie.  6 5 7 or 5 5 7 are not
    */
  }

}
package unit3;
/**
Description: completing functions
Date: December 17 2024
@author Noa Phillips-Bettencourt
*/

public class MethodChallenge {
	/**
	 * Entry point to program
	 * @param args unused
	 */
   public static void main( String[] args )    {
       // Complete the function below. Don't forget to comment.
       double d1 = distance(-2,1 , 1,5);
       System.out.println(" (-2,1) to (1,5) => " + d1 );

       double d2 = distance(-2,-3 , -4,4);
       System.out.println(" (-2,-3) to (-4,4) => " + d2 );

       System.out.println(" (2,-3) to (-1,-2) => " + distance(2,-3,-1,-2) );

       System.out.println(" (4,5) to (4,5) => " + distance(4,5,4,5) );
   }

 /**
 (Description)
 @param x1 -> x - cordinate of the first point 
 @param y1 -> y - cordinate of the first point 
 @param x2 -> x - cordinate of the second point 
 @param y2 -> y - cordinate of the second point 
 @return 
 */
   public static double distance( int x1, int y1, int x2, int y2 )
   {
	   // calculatign the difference between the x and y cordinates.
	   int dx = x2 - x1;
	   int dy = y2 - y1;
	   
       // put your code up in here
	   return Math.sqrt(dx *dx+ dy*dy);

   }
}

package unit1;
/**
* Description: Casting 3 Worksheet+
* Date: October 15, 2024
* @author Noa Phillips-Bettencourt
*/
public class Casting3 {
  /**
  * This is the entry point to the program.
  * @param args unused
  */
public static void main(String[] args) {
   /*
   * Strings and Back Again
   */
   //Recall:
   System.out.println("Part 1");
   System.out.println("1 + 2 + 3" + 4 + 5);
   //why did it print out this way?
   //It printed this way because it starts with a string. When you add 4 and 5, they are treated as part of the string, so it combines them instead of adding them as numbers. First, it makes "1 + 2 + 34" and then adds 5, giving you "1 + 2 + 345".
   
   //Demonstrate casting a double value to a String in this way
   
   double myDouble = 12.34;
   String doubleAsString = myDouble + "";
   System.out.println(doubleAsString);
   
   //Demonstrate casting a boolean value to a String in this way
   
   boolean myBoolean = true;
   String booleanAsString = myBoolean + "";
   System.out.println(booleanAsString);
  
   //Demonstrate casting a char value to a String in this way
  
   System.out.println("Part 2");
   //In order to change a String into an integer, we need another set of code
   String strNum = "-5";
   int myNum = Integer.parseInt(strNum);
   System.out.println(strNum + " x 2 = " + (myNum + myNum));
   /*Change strNum to the following values, and see if they work:
    * "25.2" no
    * "23c" no
    * "2 3" no
    * "Lol23" no
    * "-5" yes, -5 x 2 = -10
   */
   //What can you say about how we can use the function, Integer.parseInt()?
//Letters and decimal places don't work.
   // What do you think the code to change a String to double would look like?
   //
   //Similarly, test out the code and write down what instructions
    //When do you think it might be necessary to change a string value into an integer value/double value?
 }
}


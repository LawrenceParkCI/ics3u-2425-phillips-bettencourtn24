package unit3;

/**
 * Description: This class contains methods for basic mathematical operations.
 * Date: December 17, 2024
 * Author: Noa Phillips-Bettencourt
 */
public class MathPlus {

    /**
     * Returns the distance between two points (x1, y1) and (x2, y2).
     * 
     * @param x1 x-coordinate of the first point
     * @param y1 y-coordinate of the first point
     * @param x2 x-coordinate of the second point
     * @param y2 y-coordinate of the second point
     * @return the Euclidean distance between the two points
     */
    public static double distance(int x1, int y1, int x2, int y2) {
        // Apply the distance formula: sqrt((x2 - x1)^2 + (y2 - y1)^2)
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    /**
     * Returns the length of the hypotenuse of a right triangle given the lengths
     * of the other two sides.
     * 
     * @param leg1 length of the first leg of the triangle
     * @param leg2 length of the second leg of the triangle
     * @return the length of the hypotenuse
     */
    public static double hypotenuse(int leg1, int leg2) {
        // Use Pythagorean theorem: hypotenuse = sqrt(leg1^2 + leg2^2)
        return Math.sqrt(Math.pow(leg1, 2) + Math.pow(leg2, 2));
    }

    /**
     * Returns the number of factors of the given number.
     * 
     * @param number the number to find the factors of
     * @return the number of factors of the given number
     */
    public static int numOfFactors(int number) {
        int count = 0;
        // Loop through all numbers from 1 to "number" to check if they are factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * Returns true if the number given is prime, and false otherwise.
     * 
     * @param number the number to check if it's prime
     * @return true if the number is prime, false otherwise
     */
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Not prime if divisible by any number other than 1 and itself
            }
        }
        return true; // Prime if no divisors were found
    }

    /**
     * Main method to test the mathematical operations.
     */
    public static void main(String[] args) {
        // Test the distance method
        System.out.println("Distance: " + distance(1, 2, 4, 6));

        // Test the hypotenuse method
        System.out.println("Hypotenuse: " + hypotenuse(3, 4));

        // Test the numOfFactors method
        System.out.println("Number of factors of 5: " + numOfFactors(5));

        // Test the isPrime method
        System.out.println("Is 2 prime? " + isPrime(2));
    }
}


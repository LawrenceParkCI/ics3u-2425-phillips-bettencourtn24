package unit3;
/**
 * Description:
    - Declaring and Initializing a pre-filled array
    - Using an element
    - Assigning a value in an element
    - Declaring and Initializing an empty array
    - Initializing the elements of the array
    - Printing an array
 * Date: December 18 2024
 * @author Noa Phillips-Bettencourt
 */
public class Arrays {
	/**
	 * Entry point to the program 
	 * @param args unused
	 */
	public static void main(String[] args) {
		/**
      Introduction
		 */
		/*
    Sometimes we want to store many values, but we don't want to
    create so many variables

    For example, we have almost 30 students in the class. It would
    take a long time to write the variables for all the students,
    let alone keeping their marks.
		 */

		/*
      This is why we can use an array - this allows us to refer to
      many of the same datatype using one name (identifier), and a number (index) for which one to use.

      To declare an array, we need the [] to indicate it is an array.
      The type of array needs to be stated as well.
		 */

		/**
      Declaring and Initializing a pre-filled array
		 */
		System.out.println("---------------------------------------------");
		System.out.println("Declaring and Initializing a pre-filled array");
		System.out.println("---------------------------------------------");
		//Declares and initializes an array with 3 values, or 3 *elements*
		String [] fruits = {"Apple","Banana","Lemon"};

		//Modify the array above by adding 2 more fruits to it
		String [] fruitsModified = { "Apple", "Banana", "Lemon", "Mango", "Blueberries"};
		//Declare and initialize an array of 3 marks (double data type)
		double[] marks = {85.5, 90.0, 78.3};

		/**
      Using an element
		 */
		System.out.println();
		System.out.println("----------------");
		System.out.println("Using an element");
		System.out.println("----------------");
		//To use an element, we use the name(identifier) of the array,
		//and the numbered index of the elements.
		System.out.println(fruits[1]); 
		//What does it print out? Did it match what you think it 
		//should print?
		// It printed out what I thought it would print which is banana. 

		//Try printing out the first and last fruit in the array

		// first fruit in the array.
		System.out.println(fruitsModified[0]);
		// Last fruit in the array.
		System.out.println(fruitsModified[fruitsModified.length -1]);

		//Create a new variable called sum. add the values of the marks
		//array to it, and print it out.

		double sum = marks[0] + marks[1] + marks[2];
		System.out.println("Sum of marks: " + sum); 


		/**
      Assigning a value in an element
		 */
		System.out.println();
		System.out.println("-------------------------------");
		System.out.println("Assigning a value in an element");
		System.out.println("-------------------------------");
		//To assign a value to a specific element, it is the same as for
		//when you use a variable
		//you need the variable name(identifier), and the index
		fruits[0] = "Mangosteen";
		System.out.println(fruits[0]);

		//Assign the 3rd mark to be 0
		marks[2] = 0;
		System.out.println("Updated third mark: " + marks[2]);


		/**
      Declaring and Initializing an empty array
		 */
		System.out.println();
		System.out.println("-----------------------------------------");
		System.out.println("Declaring and Initializing an empty array");
		System.out.println("-----------------------------------------");
		//When declaring an array, it works just like any other variable.
		//When initializing the array, you are simply creating the space
		//in computer memory to store the values. The actual elements may not be
		//initialized, depending on the language.

		//this initialized the array to hold 5 elements
		boolean[] isPassing = new boolean[5];

		System.out.println(isPassing[0]);

		//Declare and initialize an array of 3 student names
		System.out.println();
		System.out.println("--------------------------------------");
		System.out.println("Declaring and Initializing an array of 3 student names");
		System.out.println("--------------------------------------");
		String[] students = {"Victoria", "Daniella", "Ethan"};


		//print out the first element. What does it say?
		System.out.println("First student: " + students[0]);
		// the above code prints Victoria


		/*
      Initializing the elements of the array
		 */
		System.out.println();
		System.out.println("--------------------------------------");
		System.out.println("Initializing the elements of the array");
		System.out.println("--------------------------------------");
		//same as above
		//you need the variable name(identifier), and the index
		isPassing[0] = true;
		isPassing[1] = true;
		isPassing[2] = false;
		isPassing[3] = true;
		isPassing[4] = false;


		//Initialize the elements of the student names. Print them out.
		System.out.println();
		System.out.println("--------------------------------------");
		System.out.println("Initializing the elements of the student names array");
		System.out.println("--------------------------------------");
		String[] studentNames = new String[3]; // Declare an array for 3 students

		// Assigning values 
		studentNames[0] = "Victoria";
		studentNames[1] = "Emily";
		studentNames[2] = "Ethan";

		// Printing the names
		for (int i = 0; i < studentNames.length; i++) {
			System.out.println("Student " + (i + 1) + ": " + studentNames[i]);

			/**
      Printing an array
			 */
			System.out.println();
			System.out.println("-----------------");
			System.out.println("Printing an array");
			System.out.println("-----------------");

			System.out.println(isPassing);
			//What do you see printed? Is it useful for us?
			// The code printed is not useful: [Z@490d6c15  

			//How do you think we can print out each element of the array?
			// To print each element of the array, you can use a for loop, or Arrays.toString() to print the whole array at once.
		}
	}
}


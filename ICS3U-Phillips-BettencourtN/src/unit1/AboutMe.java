package unit1;

import java.io.PrintStream;
/**
 * This program contains my name, my grade, the school I attend, my teacher and my week's schedule.
 * September 20,2024
 * @author Noa Phillips-Bettencourt
 */
public class AboutMe {
	/**
	 * Entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		// This prints hello to the system console
		System.out.println("About Me:");
		System.out.println("---------");
		System.out.println("My name is Noa Phillips-Bettencourt");
		System.out.println("I am in grade 11");
		System.out.println("My teacher is Ms.Kemp");
		System.out.println("I attend Lawrence Park Collegiate Institute");
		System.out.println("Go Panthers!");
		System.out.println("I play soccer and have been since I was 4");
		System.out.println("I have three pets, one dogs and two cats");
		System.out.println("My favorite holiday is Christmas");
		System.out.println("---------");
		System.out.println("My Time Table For The Week Of September 23:");
		System.out.println("");
		System.out.println("Courses: Computer Science (room 113), French (room 211), Business Management (room218), IAPS (room 115)");
		System.out.println("");
		PrintStream format = System.out.format("Day: %-15sClass Order: %8s", "Monday","9:00-10:15: ICS3U1-1 C.Kemp, ");
		System.out.println("");
		System.out.format("%33s%-15s","", "10:20-11:40: FIF3U5-2 A.Alexanian");
		System.out.println("");
		System.out.println("");
		System.out.format("%33s%-15s %-20s", "", "11:40-12:40:", "Lunch ");
		System.out.println("");
		System.out.println("");
		System.out.format("%33s%-15s","", "12:40-1:55: BOH4M1-2 B.Goldkind");
		System.out.println("");
		System.out.format("%33s%-15s", "","2:00- 3:15: HSP3U1-2 A.Djuricic");
		System.out.println("");
		System.out.println("");
		System.out.println("-------------------------------------------------------------------");
		PrintStream format1 = System.out.format("Day: %-15sClass Order: %8s", "Tuesday", "9:00-10:15: FIF3U5-2 A.Alexanian"); 
		System.out.println("");

		System.out.format("%33s%-15s", "", "10:20-11:40: ICS3U1-1 C.Kemp");
		System.out.println("");
		System.out.println("");
		System.out.format("%33s%-15s %-20s", "", "11:40-12:40:", "Lunch ");
		System.out.println("");
		System.out.println("");
		System.out.format("%33s%-15s", "", "12:40-1:55: HSP3U1-2 A.Djuricic");
		System.out.println("");
		System.out.format("%33s%-15s", "","2:00-3:15: BOH4M1-2 B.Goldkind");
		System.out.println("");
		System.out.println("");
		System.out.println("-------------------------------------------------------------------");
		PrintStream format11 = System.out.format("Day: %-15sClass Order: %8s", "Wednesday", "9:55-10:55:  ICS3U1-1 C.Kemp"); 
		System.out.println("");

		System.out.format("%33s%-15s", "", "11:00-12:00:  FIF3U5-2 A.Alexanian");
		System.out.println("");
		System.out.println("");
		System.out.format("%33s%-15s %-20s", "", "12:00-1:05:", "Lunch ");
		System.out.println("");
		System.out.println("");
		System.out.format("%33s%-15s", "", "1:05-2:10:  BOH4M1-2 B.Goldkind ");
		System.out.println("");
		System.out.format("%33s%-15s", "","2:15-3:15:  HSP3U1-2 A.Djuricic");
		System.out.println("");
		System.out.println("");
		System.out.println("-------------------------------------------------------------------");
		PrintStream format111 = System.out.format("Day: %-15sClass Order: %8s", "Thursday", "9:00-10:15:  FIF3U5-2 A.Alexanian"); 
		System.out.println("");
		System.out.format("%33s%-15s", "", "10:20-11:40:  ICS3U1-1 C.Kemp");
		System.out.println("");
		System.out.println("");
		System.out.format("%33s%-15s %-20s", "", "11:40-12:40:", "Lunch ");
		System.out.println("");
		System.out.println("");
		System.out.format("%33s%-15s", "", "12:40-1:55:  HSP3U1-2 A.Djuricic");
		System.out.println("");
		System.out.format("%33s%-15s", "","2:00-3:15:  BOH4M1-2 B.Goldkind");
		System.out.println("");
		System.out.println("");
		System.out.println("-------------------------------------------------------------------");
		PrintStream format1111 = System.out.format("Day: %-15sClass Order: %8s", "Friday","9:00-10:15am: ICS3U1-1 C.Kemp, ");
		System.out.println("");
		System.out.format("%33s%-15s","", "10:20-11:40am: FIF3U5-2 A.Alexanian");
		System.out.println("");
		System.out.println("");
		System.out.format("%33s%-15s %-20s", "", "11:40-12:40:", "Lunch ");
		System.out.println("");
		System.out.println("");
		System.out.format("%33s%-15s","", "12:40-1:55pm: BOH4M1-2 B.Goldkind");
		System.out.println("");
		System.out.format("%33s%-15s", "","2:00- 3:15pm: HSP3U1-2 A.Djuricic");
		System.out.println("");
		System.out.println("");
	}
}
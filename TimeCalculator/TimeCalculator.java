import java.util.Scanner;

/**
 * This program will take an input number of seconds and output the time in minutes, hours, and days.
 * @author Julianna Nichols
 *
 */

public class TimeCalculator {
	
	/**
	 * This is the main method for the TimeCalculator.
	 * @param args
	 */
	
	public static void main(String[] args) {
	
		int seconds = 0; //holds number of seconds
		
		int minutes = 0; //holds number of minutes
		int secMinutes = 0; //holds leftover seconds from minutes
		
		int hours = 0; //holds number of hours
		int minHours = 0; //holds leftover minutes from hours
		int secHours = 0; //holds leftover seconds from hours
		
		int days = 0; //holds number of days
		int hDays = 0; //holds leftover hours from days
		int minDays = 0; //holds leftover minutes from days
		int secDays = 0; //holds leftover seconds from days
		
		Scanner keyboard = new Scanner( System.in ); //creates a Scanner object for keyboard input
		
		
		
		System.out.print( "Welcome to the time calculator! We can convert seconds into minutes, hours, and days!" );
		
		keyboard.nextLine(); //hit return key to continue
		
		System.out.print( "Type in the number of seconds you want to convert: ");
		seconds = keyboard.nextInt();
		
		
		
		if ( seconds < 3600 ) {
			minutes = seconds / 60; // calculates the minutes
			secMinutes = seconds % 60; // calculates the leftover seconds
			System.out.println( "In " + seconds + " seconds, there are " + minutes 
								+ " minutes and " + secMinutes + " seconds!" );
		}
		
		else if ( seconds < 86400 ) {	
			hours = seconds / 3600; // calculating the hours
			minHours = seconds % 3600; // calculating the hours remainder
			minHours /= 60; // calculates the leftover minutes
			secHours = seconds % 60; // calculates leftover seconds
			System.out.println( "In " + seconds + " seconds, there are " + hours
								+ " hours, " + minHours + " minutes, and "
								+ secHours + " seconds!" );
		}
		
		else if ( seconds >= 86400 ) {	
			days = seconds / 86400; // calculates the days
			hDays = seconds % 86400; // calculates the days remainder
			hDays /= 3600; // calculates the leftover hours
			minDays = seconds % 3600; // remainder of days
			minDays /= 60; // calculates the leftover minutes
			secDays = seconds % 60; // calculates the leftover seconds
			System.out.println( "In " + seconds + " seconds, there are " + days
								+ " days, " + hDays + " hours, " + minDays
								+ " minutes, and " + secDays + " seconds!");
		}	
	
	}
}

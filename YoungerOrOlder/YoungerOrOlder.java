import java.util.Scanner; //needed for the Scanner class

/**
 * This class creates a program that asks for the 
 * user'sbirth year, and calculates how old they are.
 * The program will compare user's age to my own. If 
 * they are younger, it will display by how many years younger. 
 * @author Julianna Nichols
 *
 */

public class YoungerOrOlder {
	
	/**
	 * This is the main method for the YoungerOrOlder program.
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		String userName; //holds user's name
		int birthYear = 0; //holds user's birth year
		int currentYear = 0; //holds the current year
		int userAge = 0; //holds the user's age
		int younger = 0; //if user is younger, holds by how many years younger
		Scanner keyboard = new Scanner( System.in ); //create a Scanner object to read input
		
		System.out.print( "What is your name? ");
		userName = keyboard.nextLine();
		
		System.out.print( "What year were you born? " );
		birthYear = keyboard.nextInt();
		
		System.out.print( "What is the current year? " );
		currentYear = keyboard.nextInt();
		
		//calculates the  user's age
		userAge = currentYear - birthYear;
		
		
		if ( userAge > 17 )
		{
			//if the user is older, this message will appear
			System.out.print( userName + ", you are older than me!" );
		} else {
			//if the user is younger, this message will appear and tell them how much younger
			younger = 17 - userAge;
			System.out.print( userName + ", you are " + younger + " years younger than me!" ); 
		}
		
	}

}

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * This class creates a program that asks for a
 * user's name, age, zip code, city name, and
 * state abbreviation. It then displays this information
 * back. It also shows the user's age in 30 years.
 * @author Julianna Nichols
 */

public class Questions {
	
	/**
	 * This is the main method for the Questions program.
	 * @param args
	 */
	
	public static void main(String[] args) {
	
		String firstName; //holds first name of user.
		String lastName; //holds last name of user.
		String city; //holds city name.
		String stateabb; //holds state abbreviation.
		int age = 0; //holds age of user.
		int gettingOld = 0; //holds age of user in 30 years.
		int zipcode = 0; //holds zip code.
		Scanner keyboard = new Scanner( System.in ); //input from the keyboard can be read by the Scanner class.
		
		//Asking the user to type in his/her first name.
		System.out.print( "First name: " );
		firstName = keyboard.nextLine();
		
		//Asking the user to type in his/her last name.
		System.out.print( "Last name: " );
		lastName = keyboard.nextLine();
		
		//Asking the user to type in his/her age.
		System.out.print( "Age: " );
		age = keyboard.nextInt();
		
		System.out.println( "Hello " + firstName + " " + lastName + ", you are " + age + " years old!" );
		
		//Asking the user for his/her zip code.
		System.out.print( "Zip code: " );
		zipcode = keyboard.nextInt();
		
		//Consume remaining newline
		keyboard.nextLine();
		
		//This is asking the user for his/her city.
		System.out.print( "City: " );
		city = keyboard.nextLine();
		
		//Asking the user for his/her state's abbreviation.
		System.out.print( "State Abbreviation: ");
		stateabb = keyboard.nextLine();
		
		
		JOptionPane.showMessageDialog(null, firstName + " " +lastName + ": " + city + ", " + stateabb + " " + zipcode );
		
		//Adds 30 years and stores the new age in the variable "gettingOld"
		gettingOld = age + 30;
		System.out.print( "In 30 years, you will be " + gettingOld + " years old!" );
		
		JOptionPane.showMessageDialog(null, "Goodbye, have a good day! :)" );
		
				
	}
}

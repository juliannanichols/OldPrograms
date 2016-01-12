import java.util.ArrayList; //needed for ArrayList class
import java.util.Collections; //needed for Collections class
import java.util.List; //needed for List class
import java.util.Scanner; //needed for Scanner class

/**
 * This program will take five strings and print them in a random order.
 * @author Julianna Nichols
 */

public class ExtraCredit {
	
	/**
	 * This is the main method for the ExtraCredit program.
	 * @param args
	 */
	
	public static void main(String[] args) {
	
		ArrayList<String> arrlist = new ArrayList<String>(); //creates empty array list
		
		//adding items to array list
		arrlist.add( "go rock climbing" );
		arrlist.add( "eat a PB&J sandwich" );
		arrlist.add( "buy a cat" );
		arrlist.add( "learn to juggle");
		arrlist.add( "meditate on the meaning of life" );
		Scanner keyboard = new Scanner( System.in ); //creates a Scanner object for keyboard input
		
		System.out.print( "Don't know what to do today? We'll help you out!" );
		
		while (true) {
		
		keyboard.nextLine(); //forces user to hit the return key before proceeding
		
		Collections.shuffle(arrlist); //shuffles the strings in the array
		
		System.out.print( arrlist.get(0) + "." ); //prints out shuffled array
		
		}
	}	

}

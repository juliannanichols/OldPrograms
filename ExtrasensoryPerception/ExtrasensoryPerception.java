import java.util.Random;
import java.util.Scanner;

/**
 * This program will test the user's extrasensory perception (ESP)
 * 
 * @author Julianna Nichols
 */

public class ExtrasensoryPerception {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner( System.in ); //creates Scanner object to read object
				
		System.out.print( "Hello, first I'm going to randomly pick a color, and you have to guess it!"
						+ "\nLet's see how many times you can guess correctly out of 10!" );
		
		keyboard.nextLine();
		
		//call on menu method
		menu();
		
	}
	
	/**
	 * the user will choose which color he/she thinks the computer picked
	 * 
	 * @param
	 */
	
	public static void menu() {
		
		String colorName; //holds the color name the computer picked
		String color; //holds the color name the user picked
		int convert; //holds the number that is given to the numberToColor method
		int ctr = 0; //counts number of times user guesses correctly
		int tries = 0; //loop counter
		Random rand = new Random(); //creates a Random class object
		Scanner keyboard = new Scanner( System.in ); //creates a Scanner object
		
		for ( tries = 0; tries < 10; tries++ ){
			System.out.println( "Okay! I have my color, now guess which one I picked!" );
			convert = rand.nextInt(5);
			colorName = numberToColor( convert ); //calling on numberToColor method
			
			System.out.println( "If you think it's:\nRed, type 0\nGreen, type 1\nBlue,"
								+ "type 2\nOrange, type 3\nYellow, type 4" );
			convert = keyboard.nextInt(5);
			color = numberToColor( convert ); //calling on numberToColor method
	
			if ( colorName == color ) {
				System.out.println( "You're right!" );
				ctr++; //+1 added to counter of user guesses correctly
			} else {
				System.out.println( "Sorry, I picked " + colorName + " and you picked " + color + "!" );
			}
		}
		
		//telling user how many times they guessed correctly
		System.out.print( "You guessed the color correctly " + ctr + " times!" );
			
	}
	
	/**
	 * converts number into color name (int to string)
	 * 
	 * @param number the computer picked
	 */
	
	public static String numberToColor( int convert ) {
		
		String colorName = "" ;
				
		if ( convert == 0 ) 
			colorName = ( "red" );
		if ( convert == 1 )
			colorName = ( "green" );
		if ( convert == 2 )
			colorName = ( "blue" );
		if ( convert == 3 )
			colorName = ( "orange" );
		if ( convert == 4 )
			colorName = ( "yellow" );
		
		return colorName;
	}	
}

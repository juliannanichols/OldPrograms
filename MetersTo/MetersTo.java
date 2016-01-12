import java.util.Scanner;

/**
 * This program will convert a distance 
 * in meters to kilometers, inches, or 
 * feet.
 * 
 * @author Julianna Nichols
 */

public class MetersTo {
	
	/**
	 * This is the main method for the MetersTo program.
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		double meters = 0; //holds input meters to be converted
		Scanner keyboard = new Scanner( System.in ); //creates Scanner object to read input
	
		System.out.print( "Enter the distance in meters that you want to convert: " );
		meters = keyboard.nextDouble();
		
		while( true )
			menu( meters );
		
	}
	
	/**
	 * menu to chose what the user wants to do
	 * 
	 * @param meters
	 */
	
	public static void menu(double meters) {
		
		int choice; //holds the number choice the user inputs
		Scanner keyboard = new Scanner( System.in );
		
		//menu asking user what he/she wants to do
		do {	
			System.out.print( "Do you want to convert to:\n1. Kilometers\n"
					+ "2. Inches\n3. Feet\n4. Exit program\n" );
			choice = keyboard.nextInt();
		
			//choice will lead to another method call
			if ( choice == 1 || choice == 2 || choice == 3 || choice == 4 ) {
				if ( choice == 1 )
					showKilometers( meters );
				if ( choice == 2 )
					showInches( meters );
				if ( choice == 3 )
					showFeet( meters );
				if ( choice == 4 ){
					System.exit(0);
				}
			}
		}
		while ( choice != 1 || choice != 2 || choice != 3 || choice != 4 );
			System.out.println( "Invalid entry." );
	}	

	
	/**
	 * converts the input meter to kilometers
	 * 
	 * @param meters
	 */

	public static void showKilometers( double meters ) {
		
		double kilometers; //holds the converted number of meters in kilometers
		
		kilometers = meters * 0.001; //calculates the number of kilometers in input meters
		System.out.printf( "There are %.1f kilometers in %.1f meters!" , kilometers , meters );
	
	}
	
	/**
	 * converts the input meter to inches
	 * 
	 * @param meters
	 */
	
	public static void showInches( double meters ) {
		
		double inches; //holds the converted number of meters in inches
		
		inches = meters * 39.97; //calculates the number of inches in input meters
		System.out.printf( "There are %.1f inches in %.1f meters!" , inches , meters );
	}
	
	/**
	 * converts the input meters to feet
	 * 
	 * @param meters
	 */
	
	public static void showFeet( double meters ) {
		
		double feet; //holds the converted number of meters in feet
		
		feet = meters * 3.281; //calculating the number of feet in input meters
		System.out.printf( "There are %.1f feet in %.1f meters!" , feet , meters );
	}

}

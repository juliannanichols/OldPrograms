import java.util.Scanner;

/**
 * This program will convert an input 
 * Fahrenheit temperature to Celsius. 
 * It will also create a table showing 
 * the Celsius equivalent of Fahrenheit 
 * temperatures (1-20 degrees).
 * 
 * @author Julianna Nichols
 */

public class ConvertTemperature {
	
	/**
	 * This is the main method to the ConvertCelsius program.
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		double fahrenheit = 0; //holds input Fahrenheit temperature; acts as counter; Fahrenheit temperatures in table 
		double celsius; //holds converted Fahrenheit temperature (Celsius); Celsius temperatures in table
		Scanner keyboard = new Scanner( System.in ); //creates Scanner object to read input
		
		System.out.print( "Hello, we can convert your Fahrenheit temperature "
						+ "to Celsius!" );
		keyboard.nextLine();
		
		System.out.print( "Enter the Fahrenheit temperature you want converted: " );
		fahrenheit = keyboard.nextDouble();
		
		//calling on the convert method
		celsius = convert(fahrenheit);
		
		System.out.printf( "%.2f degrees Fahrenheit is equal to %.2f degrees "
						+ "Celsius!\n" , fahrenheit , celsius );
		
		System.out.println( "Fahrenheit temperature\t\tCelsius Temperature" );
		
		//loop creating table showing Celsius equivalents of Fahrenheit temperatures
		for ( fahrenheit = 0; fahrenheit <= 20; fahrenheit++ ) {
			//calling on convert method again
			celsius = convert(fahrenheit);
			System.out.printf( "%.2f\t\t\t\t%.2f\n" , fahrenheit , celsius );
		}
	}
	
	/**
	 * converts Fahrenheit temperature to Celsius
	 * 
	 * @param Fahrenheit
	 * @return Celsius equivalent of Fahrenheit temperature
	 */
	
	public static double convert( double fahrenheit ) {
		
		//calculating Celsius equivalent of Fahrenheit temperature 
		return ( fahrenheit - 32 )/1.8;
		
	}

}

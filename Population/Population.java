import java.util.Scanner;

/**
 * This program will predict the 
 * size of a population of organisms 
 * based on input data from user.
 * 
 * @author Julianna Nichols
 */

public class Population {
	
	/**
	 * This is the main method for the Population program.
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		double increase = 0;
		double part = 0;
		double population = 0;
		int starting = 0;
		int days = 0;
		int ctr = 0;
		int integer = 0;
		Scanner keyboard = new Scanner ( System.in );
		
		System.out.print( "We can predict the population size of organisms!\nJust tell" 
						+ " us the starting number of organisms, their percent population"
						+ " increase, and the number of days they will reproduce!" );
		
		keyboard.nextLine();
		
		System.out.print( "What is the starting number of organisms? " );
		starting = keyboard.nextInt();
		
		while ( starting < 2 ) {
			System.out.print( "You cannot enter a number less than two for the starting population!"
							+ " What is the starting number of organisms? " );
			starting = keyboard.nextInt();
		}
		
		System.out.print( "What is their daily population increase (as a percent)? " );
		increase = keyboard.nextInt();
		
		while ( increase < 0 ) {
			System.out.print( "You cannot enter a negative number for the organisms daily population "
							+ " increase! What is their daily population increase (as a percent) " );
			increase = keyboard.nextInt();
		}
		
		increase /= 100;
		
		System.out.print( "How many days will they reproduce? " );
		days = keyboard.nextInt();
		
		while ( days < 1 ) {
			System.out.print( "You cannot enter a number less than one for the number of days the "
							+ "organism will reproduce! How many days will they reproduce? " );
			days = keyboard.nextInt();
		}
		
		for ( ctr = 1; ctr <= days; ctr++ ) {
			if ( ctr == 1 ) {
			part = starting * increase;
			population = part + starting;
			} else {
				part = population * increase;
				population += part; 
			}
			
			integer = (int)population;
			System.out.printf( "On day " + ctr + ", there will be " + integer + " number of organisms!\n" );
			
		}	
	}
}

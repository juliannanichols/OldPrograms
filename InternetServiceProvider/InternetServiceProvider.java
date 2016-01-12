import java.util.Scanner;

/**
 * This program will calculate a customer's monthly bill 
 * depending on their subscription package. 
 * It will also tell them how much they would save 
 * if they purchased a more expensive package.
 * 
 * @author Julianna Nichols
 */

public class InternetServiceProvider {

	/**
	 * This is the main method for the InternetServiceProvider program.
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {

		double hours; //holds number of hours subscriber has used
		double addHours; //holds the additional hours
		double totalPrice; //holds the total price
		double savedPriceB = 0; //holds how much subscriber would save if they bought package B
		double savedPriceC = 0; //holds how much the subscriber would save if they bought package C
		String internetpack; //holds what package the subscriber has purchased
		Scanner keyboard = new Scanner ( System.in ); //creates a Scanner object to read input
		
		System.out.print( "Hello, this is is your Internet Service Provider!" 
						+ " We can tell you your monthly bill!" );
		keyboard.nextLine();
		
		System.out.print( "What package are you subscribed to? " );
		internetpack = keyboard.nextLine();
		
		
		
		
		//if the subscriber bought package A...
		if ( internetpack.equalsIgnoreCase( "A" )) {
			System.out.print( "How many hours have you used? " );
			hours = keyboard.nextDouble();
			
			//if number of hours is 10 hours or less
			if ( hours <= 10 ) {
				System.out.print(  "You're monthly bill is $9.95!" );
			
			//if number of hours is greater than 10	
			} else {
				addHours = hours - 10;
				totalPrice = addHours * 2 + 9.95;
				System.out.printf( "Your monthly bill is $%.2f!\n" , totalPrice );
				
				//calculating how much subscriber would save if they bought package B 
				if ( hours > 12 ) {
					savedPriceB= totalPrice - 13.95;
					System.out.printf( "If you would purchase package B, you would save $%.2f!\n" , savedPriceB );
				}
				
				//calculating how much subscriber would save if they bought package C
				if ( hours > 15 ) {
					savedPriceC = totalPrice - 19.95;
					System.out.printf( "If you purchase package C, you would save $%.2f!\n" , savedPriceC );
				}
			}
		}
		
		
			
		
		//if subscriber bought package B...	
		if ( internetpack.equalsIgnoreCase( "B" )) {
				System.out.print( "How many hours have you used? " );
				hours = keyboard.nextDouble();
			
			//if number of hours is 20 or less
			if ( hours <= 20 ) {	
				System.out.print(  "You're monthly bill is $13.95!" );
				
			//if number of hours is greater than 20	
			} else {
				addHours = hours - 20;
				totalPrice = addHours * 1 + 13.95;
				System.out.printf( "Your monthly bill is $%.2f!\n" , totalPrice );
				
				//calculating how much subscriber would save if they bought package C
				if ( hours > 27 ) {
					savedPriceC = totalPrice - 19.95;
					System.out.printf( "If you would purchase package C, you would save $%.2f!\n" , savedPriceC );
				}	
			}
		}
			
		
		
		
		//if subscriber bought package C...	
		if ( internetpack.equalsIgnoreCase( "C" )) {
					
				System.out.print( "You're monthly bill is $19.95!" );
	
		}
	}
}
import java.util.Scanner;

/**
 * This program will take input scores, 
 * calculate, then display the average 
 * of all the scores.
 * 
 * @author Julianna Nichols
 */

public class AverageCalculator {
	
	/**
	 * This is the main method for the AverageCalculator program.
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		double first; //holds the first number to be averaged
		double second = 0; //holds the second number to be averaged
		double extraNumber = 0; //holds the extra numbers to be averaged
		double last = 0; //holds the final summation of the numbers to be averaged
		int ctr = 0; //counts the number of times the loop was executed
		String yesNo; //holds the user's answer if they want to add another number to be averaged
		Scanner keyboard = new Scanner ( System.in ); //creates a Scanner object to read input 
		
		//first number to be averaged
		System.out.print( "Enter the first number you want averaged: " );
		first = keyboard.nextDouble();
		
		//second number to be averaged
		System.out.print( "Enter the second number you want averaged: " );
		second = keyboard.nextDouble();
		
		keyboard.nextLine(); //consume remaining newline
		
		do {
			System.out.print( "Add another number to be averaged? Type 'Y' for yes or 'N' for no. " );
			yesNo = keyboard.nextLine().toLowerCase(); //converts input to lower case
			
			//if user types 'n' for no
			if (yesNo.equals( "n" )){
				ctr += 2; //adds '2' to the number of times the loop was executed
				last += second + first; //adds the first two input number and the number stored in 'last'
				last = last / ctr;
				System.out.printf( "The average is %.2f!" , last );	
				break; //exit loop
			}
			
			//if user types 'y' for yes
			if (yesNo.equals( "y" ))
				System.out.print( "Enter the next number you want averaged: " );
				extraNumber = keyboard.nextDouble();
				last += extraNumber; //adds the input number to 'last'
									// 'last' is keeping the sum of all input numbers (after the first two input numbers)
				ctr++; //counting the number of times the loop is executed
				keyboard.nextLine(); //consume remaining line
				
		} while(yesNo.equals( "y" )); //loop will continue if user types 'y' for yes		
		
	}
		
}
import java.util.Scanner;

/**
 * This program will count the number 
 * of times an input letter appears 
 * in an input string, both specified 
 * by the user.
 * 
 * @author Julianna Nichols
 *
 */

public class LettersLettersEverywhere {
	
	/**
	 * This is the main method for the 
	 * LettersLettersEverywhere program.
	 * 
	 * @param args
	 * 
	 */
	
	public static void main(String[] args) {
		
		String sentence; //variable holding the input sentence 
		String inputletter; //variable holding the input letter
		int letter = 0; //argument
		int ctr = 0; //counter
		int character; //number of characters in the sentence
		int end = 0; //total number of times letter appears
		Scanner keyboard = new Scanner (System.in ); //creates a Scanner object to read input 
		
		//sentence user wants
		System.out.print( "Enter a sentence: " );
		sentence = keyboard.nextLine();
		
		//determines length of string
		character = sentence.length();
		
		//letter user wants to search for
		System.out.print( "Enter a letter: " );
		inputletter = keyboard.nextLine();
		
		//keyboard.next().charAt(0);
		
		for ( ctr = 0; ctr < character; ctr++ ) //ctr++ is incrementing the position at which the letter is being compared 
			if ( inputletter.charAt(letter) == sentence.charAt(ctr)) {
				end++; //counting the number of times the letter appears
			}	
			System.out.print( "The letter '" + inputletter + "' appears " + end + " times." );
		
	}

}

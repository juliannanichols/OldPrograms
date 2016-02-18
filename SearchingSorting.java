import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

/**
 * @author SJHSStudent
 *
 */
public class SearchingSorting {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> stringList = new ArrayList<String>();
				
		int [] pirate = new int[10];
		Random rnd = new Random();
		for( int ctr = 0; ctr < pirate.length; ctr++ ) {
			pirate[ctr] = rnd.nextInt(pirate.length);
			
			stringList.add( "num: " + pirate[ctr] );
		}
		
		printArray( pirate );
		
		selectionSort( pirate );
		
		printArray( pirate );
		
		for( int ctr = 0; ctr< stringList.size(); ctr++ ) {
			System.out.println( stringList.get(ctr) );
		}

	}
	
	public static void selectionSort( int[] array ) {
		int startScan, index, minIndex, minValue;
		
		for( startScan = 0; startScan < (array.length-1); startScan++ ) {
			minIndex = startScan;
			minValue = array[startScan];
			for( index = startScan + 1; index < array.length; index++ ) {
				if( array[index] < minValue ) {
					minValue = array[index];
					minIndex = index;
				}
			}
			
			array[minIndex] = array[startScan];
			array[startScan] = minValue;
			
		}
	}
	
	public static void printArray( int[] array ) {
		
		System.out.print( "Array (len: " + array.length + "):" );
		for( int ctr = 0; ctr < array.length; ctr++ ) {
			System.out.print( array[ctr] + "," );
		}
		System.out.println();
	}

}

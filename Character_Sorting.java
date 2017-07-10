// Assignment 7.2
// WAP to sort words of given strings, then sort characters in each word 
// For example String = “ My name is XYZ” so My, name, is, XYZ is separate 
// so first sort these and then sort the character of each word.


//Character Sorting in Ascending Order

package assignment_7_2;
import java.util.Arrays;
public class Character_Sorting {
		
	        public static void main(String[] args) {
		   
		    //create char array
		    char[] c1 = new char[]{'d','a','f','k','e'};
		   
		    //print original char array
		    System.out.print("Original Array :\t ");
		    for(int index=0; index < c1.length ; index++)
		      System.out.print("  "  + c1[index]);
		   
		    /*
		     To sort java char array use Arrays.sort() method of java.util package.
		     Sort method sorts char array in ascending order and based on quicksort
		     algorithm.
		     There are two static sort methods available in java.util.Arrays class
		     to sort a char array.
		    */
		   
	    //To sort full array use sort(char[] c) method.
		    Arrays.sort(c1);
		   
		    //print sorted char array
		    System.out.print("\nSorted char array :\t ");
		    for(int index=0; index < c1.length ; index++)
		      System.out.print("  "  + c1[index]);
		     
		    /*
		      To sort partial char array use
		      sort(char[] c, int startIndex, int endIndex) method where startIndex is
		      inclusive and endIndex is exclusive
		    */

}
	        
}

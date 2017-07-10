// Assignment 7.2
// WAP to sort words of given strings, then sort characters in each word 
// For example String = “ My name is XYZ” so My, name, is, XYZ is separate 
// so first sort these and then sort the character of each word.

//Sorting of Words(Strings) in Ascending Order

package assignment_7_2;
import java.util.Scanner;
public class SortingOfWords {
	public static void main(String[] args) 
		    {
		        int n;
		        String temp;
		        @SuppressWarnings("resource")
				Scanner s = new Scanner(System.in);
		        System.out.print("Enter number of names you want to enter:");
		        n = s.nextInt();
		        String names[] = new String[n];
		        @SuppressWarnings("resource")
				Scanner s1 = new Scanner(System.in);
		        System.out.println("Enter all the names:");
		        for(int i = 0; i < n; i++)
		        {
		            names[i] = s1.nextLine();
		        }
		        for (int i = 0; i < n; i++) 
		        {
		            for (int j = i + 1; j < n; j++) 
		            {
		                if (names[i].compareTo(names[j])>0) 
		                {
		                    temp = names[i];
	                        names[i] = names[j];
		                    names[j] = temp;
		                }
		            }
		        }
		        System.out.print("Names in Sorted Order:   \n");
		        for (int i = 0; i < n - 1; i++) 
		        	
		        {
		            System.out.print(names[i] + ",");
		        }
		        System.out.print(names[n - 1]);
		        
		        
		    }
	
	

}

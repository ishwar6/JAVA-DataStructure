
import java.util.Arrays; 

public class SortExample 
{ 
	public static void main(String[] args) 
	{ 
	
		int[] arr = {13, 7, 6, 45, 21, 9, 2, 100}; 

	
		Arrays.sort(arr, 1, 5); 

		System.out.printf("Modified arr[] : %s", 
						Arrays.toString(arr)); 
	} 
} 



import java.util.Arrays; 
import java.util.Collections; 

public class SortExample 
{ 
	public static void main(String[] args) 
	{ 
		String arr[] = {"practice.geeksforgeeks.org", 
						"quiz.geeksforgeeks.org", 
						"code.geeksforgeeks.org"
					}; 

	
		Arrays.sort(arr); 
		System.out.printf("Modified arr[] : \n%s\n\n", 
						Arrays.toString(arr)); 

		// Sorts arr[] in descending order 
		Arrays.sort(arr, Collections.reverseOrder()); 

		System.out.printf("Modified arr[] : \n%s\n\n", 
						Arrays.toString(arr)); 
	} 
} 

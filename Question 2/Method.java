package Assignment2_Part2;

import java.util.Random;
import java.util.Scanner;

public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		//-----------------------------------------------------
		// Title: Part 2
		// Author: Basme Zantout
		// ID: 99227947762
		// Section: 1
		// Assignment: 2
		// Description: This is the main class that performs the 
		//              the required for testing the run time 
		//              when finding the smallest pairwise difference
	    //              after sorting an array using different 
		//              sorting algorithms and testing different 
		//              input sizes and orders
		//-----------------------------------------------------

				 
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
/*		
	Integer [] array = {113, 23, 1, 109, 4, 102, 7, 105, 100, 107};
		
		
//----------------------------------------------------------------------------
// Summary: Calling the "Method" method
// Note: check "Method(Integer [] array)" for details of implementation and 
//       and the expected output
//----------------------------------------------------------------------------		
			
		Method.Method(array);
*/		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////				
		

		
		// Get the "seed" value from the user using the Scanner Class
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a seed to create random generated values: ");
		int seed = scan.nextInt();
		
		Random r = new Random (seed);
		
		System.out.println("Seed : " + seed);
		
		
		
// (1) INPUT SIZE 82
		
		System.out.println();
		System.out.println("Input Size: 82");
		
	// Instantiating the static array named "array" in "SortingAlgorithmTester" class and assigning to it 1000 random integers
		
		SortingAlgorithmTester.array = new Integer[82];
		
		for (int i = 0 ; i < SortingAlgorithmTester.array.length ; i++)
		{
			SortingAlgorithmTester.array[i] = r.nextInt();
		}
		
		Testing();
		
		
		
// (2) INPUT SIZE 650
		
		System.out.println();
		System.out.println("Input Size: 650");
		
	// Instantiating the static array named "array" in "SortingAlgorithmTester" class and assigning to it 1000 random integers
		
		SortingAlgorithmTester.array = new Integer[650];
		
		for (int i = 0 ; i < SortingAlgorithmTester.array.length ; i++)
		{
			SortingAlgorithmTester.array[i] = r.nextInt();
		}
		
		Testing();
		
		
// (3) INPUT SIZE 2,500
		
		System.out.println();
		System.out.println("Input Size: 2500");
		
	// Instantiating the static array named "array" in "SortingAlgorithmTester" class and assigning to it 1000 random integers
		
		SortingAlgorithmTester.array = new Integer[2500];
		
		for (int i = 0 ; i < SortingAlgorithmTester.array.length ; i++)
		{
			SortingAlgorithmTester.array[i] = r.nextInt();
		}
		
		Testing();
		
		
// (4) INPUT SIZE 78,000
		
		System.out.println();
		System.out.println("Input Size: 78000");
		
	// Instantiating the static array named "array" in "SortingAlgorithmTester" class and assigning to it 1000 random integers
		
		SortingAlgorithmTester.array = new Integer[78000];
		
		for (int i = 0 ; i < SortingAlgorithmTester.array.length ; i++)
		{
			SortingAlgorithmTester.array[i] = r.nextInt();
		}
		
		Testing();
		
		
// (5) INPUT SIZE 256,000
		
		System.out.println();
		System.out.println("Input Size: 256,000");
		
	// Instantiating the static array named "array" in "SortingAlgorithmTester" class and assigning to it 1000 random integers
		
		SortingAlgorithmTester.array = new Integer[256000];
		
		for (int i = 0 ; i < SortingAlgorithmTester.array.length ; i++)
		{
			SortingAlgorithmTester.array[i] = r.nextInt();
		}
		
		Testing();
		

}
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	/*	public static void Method(Integer [] array)
	{
	
//----------------------------------------------------------------------------
// Summary: Calls the "pairwiseDifference" method and passes to it the required 
//          parameter
// Precondition: takes an Integer array as a parameter and takes a String input
//               from the user to know what type of sorting algorithm should be 
//               implemented in order to calculate the smallest pairwise difference
// Postcondition: in a series of conditions in an if-statements, the code checks 
//                whether the output is valid or not, thus prints an error message 
//                when needed. If the input is valid, the "pairwiseDifference" is 
//                called passing to it the needed arguments ehich are the Integer 
//                array and the sorting type
// Note: check "pairwiseDifference(Integer[] arr, String sorting_algorithm)" for 
//       details of implementation
//----------------------------------------------------------------------------		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the sort you want to use:");
		String sort = scan.next();
		sort = sort.toLowerCase();
		
		if (!sort.equals("insertion") && !sort.equals("merge") && !sort.equals("quick") && !sort.equals("selection") )
		{
			System.out.println("Enter a valid sorting algorithm");
			return;	
		}
		
		pairwiseDifference(array, sort);

		
	}*/
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	

	
	public static void Method(Integer[] array, String sortType) 
	
//----------------------------------------------------------------------------
// Summary: Calls the "pairwiseDifference" method and passes to it the required 
//          parameter
// Precondition: takes an Integer array and an array-index-number as a parameter 
// Postcondition: gives the smallest pairwise difference in the array 
//	              after sorting it in the specified manner "sortType"
// Note: "sortType" denotes the index number of an array that has the 
//	     different sorting algorithms as explained below
//----------------------------------------------------------------------------
	
	{
		//-------------------------------------------------------------
		// sortType (a static String type array named "sortOptions" 
		// in the "SortingAlgorithmTester" class holds the names of  
		// the sorting types as follows:)
		// index 0 : selection
		// index 1 : insertion
		// index 2 : merge
		// index 3 : quick
		//-------------------------------------------------------------
		
		pairwiseDifference(array, sortType);
	}
	
	
	

	 
		
	public static void pairwiseDifference(Integer[] arr, String sorting_algorithm)
	
//----------------------------------------------------------------------------
// Summary: finds the smallest pairwise difference in a given array
// Precondition: takes an Integer array and a String that identifies 
//	               the sorting algorithm that will be used to sort the array 
//	               before searching it for the smallest pairwise difference
// Postcondition: sorts the array and prints out the smallest pairwise 
//	                difference in a specific format
//-----------------------------------------------------------------------------
	
	{
	
	// Calling the "sort" method which sorts the array using the specified 
	// sorting algorithm (Note: check the "sort" method below for details)
		
		sort(arr, sorting_algorithm);
		
	// In a sorted array the smallest pairwise difference are consecutive numbers 
	// that's why we initially assign the first number as the last element in the
	// array and the second number (which we will subtract from the first number) as 
	// the element directly before the first 
	// Note: we are starting from the end of the array
	
		int first = arr[arr.length-1];
		int second = arr[arr.length-2];
		
	// Calculating the absolute difference by subtracting the second number from 
	// the first number and getting their absolute value
		
		int difference = Math.abs(first - second);
		
	// In a for-loop we iterate through the array subtracting each two consecutive 
	// numbers and comparing them with each other until we find the smallest pairwise
	// difference (Note: an if-statement is added to check if there are two pairs with 
	// the smallest absolute difference, so only the one whose sum is the smallest is printed)
		
		for (int i = arr.length-2 ; i >= 1 ; i--)
		{
			if (Math.abs(arr[i]- arr[i-1]) <= difference)
			{
				first = arr[i];
				second = arr[i-1];
				difference = Math.abs(arr[i]- arr[i-1]);
			}
		}
		
	// Printing the result in the specified format
		
		System.out.println(difference + "[" + second + " " + first + "]");
	}
	
	

	
	private static void sort(Integer[] arr, String sorting_algorithm)
	
//-----------------------------------------------------------------------
// Summary: sorts an array using the specified sorting algorithm
// Precondition: takes an Integer array and a String that identifies 
//		             the sorting algorithm that will be used to sort the 
//	               array 
// Postcondition: sorts the Integer array after calling the method 
//	                of the specified sorting algorithm
//-----------------------------------------------------------------------	
	
	{
		
	// Using a switch-case statement, we check the "sorting_algorithm"
	// String and call the sorting method based on that String
		
		switch (sorting_algorithm)
		{
		case "insertion": Insertion.sort(arr);
		break;
		case "quick": Quick.sort(arr);
		break;
		case "merge": Merge.sort(arr);
		break;
		case "selection": Selection.sort(arr);
		
		}
	}
	
	
	
	
	
	  public static void Testing()
	  
//--------------------------------------------------------------------------------------------
// Summary: Since we are going to print a similar output for each of the five
//          input sizes, I put the output in a method to avoid repeatedly writing
//          the same long code 5 times
// Precondition: for each type of sorting algorithm, the method prints out the run-time
//            that it takes to calculate the smallest absolute pairwise difference 
// Postcondition: For each sorting type we test the code using array of RANDOM, ASCENDING, 
//                and DESCENDING order. And for each order, we call the static "runTime" 
//                method in the "SortingAlgorithmTester" class which takes an integer 
//                parameter as follows: 
//                                      0 : selection
//                                      1 : insertion
//                                      2 : merge
//                                      3 : quick
//
// Note (1): a static String type array named "sortOptions" in the "SortingAlgorithmTester" 
//           class holds the names of the sorting types and has index values as shown above
// Note (2): For the orders ASCENDING and DESCENDING, before calculating the runtime, I 
//           used the Quick "sort" method and its reverse "sort_descending"  method in order 
//           to sort the array in ascending and descending order, respectively.
//--------------------------------------------------------------------------------------------
		
	  {
		// SELECTION SORT 
			
					System.out.println("Sort Option: Selection" );
					
				// Randomly Ordered Array
					
					System.out.println("Random");
					SortingAlgorithmTester.runTime(0);
					
				// Ascending Order
					
					System.out.println("Ascending");
					Quick.sort(SortingAlgorithmTester.array);		
					SortingAlgorithmTester.runTime(0);
					
				// Descending Order
					
					System.out.println("Descending");
					Quick.sort_descending(SortingAlgorithmTester.array);
					SortingAlgorithmTester.runTime(0);
					
					
					System.out.println();
					
					
		 // INSERTION SORT 
					
					System.out.println("Sort Option: Insertion" );
							
					// Randomly Ordered Array
							
					System.out.println("Random");
					StdRandom.shuffle(SortingAlgorithmTester.array);
					SortingAlgorithmTester.runTime(1);
							
					// Ascending Order
							
					System.out.println("Ascending");	
					Quick.sort(SortingAlgorithmTester.array);			
					SortingAlgorithmTester.runTime(1);
							
					// Descending Order
						
					System.out.println("Descending");
					Quick.sort_descending(SortingAlgorithmTester.array);
					SortingAlgorithmTester.runTime(1);
					
					
					System.out.println();
					
					
				// MERGE SORT 
					
					System.out.println("Sort Option: Merge" );
							
					// Randomly Ordered Array
							
					System.out.println("Random");
					StdRandom.shuffle(SortingAlgorithmTester.array);
					SortingAlgorithmTester.runTime(2);
							
					// Ascending Order
							
					System.out.println("Ascending");	
					Quick.sort(SortingAlgorithmTester.array);			
					SortingAlgorithmTester.runTime(2);
							
					// Descending Order
						
					System.out.println("Descending");
					Quick.sort_descending(SortingAlgorithmTester.array);
					SortingAlgorithmTester.runTime(2);
					
				
					System.out.println();
					
					
				// QUICK SORT 
					
					System.out.println("Sort Option: Quick" );
							
					// Randomly Ordered Array
							
					System.out.println("Random");
					StdRandom.shuffle(SortingAlgorithmTester.array);
					SortingAlgorithmTester.runTime(3);
							
					// Ascending Order
							
					System.out.println("Ascending");	
					Quick.sort(SortingAlgorithmTester.array);			
					SortingAlgorithmTester.runTime(3);
							
					// Descending Order
					
					System.out.println("Descending");
					Quick.sort_descending(SortingAlgorithmTester.array);
					SortingAlgorithmTester.runTime(3);
					

	  }
	
}
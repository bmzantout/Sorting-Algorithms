package Assignment2;

import java.io.File;
import java.util.Scanner;

public class Part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//-----------------------------------------------------
		// Title: Part 1
		// Author: Basme Zantout
		// ID: 99227947762
		// Section: 1
		// Assignment: 2
		// Description: This is the main class for Part 1 which depends
		//              on the Sorting Algorithm Classes since it will sort
		//              Integer and Double arrays using different sorting 
	    //              algorithms and in different orders
		//-----------------------------------------------------

			

        //----------------------------------------------------------------
		// READING A TEXT FILE (of integers)
		// Note: Check "readFiles(String file)" method below for details
		//----------------------------------------------------------------	
		
		int numbers_int[] = readFiles("integers.txt");
		int n = numbers_int.length;
		
		// Using Integer[] not int[] in order to use Comparable[]
		
		Integer[] array_int = new Integer[n]; 
		
		
		// Filling the array with integers coming from the txt file
		
		for(int i = 0; i < n; i++)
		{
			array_int[i] = numbers_int[i];
		}
		
		//--------------------------------------------------------------//
		//                           STEP 1                             //
		//--------------------------------------------------------------//		
		
		System.out.println("Integers are reading from the integers.txt file, the array is:");
		
		//----------------------------------------------------------------
		// Printing out the original array of randomly-ordered integers
		//----------------------------------------------------------------
		
		printArray(array_int);
		
		System.out.println("The array has been sorted in increasing order by using the insertion sort algorithm:");
		
		//----------------------------------------------------------------
		// Sorting and Printing out out the array sorted in ascending 
		// order using "Insertion Sort" algorithm
		//----------------------------------------------------------------

		Insertion.sort(array_int);
		
		printArray(array_int);
		
		//--------------------------------------------------------------//
		//                       END OF STEP 1                          //
		//--------------------------------------------------------------//
		
		System.out.println("Step 1 has been completed.");
		System.out.println();
		
		
		
		//--------------------------------------------------------------//
		//                           STEP 2                             //
		//--------------------------------------------------------------//		
		
		
		System.out.println("The array of integers that has been sorted in decreasing order by using the insertion sort algorithm:");
		
		
		//----------------------------------------------------------------
		// Sorting and Printing out out the array sorted in descending 
		// order using the reverse of "Insertion Sort" algorithm
		// Note: Check "sort_decreasing(Comparable[] a)" method in
		// "Insertion.java" class for details
		//----------------------------------------------------------------
	
		Insertion.sort_decreasing(array_int);
		
		printArray(array_int);

		
		//--------------------------------------------------------------//
		//                       END OF STEP 2                          //
		//--------------------------------------------------------------//
	
		System.out.println("Step 2 has been completed.");
		System.out.println();
		
		
				
		//--------------------------------------------------------------//
		//                           STEP 3                             //
		//--------------------------------------------------------------//		
		
		
		//----------------------------------------------------------------
		// READING A TEXT FILE (of doubles)
		// Note: Check "readFiles_double(String file)" method below for 
		//       details
		//----------------------------------------------------------------	
			
		double numbers_double[] = readFiles_double("doubles.txt");
		n = numbers_double.length;
		
		// Using Double[] not double[] in order to use Comparable[]
		
		Double[] array_double = new Double[n]; 
		
		
		// Filling the array with doubles coming from the txt file
		
		for(int i = 0; i < n; i++)
		{
			array_double[i] = numbers_double[i];
		}
		
		
		System.out.println("Doubles are reading from the doubles.txt file, the array is:");
		
		//----------------------------------------------------------------
		// Printing out the original array of randomly-ordered doubles
		//----------------------------------------------------------------
	
		printArray(array_double);
		
		System.out.println("The array of double values has been sorted in increasing order by using the insertion sort algorithm:");

				
		//----------------------------------------------------------------
		// Sorting and Printing out out the array sorted in ascending 
		// order using "Insertion Sort" algorithm
		//----------------------------------------------------------------

		Insertion.sort(array_double);
		
		printArray(array_double);

		
		//--------------------------------------------------------------//
		//                       END OF STEP 3                          //
		//--------------------------------------------------------------//

		System.out.println("Step 3 has been completed.");
		System.out.println();
		
	
		
		//--------------------------------------------------------------//
		//                           STEP 4                             //
		//--------------------------------------------------------------//		
		
		//----------------------------------------------------------------
		// READING AGAIN THE TEXT FILE (of integers)
		// Note(1): Check "readFiles_double(String file)" method below for 
		//       details
		// Note(2): We are Re-reading the integer text file and Re-assigning
		//          it to array "array_int" so we don't use the same array
		//          we already sorted before
		//----------------------------------------------------------------	
			
		numbers_int = readFiles("integers.txt");
		n = numbers_int.length;
		
		// Using Integer[] not int[] in order to use Comparable[]
		
		array_int = new Integer[n];
		
		// Filling the array with integers coming from the txt file
		
		for(int i = 0; i < n; i++)
		{
			array_int[i] = numbers_int[i];
		}
		
		System.out.println("The original array is:");
		
		//----------------------------------------------------------------
		// Printing out the original array of randomly-ordered integers
		//----------------------------------------------------------------
	
		printArray(array_int);
		
		System.out.println("The array of integer values has been sorted in descending order by using the merge sort algorithm is:");
		
		//----------------------------------------------------------------
		// Sorting and Printing out out the array sorted in ascending 
		// order using "Merge Sort" algorithm
		//----------------------------------------------------------------

	    Merge.sort(array_int);
		
		printArray(array_int);
		
				
		//--------------------------------------------------------------//
		//                       END OF STEP 4                          //
		//--------------------------------------------------------------//

		System.out.println("Step 4 has been completed.");
		System.out.println();
		
		
		
		//--------------------------------------------------------------//
		//                           STEP 6                             //
		//--------------------------------------------------------------//		
		
				
		//----------------------------------------------------------------
		// Instantiating 10 Route objects and putting them in a Route 
		// array in order to sort them
		// Note(1): Route Objects are comparable objects so we can sort
		// them using the sorting algorithms like "Quick Sort"
		// Note(2): Check the "Route.java" class for implementation details
		//----------------------------------------------------------------
	
		Route [] array_routes = {
		new Route("Ankara", "Antalya"),
		new Route("Ankara", "Istanbul"),
		new Route("Istanbul", "Antalya"),
		new Route("Antalya", "Izmir"),
		new Route("Izmir", "Antalya"),
		new Route("Izmir", "Ankara"),
		new Route("Antalya", "Ankara"),
		new Route("Ankara", "Izmir"),
		new Route("Istanbul", "Izmir"),
		new Route("Istanbul", "Ankara")};
		
		
		//----------------------------------------------------------------
		// Sorting and Printing out out the  Route array sorted in ascending 
		// order using "Quick Sort" algorithm
		// Note: the sort algorithm in Quick.java class is edited to take 
		// an extra String parameter which specifies the order that the 
		// the array will be sorted in. In this case we'll sort it in
        // ascending order, so the parameter String indicates "increasing"
        // Note: Check "printRoute(Route[] a)" method in Routa.java class
        //       for details
		//----------------------------------------------------------------

		Quick.sort(array_routes, "increasing");
		
		Route.printRoute(array_routes);
		
		System.out.println();
		
		//--------------------------------------------------------------//
		//                       END OF STEP 6                          //
		//--------------------------------------------------------------//

		System.out.println("Step 6 has been completed.");
		System.out.println();
		
		
	}
	
	
	
	
	private static int[] readFiles(String file) {
	
//--------------------------------------------------------------
// Summary: Reads a text file of integer values and assigns those
//          values to an array of type int
// Precondition: Takes the file name as a parameter and scans the 
//              values in it using Scanner class
// Postcondition: inside a while-loop, using "hasNextInt()" and 
//                "nextInt" methods, we scan the text file in 
//                order to save the number of integers found in
//                the text file. Then, after instantiating an
//                int array with the size calculated we use a 
//                for-loop in order, another scanner object, and 
//                the method "nextInt" in order to fill the array 
//                with the integer values in the text file
//--------------------------------------------------------------

	
		try {
			
			File f = new File(file);
			Scanner s = new Scanner(f);
			int n = 0;

			while(s.hasNextInt())
			{
				n++;
				s.nextInt();
			}
			
			int S[] = new int[n];

			Scanner s1 = new Scanner(f);

			for(int i = 0; i < S.length; i++)
				S[i] = s1.nextInt();

			s.close();
			s1.close();
			
			return S;

		}
		
		catch(Exception e) {
			return null;
		}
	}
	
	private static double[] readFiles_double(String file) {
	
//--------------------------------------------------------------
// Summary: Reads a text file of double values and assigns those
//          values to an array of type double
// Precondition: Takes the file name as a parameter and scans the 
//              values in it using Scanner class
// Postcondition: inside a while-loop, using "hasNextDouble()" and 
//                "nextDouble" methods, we scan the text file in 
//                order to save the number of doubles found in
//                the text file. Then, after instantiating a
//                double array with the size calculated we use a 
//                for-loop in order, another scanner object, and 
//                the method "nextDouble" in order to fill the array 
//                with the double values in the text file
//--------------------------------------------------------------
		
		try {
			
			File f = new File(file);
			Scanner s = new Scanner(f);
			int n = 0;

			while(s.hasNextDouble())
			{
				n++;
				s.nextDouble();
			}
			
			double S[] = new double[n];

			Scanner s1 = new Scanner(f);

			for(int i = 0; i < S.length; i++)
				S[i] = s1.nextDouble();

			s.close();
			s1.close();
			
			return S;

		}
		
		catch(Exception e) {
			return null;
		}
	}
	
	
	public static void printArray(Integer[] arr)
	
//--------------------------------------------------------------
// Summary: prints out an Integer type array in a specific format
// Precondition: takes an Integer array as a parameter 
// Postcondition: using a for-loop which iterates through the
//                elements of the array one by one, the array's 
//                elements are printed out to the console on the 
//                same line and separated by spaces
//--------------------------------------------------------------
	
	{
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
			System.out.println();
		
	}
	
	public static void printArray(Double[] arr)
	
//--------------------------------------------------------------
// Summary: prints out a Double type array in a specific format
// Precondition: takes a Double array as a parameter 
// Postcondition: using a for-loop which iterates through the
//                elements of the array one by one, the array's 
//                elements are printed out to the console on the 
//                same line and separated by spaces
//--------------------------------------------------------------
	
	{
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
			System.out.println();
		
	}
			

}

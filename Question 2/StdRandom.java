package Assignment2_Part2;

import java.util.Random;

public class StdRandom {


	//----------------------------------------------------------
	// Title: Part 2
	// Author: Basme Zantout
	// ID: 99227947762
	// Section: 1
	// Assignment: 2
	// Description: This class includes the needed algorithm to
	//              shuffle an array in a uniformly random way
	//----------------------------------------------------------

		
	
//-----------------------------------------------------
// Summary: Shuffles the array in a uniformly 
//          random manner
// Note: check the "exch(Comparable[] a, int i, int j)"
//       method for the implementation of the swapping
//       operation
//-----------------------------------------------------	
	 	
	public static void shuffle (Comparable[] a)
	{
		int N = a.length;
		 for (int i = 0; i < N; i++)
		 {
		 int r = StdRandom.uniform(i + 1);
		 exch(a, i, r);
	     }
	}
	
	
	
//-----------------------------------------------
// Summary: Implements the "swapping" operation 
//-----------------------------------------------	
	 
	private static void exch(Comparable[] a, int i, int j)
	 {
		 Comparable t = a[i]; a[i] = a[j]; a[j] = t; 
	 }
	
	
//-----------------------------------------------
// Summary: Generate uniformly random integers 
//-----------------------------------------------	

	 private static int uniform(int x)
	 {
		 int r = (int) (Math.random() * (x));
		 return r;
	 }
	 
}

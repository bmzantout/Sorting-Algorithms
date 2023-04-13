package Assignment2_Part2;

import Assignment2.StdRandom;

public class Quick {


	//-----------------------------------------------------------------
	// Title: Part 2
	// Author: Basme Zantout
	// ID: 99227947762
	// Section: 1
	// Assignment: 2
	// Description: This class includes the Quick Sort Algorithm
	//              and it depends on the StdRandom.java class 
	//              which shuffles an array in a uniformly random way
	//-----------------------------------------------------------------

			 
	
//-----------------------------------------------
// Summary: Sorts a "Comparable" array 
// Precondition: shuffles the given array
// Postcondition: calls a recursive sorting method
//                that does the needed partitioning
// Note: check the "StdRandom" class for the shuffle
//       method
//-----------------------------------------------	
	
	public static void sort(Comparable[] a)
    {
    	
   // Eliminate dependence on input
		
   	 StdRandom.shuffle(a); 
   	 sort(a, 0, a.length - 1);
   	 
   	 }
    
    
	
//---------------------------------------------------------
// Summary: Partitions and Sorts 
// Precondition: partitions the array 
// Postcondition: calls itself recursively to sort 
//                both "left" and "right" partitions
// Note: check "partition(Comparable[] a, int lo, int hi)"
//       method below
//---------------------------------------------------------	
		   
   	 private static void sort(Comparable[] a, int lo, int hi)
   	 {
   		 
   	 if (hi <= lo) return;
   	 
   	 int j = partition(a, lo, hi);
   		 
   	 
  // Sort left part a[lo .. j-1]
   	 
   	 sort(a, lo, j-1); 
   	 
  // Sort right part a[j+1 .. hi]
   	 
   	 sort(a, j+1, hi); 
   	 
    }
	 
   	 
 	
//---------------------------------------------------------
// Summary: Partitions the array 
// Condition: partitions the array and performs the 
//               needed swapping and comparisons
// Note: check "less(Comparable v, Comparable w)" and 
//       "exch(Comparable[] a, int i, int j)" methods 
//       below for implementation details
//---------------------------------------------------------	
   			 
   	private static int partition(Comparable[] a, int lo, int hi)
   	{ 
   		
  // left and right scan indices
   		
   	 int i = lo, j = hi+1; 
   	 
  // partitioning item
   	 
   	 Comparable v = a[lo]; 
   	 
   	 while (true)
   	 { 
   		 
  // Scan right, scan left, check for scan complete, and exchange
   		 
   	 while (less(a[++i], v)) if (i == hi) break;
   	 while (less(v, a[--j])) if (j == lo) break;
   	 if (i >= j) break;
   	 exch(a, i, j);
   	 }
   	 
  // Put v = a[j] into position
   	 
   	 exch(a, lo, j); 
   	 
  // with a[lo..j-1] <= a[j] <= a[j+1..hi]
   	 
   	 return j; 
   	}
   	
   	
 	
//---------------------------------------------------------
// Summary: the reverse method of "sort(Comparable[] a)". 
//          Sorts in descending order
//---------------------------------------------------------	
   	  	
   	public static void sort_descending(Comparable[] a)
    {
    	
   // Eliminate dependence on input
		
   	 StdRandom.shuffle(a); 
   	 sort_descending(a, 0, a.length - 1);
   	 
   	 }
    
    
 	
//------------------------------------------------------------------------
// Summary: the reverse method of "sort(Comparable[] a, int lo, int hi)". 
//          Sorts in descending order
//-------------------------------------------------------------------------	
      
   	 private static void sort_descending(Comparable[] a, int lo, int hi)
   	 {
   		 
   	 if (hi <= lo) return;
   	 
   	 int j = partition_descending(a, lo, hi);
   		 
   	 
  // Sort left part a[lo .. j-1]
   	 
   	 sort_descending(a, lo, j-1); 
   	 
  // Sort right part a[j+1 .. hi]
   	 
   	 sort_descending(a, j+1, hi); 
   	 
    }
	 
   	 
  	
//-----------------------------------------------------------------------------
// Summary: the reverse method of "partition(Comparable[] a, int lo, int hi)". 
//             Sorts in descending order
//-----------------------------------------------------------------------------	
        	 
   	private static int partition_descending(Comparable[] a, int lo, int hi)
   	{ 
   		
  // left and right scan indices
   		
   	 int i = lo, j = hi+1; 
   	 
  // partitioning item
   	 
   	 Comparable v = a[lo]; 
   	 
   	 while (true)
   	 { 
   		 
  // Scan right, scan left, check for scan complete, and exchange
   		 
     	// the comparisons are the opposite in ascending and descending orders
   		 
   		     while (less(v, a[++i])) if (i == hi) break; 
   		     
   		// the comparisons are the opposite in ascending and descending orders
   		     
         	 while (less(a[--j],v )) if (j == lo) break; 
         	 
   	 if (i >= j) break;
   	 exch(a, i, j);
   	 }
   	 
  // Put v = a[j] into position
   	 
   	 exch(a, lo, j); 
   	 
  // with a[lo..j-1] <= a[j] <= a[j+1..hi]
   	 
   	 return j; 
   	}
   	
   	
	
//---------------------------------------------
// Summary: Compares two "Comparable" objects 
//---------------------------------------------		
   	
	 private static boolean less(Comparable v, Comparable w)
	 {
		 return v.compareTo(w) < 0;
	 }
	 

		
//-----------------------------------------------
// Summary: Implements the "swapping" operation 
//-----------------------------------------------	
	   	
	 private static void exch(Comparable[] a, int i, int j)
	 {
		 Comparable t = a[i]; 
		 a[i] = a[j]; 
		 a[j] = t; 
	 }
	 
}


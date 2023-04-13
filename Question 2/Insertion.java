package Assignment2_Part2;

public class Insertion {


	//-----------------------------------------------------
	// Title: Part 2
	// Author: Basme Zantout
	// ID: 99227947762
	// Section: 1
	// Assignment: 2
	// Description: This class includes the Insertion Sort Algorithm
	//-----------------------------------------------------

		
//-------------------------------------------------------
// Summary: sorts a "Comparable" array using "Insertion"
//          sort algorithm
// Note: check "less(Comparable v, Comparable w)" and 
//       "exch(Comparable[] a, int i, int j)" methods 
//       below for implementation details
//-------------------------------------------------------	
		
    public static void sort(Comparable[] a)
    {

  // Sort a[] into increasing order
    	
   	 int N = a.length;
   	 
   	 for (int i = 1; i < N; i++)
   	 {
   		 
   	// Insert a[i] among a[i-1], a[i-2], a[i-3]... ..
   		 
   		 for (int j = i; j > 0 && less(a[j], a[j-1]); j--)
   			 {
   			   exch(a, j, j-1);
   			 }
   	 }
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
		 Comparable t = a[i]; a[i] = a[j]; a[j] = t; 
	 }

}

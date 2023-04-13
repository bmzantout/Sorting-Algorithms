package Assignment2_Part2;

public class Selection {

	

	//-----------------------------------------------------------------
	// Title: Part 2
	// Author: Basme Zantout
	// ID: 99227947762
	// Section: 1
	// Assignment: 2
	// Description: This class includes the Selection Sort Algorithm
	//-----------------------------------------------------------------

				
//-------------------------------------------------------
// Summary: sorts a "Comparable" array using "Selection"
//	        sort algorithm
// Note: check "less(Comparable v, Comparable w)" and 
//	       "exch(Comparable[] a, int i, int j)" methods 
//	       below for implementation details
//-------------------------------------------------------	
				
    public static void sort(Comparable[] a)
    {
    	  // Sort a[] into increasing order.
    	  // array length
    		 int N = a.length;
    		 
    	  // Exchange a[i] with smallest entry in a[i+1...N).
    		 for (int i = 0; i < N; i++)
    		 { 
    	 
    	  // index of minimal entry
    		 int min = i; 
    		 for (int j = i+1; j < N; j++)
    		 if (less(a[j], a[min])) min = j;
    		 exch(a, i, min);
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
//Summary: Implements the "swapping" operation 
//-----------------------------------------------	

	 private static void exch(Comparable[] a, int i, int j)
	 {
		 Comparable t = a[i]; a[i] = a[j]; a[j] = t; 
	 }
}

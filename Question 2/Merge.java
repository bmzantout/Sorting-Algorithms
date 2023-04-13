package Assignment2_Part2;

public class Merge {


	//-----------------------------------------------------
	// Title: Part 2
	// Author: Basme Zantout
	// Description: This class includes the Merge Sort Algorithm
	//-----------------------------------------------------

		
// auxiliary array for merges	
	
	private static Comparable[] aux; 
	 
	 
	
//----------------------------------------------------
// Summary: sorts a "Comparable" array using "Merge"
//          algorithm
// Condition: calls a recursive sorting method
//	          that does the needed merging operation
//----------------------------------------------------	
					 
    public static void sort(Comparable[] a)
    {
    	
    // Allocate space just once.
    	aux = new Comparable[a.length]; 
		 sort(a, 0, a.length - 1);
    }
		 

	
//---------------------------------------------------------------
// Summary: Merges and Sorts 
// Precondition: Merges the array 
// Postcondition: calls itself recursively to sort 
//                  both "left" and "right" parts
// Note: check "merge(Comparable[] a, int lo, int mid, int hi)"
//         method below
//----------------------------------------------------------------
  		
    private static void sort(Comparable[] a, int lo, int hi)
    {
    	// Sort a[lo..hi]
		 
		 if (hi <= lo) return;
		 int mid = lo + (hi - lo)/2;
		 
	// Sort left half
		 sort(a, lo, mid);
		 
	// Sort right half
		 sort(a, mid+1, hi); 
		 
		 merge(a, lo, mid, hi); 
    }
 

 	
//---------------------------------------------------------
// Summary: Merges the array 
// Condition: Merges the array and performs the 
//               needed swapping and comparisons
// Note: check "less(Comparable v, Comparable w)" and 
//       "exch(Comparable[] a, int i, int j)" methods 
//       below for implementation details
//---------------------------------------------------------	
   			 		 
    public static void merge(Comparable[] a, int lo, int mid, int hi)
    {
    	
    // Merge a[lo..mid] with a[mid+1..hi]
		 
		  int i = lo, j = mid+1;
		  
	// Copy a[lo..hi] to aux[lo..hi]
		  
		  for (int k = lo; k <= hi; k++) 
		  {
			  aux[k] = a[k];
		  }
	
	// Merge back to a[lo..hi]
		  
		  for (int k = lo; k <= hi; k++) 
		  {
			  if (i > mid) 
			  {
				  a[k] = aux[j++];
			  }
			  
			  else if (j > hi ) 
			  {
				  a[k] = aux[i++];
			  }
			  
			  else if (less(aux[j], aux[i])) 
			  {
				  a[k] = aux[j++];
			  }
			  
			  else a[k] = aux[i++];
		  }

    }
    
    
//---------------------------------------------
// Summary: Compares two "Comparable" objects 
//---------------------------------------------		
   		 
    private static boolean less(Comparable v, Comparable w)
    {
    	return v.compareTo(w) < 0;
    }
    
    
}

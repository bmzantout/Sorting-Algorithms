package Assignment2;

public class Quick {


	//-----------------------------------------------------------------
	// Title: Part 1
	// Author: Basme Zantout
	// Description: This class includes the Quick Sort Algorithm
	//              and it depends on the StdRandom.java class 
	//              which shuffles an array in a uniformly random way
	//-----------------------------------------------------------------

			 
//-----------------------------------------------
// Summary: Sorts a "Comparable" array 
// Precondition: shuffles the given array
// Postcondition: calls a recursive sorting method
//	                that does the needed partitioning
// Note: check the "StdRandom" class for the shuffle
//	       method
//-----------------------------------------------	
			
    public static void sort(Comparable[] a, String inc_dec)
    {
    	
   // Eliminate dependence on input
		
   	 StdRandom.shuffle(a); 
   	 sort(a, 0, a.length - 1, inc_dec);
   	 
   	 }
    
    
	
//--------------------------------------------------------------------
// Summary: Partitions and Sorts 
// Precondition: partitions the array 
// Postcondition: calls itself recursively to sort 
//                  both "left" and "right" partitions
// Note (1): check "partition(Comparable[] a, int lo, int hi)"
//           method below
// Note (2): the method takes an extra String type parameter
//           called "inc_dec" which specifies the order of sorting
//           if it is "ascending" then "j = partition(a, lo, hi)" is 
//           called, and if it is "descending" then the method
//           "partition_descending(a, lo, hi)" is called
//---------------------------------------------------------------------	
  		       
   	 private static void sort(Comparable[] a, int lo, int hi, String inc_dec)
   	 {
   		 
   	 if (hi <= lo) return;
   	 int j = 0;
   	 
   	 if (inc_dec.equalsIgnoreCase("descending"))
   	 {
   		j = partition_descending(a, lo, hi);
   	 }
   	 else 
   	 {
   		j = partition(a, lo, hi);
   	 }
   		 
   	 
  // Sort left part a[lo .. j-1]
   	 
   	 sort(a, lo, j-1, inc_dec); 
   	 
  // Sort right part a[j+1 .. hi]
   	 
   	 sort(a, j+1, hi, inc_dec); 
   	 
    }
	 
   	 
  	
//---------------------------------------------------------
// Summary: Partitions the array 
// Condition: partitions the array and performs the 
//                  needed swapping and comparisons
// Note: check "less(Comparable v, Comparable w)" and 
//          "exch(Comparable[] a, int i, int j)" methods 
//          below for implementation details
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
   	
   	
  	
//-----------------------------------------------------------------------------
// Summary: the reverse method of "partition(Comparable[] a, int lo, int hi)". 
//             Sorts in descending order
//-----------------------------------------------------------------------------	
        	    	
   	private static int partition_descending (Comparable[] a, int lo, int hi)
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
//Summary: Implements the "swapping" operation 
//-----------------------------------------------	
		 
	 private static void exch(Comparable[] a, int i, int j)
	 {
		 Comparable t = a[i]; a[i] = a[j]; a[j] = t; 
	 }
	 
}

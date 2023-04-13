package Assignment2_Part2;

public class SortingAlgorithmTester {


	//-----------------------------------------------------------------
	// Title: Part 2
	// Author: Basme Zantout
	// Description: This class includes the runTime method which evaluates
	//              the run time of a piece of code using different sorting
	//              algorithms
	//-----------------------------------------------------------------

			
// ATTRIBUTES
	
  //------------------------------------------------
  // A static Integer type array that will 
  // be used for performing the testing algorithms
  //------------------------------------------------
	
	public static Integer [] array;
	
  //------------------------------------------------
  // a static String type array named "sortOptions" 
  // which holds the names of the sorting types and 
  // has index values as shown below
  //------------------------------------------------	
	
	public static String [] sortOptions = {"selection", "insertion", "merge", "quick"};
	
	

	//------------------------------------------------
	// A static Integer type array that will 
	// be used for performing the testing algorithms
	//------------------------------------------------
		
	
	
 public static void runTime(int k)

//-------------------------------------------------------------------
// Summary: calculates the runtime of the "Method" method
// Precondition: uses the "currentTimeMillis()" method before
//               and after calling the method "Method"in a 
//               for-loop so we take an approximate value of
//               the run time
// Postcondition: the "currentTimeMillis()" method returns a 
//                long and the array "times[]" holds three run
//                times in which the smallest is printed out
// Note: the integer parameter "k" holds the index of the String
//       value in the array "sortOptions" in order to indicate the
//       soritng algorithm that will be used in the "Method" method
//--------------------------------------------------------------------
		
 {
	 Long [] times = new Long [3];
	 for(int j=0; j<3; j++)
	 {
	 Long t1 = System.currentTimeMillis();
	 Method.Method(array, sortOptions[k]);
	 Long t2 = System.currentTimeMillis();
	 times[j] = t2-t1;
	 }

	 Insertion.sort(times);
	 System.out.println("Time: " + times[1]);
 }
	

}

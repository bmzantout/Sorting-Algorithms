package Assignment2;

public class Route implements Comparable<Route> {


	//-----------------------------------------------------
	// Title: Part 1
	// Author: Basme Zantout
	// ID: 99227947762
	// Section: 1
	// Assignment: 2
	// Description: This class that will be used to instantiate 
	//              Comparable Route objects
	//-----------------------------------------------------

			 
// ATTRIBUTES
	
	private String source;
	private String destintion;
	

	public Route (String source, String destination)
	
   //---------------------------------------------------------------------
   // Constructor: Instantiate the attributes "source" and "destination"
   //---------------------------------------------------------------------
   
	{
		this.source = source;
		this.destintion = destination;
	}
	
	
	public int compareTo(Route that) 
	
	//---------------------------------------------------------------------------------
	// Since the "Route" class implements Comparable it should also implement the 
    // method "compareTo" which determines what makes one Route object greater or
    // or less than another Route Object
	// Note (1): to compare two Route objects we're comparing their "source"s if they
    //           are the same we compare their "destination"s 
	// Note (2): I used the "compareTo" method of the String objects to compare the 
	//           Strings "source" and "destination"
	//---------------------------------------------------------------------------------	
	  
	{
		
		if ((this.source).equals(that.source))
		{
			return (this.destintion).compareTo(that.destintion);
		}
		
		else return ((this.source).compareTo(that.source));
		
	}
	
	

	
	public static void printRoute(Route[] a)
	
	//-----------------------------------------------------------------------------
	// Summary: this method prints out the "source" and "destination" attributes
	//          of each element in a Route array
	//-----------------------------------------------------------------------------	
	  
	{
		for (int i = 0 ; i < a.length ; i++)
		{
			System.out.println(a[i].source + " " + a[i].destintion);
		}
	}
	
}

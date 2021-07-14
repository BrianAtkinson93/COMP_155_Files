/*Code Authored by:
***Dr. Opeyemi Olusegun Adesina
***School of Computing, University of the Fraser Valley, Abbotsford - Canada
***All rights reserved - For reuse purposes, please contact Dr. Adesina at [opeyemi.adesina@ufv.ca]
**/

public class Location {
	
	//instance variables
	double longitude, latitude;
	
	//default constructor
	public Location() {
		//INSERT YOUR CODE HERE...
	}
	
	//parameterized constructor
	public Location( double longitude, double latitude ) {
		//INSERT YOUR CODE HERE...
	}
	
	public double getLongitude() {
		//INSERT YOUR CODE HERE...
		return 0.0;
	}
	
	public double getLatitude() {
		//INSERT YOUR CODE HERE...
		return 0.0;
	}
	
	public void setLongitude( double longitude ) {
		//INSERT YOUR CODE HERE...
	}
	
	public void setLatitude( double latitude ) {
		//INSERT YOUR CODE HERE...
	}
	
	public boolean equals( Location other ) {
		
		//INSERT YOUR CODE HERE...
		
		return false;
	}
	
	public String toString() {
		return "Located at: [longitude: " + longitude +", latitude: " + latitude +"]";
	}
}
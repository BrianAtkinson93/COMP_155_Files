/*Code Authored by:
***Dr. Opeyemi Olusegun Adesina
***School of Computing, University of the Fraser Valley, Abbotsford - Canada
***All rights reserved - For reuse purposes, please contact Dr. Adesina at [opeyemi.adesina@ufv.ca]
**/

import tracker.objects.*;

public class Circle extends Shape {
	
	//instance variable
	private double radius;
	private static final double PI = 3.142; 
	
	public Circle() {
		//INSERT YOUR CODE HERE...
	} 
	
	public Circle( double radius, Location centrePoint ) {
		//INSERT YOUR CODE HERE...
	}
	
	public void setRadius( double radius ) {
		//INSERT YOUR CODE HERE...
	}

	public double getRadius() {
		//INSERT YOUR CODE HERE...
		return 0.0;
	}
	
	public double area() {
		//INSERT YOUR CODE HERE...
		return 0.0;
	}
	
	public double perimeter() {
		//INSERT YOUR CODE HERE...
		return 0.0;
	}
	
	public Rectangle getBoundingRectangle() {
		double length = 2 * radius;
		return new Rectangle( length, length, getCentrePoint() );
	}
	
	public boolean equals( Circle other ) {
		
		//INSERT YOUR CODE HERE...
		
		return false;
	}
	
	public String toString() {
		return "Circle: [radius: " + radius +", "+ getCentrePoint() +"]";
	}
}
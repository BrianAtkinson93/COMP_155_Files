/*Code Authored by:
***Dr. Opeyemi Olusegun Adesina
***School of Computing, University of the Fraser Valley, Abbotsford - Canada
***All rights reserved - For reuse purposes, please contact Dr. Adesina at [opeyemi.adesina@ufv.ca]
**/

import tracker.objects.*;
import java.util.*;

public class Rectangle extends Shape {
	
	//instance variable
	private double length, width;
	
	public Rectangle() {
		//INSERT YOUR CODE HERE...
	} 
	
	public Rectangle( double length, double width, Location centrePoint ) {
		//INSERT YOUR CODE HERE...
	}
	
	public void setLength( double length ) {
		//INSERT YOUR CODE HERE...
	}
	
	public void setWidth( double width ) {
		//INSERT YOUR CODE HERE...
	}
	
	public double getLength() {
		//INSERT YOUR CODE HERE...
		return 0.0;
	}
	
	public double getWidth() {
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

	/**This method converts the rectangle to its corner points using the following mathematical, let
			radius be the operational radius of coverage
			(x,y) be the centrepoint of the rectangle
				then
					x1 = radius + x
					x2 = x - radius
					y1 = radius + y
					y2 = y - radius 
			
				AND
					(x1, y1) defines top-right corner with key - TR
					(x1, y2 ) defines bottom-right corner with key - BR
					(x2, y1) defines top-left corner with key - TL
					(x2, y2) defines bottom-left corner with key - BL
		ARGUMENTS:
			radius - operational radius of coverage

		RETURN:
			corners - a map of the corner points of a rectangle shape

	**/
	public Map<String, Location> getCornerPoints( double radius ) {
		
		Map<String, Location> corners = new HashMap<>();

		//INSERT YOUR CODE HERE...
		return corners;
	}
	
	public Rectangle getBoundingRectangle() {
		return this;
	}
	
	public boolean equals( Rectangle other ) {
		if( other != null ) {
			return length == other.length && width == other.width && getCentrePoint().equals( other.getCentrePoint() );
		}
		return false;
	}
	
	public String toString() {
		return "Rectangle: [length: " + length +", width: "+ width + ", "+ getCentrePoint() +"]";
	}
}
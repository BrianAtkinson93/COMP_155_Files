/*Code Authored by:
 ***Dr. Opeyemi Olusegun Adesina
 ***School of Computing, University of the Fraser Valley, Abbotsford - Canada
 ***All rights reserved - For reuse purposes, please contact Dr. Adesina at [opeyemi.adesina@ufv.ca]
 **/

package tracker.shapes;

import tracker.objects.*;

import java.awt.*;

public class Rectangle extends Shape {

    //instance variable
    private double length, width;

    public Rectangle() {
        //INSERT YOUR CODE HERE
        length = 0.0;
        width = 0.0;
    }

    public Rectangle( double length, double width, Location centrePoint ) {
        //INSERT YOUR CODE HERE
        this.length = length;
        this.width = width;
    }

    public void setLength( double length ) {
        //INSERT YOUR CODE HERE
        this.length = length;
    }

    public void setWidth( double width ) {
        //INSERT YOUR CODE HERE
        this.width = width;
    }

    public double getLength() {
        //INSERT YOUR CODE HERE
        return length;
    }

    public double getWidth() {
        //INSERT YOUR CODE HERE
        return width;
    }

    public double area() {
        //INSERT YOUR CODE HERE
        //System.out.println(length * width);
        return (length * width);
    }

    public double perimeter() {
        //INSERT YOUR CODE HERE
        //System.out.println(2 * (length + width));
        return 2 * (length + width);
    }

    public Rectangle boundingRectangle() {
        //INSERT YOUR CODE HERE
        return this;
    }

    public boolean equals( Rectangle other ) {
        //INSERT YOUR CODE HERE
        /**
         * Here we use the getters to verify that the
         *  variables are the same for quality assurance.*/
        return other.width == this.width && other.length == this.length;
    }

    public String toString() {
        //INSERT YOUR CODE HERE
        return "Rectangle: [length: " + length + ", width: " + width + ", " + getCentrePoint() + "]" ;
    }
}
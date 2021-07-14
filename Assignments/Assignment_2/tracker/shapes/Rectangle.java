/*Code Authored by:
 ***Dr. Opeyemi Olusegun Adesina
 ***School of Computing, University of the Fraser Valley, Abbotsford - Canada
 ***All rights reserved - For reuse purposes, please contact Dr. Adesina at [opeyemi.adesina@ufv.ca]
 **/

package tracker.shapes;

import tracker.objects.Location;

public class Rectangle extends Shape {

    //instance variable
    private double length, width;

    public Rectangle() {

        length = 0.0;
        width = 0.0;
    }

    public Rectangle( double length, double width, Location centrePoint ) {
        super(centrePoint);
        this.length = length;
        this.width = width;
    }

    public void setLength( double length ) {

        this.length = length;
    }

    public void setWidth( double width ) {

        this.width = width;
    }

    public double getLength() {

        return length;
    }

    public double getWidth() {

        return width;
    }

    public double area() {

        return (length * width);
    }

    public double perimeter() {

        return 2 * (length + width);
    }

    public Rectangle boundingRectangle() {

        return this;
    }

    public boolean equals( Rectangle other ) {

        /*
         * Here we use the getters to verify that the
         *  variables are the same for quality assurance.*/
        return other.width == this.width && other.length == this.length;
    }

    public String toString() {
        /*
         * Preparing output for rectangle length and width
         */
        return "Rectangle: [length: " + length + ", width: " + width + ", " + getCentrePoint() + "]" ;
    }
}
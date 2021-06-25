/*Code Authored by:
 ***Dr. Opeyemi Olusegun Adesina
 ***School of Computing, University of the Fraser Valley, Abbotsford - Canada
 ***All rights reserved - For reuse purposes, please contact Dr. Adesina at [opeyemi.adesina@ufv.ca]
 **/

package tracker.shapes;

import tracker.objects.*;

import java.awt.*;

public class Circle extends Shape {

    private double radius;
    private static final double PI = 3.142;

    public Circle() {
        //INSERT YOUR CODE
        radius = 0.0;
    }

    public Circle( double radius, Location centrePoint ) {
        //INSERT YOUR CODE
        super(centrePoint);
        this.radius = radius;
    }

    public void setRadius( double radius ) {
        //INSERT YOUR CODE
        this.radius = radius;
    }

    public double getRadius() {

        //INSERT YOUR CODE
        return radius;
    }

    public double area() {

        //INSERT YOUR CODE
        //System.out.println(Math.round(PI * (radius*radius)*100.0)/100.0);
        return Math.round((PI * (radius*radius)*100.0)/100.0);
    }

    public double perimeter() {

        //INSERT YOUR CODE
        //System.out.println(Math.round((2*PI*radius)*100.0)/100.0);
        return Math.round((2*PI*radius)*100.0)/100.0;
    }

    public Rectangle boundingRectangle() {

        //INSERT YOUR CODE
        return null;
    }

    public boolean equals( Circle other ) {

        //INSERT YOUR CODE
        return false;
    }

    public String toString() {
        //INSERT YOUR CODE
        return "Circle: [radius: " + radius + ", " + getCentrePoint() + "]";
    }
}
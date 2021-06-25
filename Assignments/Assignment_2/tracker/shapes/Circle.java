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

        radius = 0.0;
    }

    public Circle(double radius, Location centrePoint) {

        super(centrePoint);
        this.radius = radius;
    }

    public void setRadius(double radius) {

        this.radius = radius;
    }

    public double getRadius() {

        return radius;
    }

    public double area() {

        /**
         * Basic math here for calculating area
         */
        return Math.round(PI * (radius * radius) * 100.0) / 100.0;
    }

    public double perimeter() {

        /**
         * Basic math for calculating perimeter
         */
        return Math.round((2 * PI * radius) * 100.0) / 100.0;

    }

    public Rectangle boundingRectangle() {

        /**
         * basic math here for finding a square around a circle
         */
        return new Rectangle(2.0 * radius, 2.0 * radius, getCentrePoint());
    }

    public boolean equals(Circle other) {

        /**
         * Here we prepare are filling in the code for comparison
         *  for the quality assurance check.
         */
        return other.radius == this.radius && other.getCentrePoint().equals(this.getCentrePoint());
    }

    public String toString() {
        /**
         * Here we prepare our radius and longitude/latitude output
         */
        return "Circle: [radius: " + radius + ", " + getCentrePoint() + "]";
    }
}
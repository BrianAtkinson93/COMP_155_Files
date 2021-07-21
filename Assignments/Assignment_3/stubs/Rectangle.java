/*Code Authored by:
 ***Dr. Opeyemi Olusegun Adesina
 ***School of Computing, University of the Fraser Valley, Abbotsford - Canada
 ***All rights reserved - For reuse purposes, please contact Dr. Adesina at [opeyemi.adesina@ufv.ca]
 **/

import java.security.Key;
import java.util.*;

public class Rectangle extends Shape {

    //instance variable
    private double length, width;

    public Rectangle() {
        //INSERT YOUR CODE HERE...
        this.length = 0.0D;
        this.width = 0.0D;
    }

    public Rectangle(double length, double width, Location centrePoint) {
        //INSERT YOUR CODE HERE...
        super(centrePoint);
        this.length = length;
        this.width = width;
    }

    public void setLength(double length) {
        //INSERT YOUR CODE HERE...
        this.length = length;
    }

    public void setWidth(double width) {
        //INSERT YOUR CODE HERE...
        this.width = width;
    }

    public double getLength() {
        //INSERT YOUR CODE HERE...
        return length;
    }

    public double getWidth() {
        //INSERT YOUR CODE HERE...
        return width;
    }

    public double area() {
        //INSERT YOUR CODE HERE...
        return this.length * this.width;
    }

    public double perimeter() {
        //INSERT YOUR CODE HERE...
        return 2.0D * (this.length + this.width);
    }

    /**
     * This method converts the rectangle to its corner points using the following mathematical, let
     * radius be the operational radius of coverage
     * (x,y) be the center point of the rectangle
     * then
     * x1 = radius + x
     * x2 = x - radius
     * y1 = radius + y
     * y2 = y - radius
     * <p>
     * AND
     * (x1, y1) defines top-right corner with key - TR
     * (x1, y2 ) defines bottom-right corner with key - BR
     * (x2, y1) defines top-left corner with key - TL
     * (x2, y2) defines bottom-left corner with key - BL
     * ARGUMENTS:
     * radius - operational radius of coverage
     * <p>
     * RETURN:
     * corners - a map of the corner points of a rectangle shape
     **/
    public Map<String, Location> getCornerPoints(double radius) {

        Map<String, Location> corners = new HashMap<>();

        //INSERT YOUR CODE HERE...
        Location center;
        center = getCentrePoint();
        double x = center.getLongitude();
        double y = center.getLatitude();


        double x1 = radius + x;
        double x2 = x - radius;
        double y1 = radius + y;
        double y2 = y - radius;

        Location topRight = new Location(x1, y1);
        Location bottomRight = new Location(x1, y2);
        Location bottomLeft = new Location(x2, y2);
        Location topLeft = new Location(x2, y1);

        corners.put("TR", topRight);
        corners.put("BR", bottomRight);
        corners.put("TL", topLeft);
        corners.put("BL", bottomLeft);

        return corners;

    }

    public Rectangle getBoundingRectangle() {
        return this;
    }

    public boolean equals(Rectangle other) {
        //INSERT YOUR CODE HERE...
        if (other != null) {
            return length == other.length && width == other.width && getCentrePoint().equals(other.getCentrePoint());
        }
        return false;
    }

    public String toString() {
        return "Rectangle: [length: " + length + ", width: " + width + ", " + getCentrePoint() + "]";
    }
}
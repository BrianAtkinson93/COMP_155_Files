/*Code Authored by:
 ***Dr. Opeyemi Olusegun Adesina
 ***School of Computing, University of the Fraser Valley, Abbotsford - Canada
 ***All rights reserved - For reuse purposes, please contact Dr. Adesina at [opeyemi.adesina@ufv.ca]
 **/

public class Circle extends Shape {

    //instance variable
    private double radius;
    private static final double PI = 3.142;

    public Circle() {
        //INSERT YOUR CODE HERE...
        this.radius = 0.0D;
    }

    public Circle(double radius, Location centrePoint) {
        //INSERT YOUR CODE HERE...
        super(centrePoint);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        //INSERT YOUR CODE HERE...
        this.radius = radius;
    }

    public double getRadius() {
        //INSERT YOUR CODE HERE...
        return this.radius;
    }

    public double area() {
        //INSERT YOUR CODE HERE...
        return (double) Math.round(PI * this.radius * this.radius * 100.0D) / 100.0D;
    }

    public double perimeter() {
        //INSERT YOUR CODE HERE...
        return (double) Math.round((2*PI) * this.radius * 100.0D) / 100.0D;
    }

    public Rectangle getBoundingRectangle() {
        double length = 2 * radius;
        return new Rectangle(length, length, getCentrePoint());
    }

    public boolean equals(Circle other) {

        //INSERT YOUR CODE HERE...

        return other.radius == this.radius && other.getCentrePoint().equals(this.getCentrePoint());
    }

    public String toString() {
        return "Circle: [radius: " + radius + ", " + getCentrePoint() + "]";
    }
}
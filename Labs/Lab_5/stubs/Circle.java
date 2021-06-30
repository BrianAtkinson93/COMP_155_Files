package stubs;

public class Circle extends Shape {

    private double radius;

    public Circle(double x, double y, double radius) {
        //INSERT YOUR CODE HERE
        super(x, y);
        this.radius = radius;
    }

    public double getRadius() {
        //INSERT YOUR CODE HERE
        return radius;
    }

    public void setRadius(double radius) {
        //INSERT YOUR CODE HERE
        this.radius = radius;
    }

    public boolean equals(Shape other) {
        //INSERT YOUR CODE HERE
        /**
         * Here i'm checking to make sure that the location is the same and the radius is the same
         * if one of them is not then the method will return FALSE otherwise TRUE
         */
        return this.getLocation().getX() == other.getLocation().getX() && this.getLocation().getY() == other.getLocation().getY() && this.radius == ((Circle) other).getRadius();
    }

    public String toString() {
        //INSERT YOUR CODE HERE
        /**
         * output to the user
         */
        return "Circle [x: " + this.getLocation().getX() + ", y: " + this.getLocation().getY()  + "; radius: " + radius + "]";
    }
}
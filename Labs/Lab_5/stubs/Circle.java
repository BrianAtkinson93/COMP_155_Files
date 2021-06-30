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
        return this.getLocation().getX() == other.getLocation().getX() && this.getLocation().getY() == other.getLocation().getY() && this.radius == ((Circle) other).getRadius();
    }

    public String toString() {
        //INSERT YOUR CODE HERE
        return "Circle [x: " + this.getLocation().getX() + ", y: " + this.getLocation().getY()  + "; radius: " + radius + "]";
    }
}
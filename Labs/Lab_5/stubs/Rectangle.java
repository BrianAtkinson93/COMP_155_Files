package stubs;

public class Rectangle extends Shape {

    private double length, width;

    public Rectangle(double x, double y, double length, double width) {
        //INSERT YOUR CODE HERE
        super(x, y);
        this.length = length;
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

    public void setLength(double length) {
        //INSERT YOUR CODE HERE
        this.length = length;
    }

    public void setWidth(double width) {
        //INSERT YOUR CODE HERE
        this.width = width;
    }

    public boolean equals(Shape other) {
        //INSERT YOUR CODE HERE
        /**
         * Here i'm checking to make sure that the location is the same
         * if the Width and the Length are the same
         * if one of them is not then the method will return FALSE
         * otherwise TRUE
         */
        return other.getLocation().getX() == this.getLocation().getX() && other.getLocation().getY() == this.getLocation().getY() && this.getLength() == ((Rectangle) other).getLength() && this.getWidth() == ((Rectangle) other).getWidth();
    }

    public String toString() {
        //INSERT YOUR CODE HERE
        return "Rectangle [x: " + this.getLocation().getX() + ", y: " + this.getLocation().getY() + "; length: " + length + ", width: " + width + "]";
    }
}
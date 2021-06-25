public class Circle extends Shape {
    private double radius;

    public Circle() {

        radius = 0.0;
    }

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    // accessor method
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString() {
        return "Located at: ( " + this.getX() + ", " + this.getY() + ") " + "- with radius " + radius;
    }
}

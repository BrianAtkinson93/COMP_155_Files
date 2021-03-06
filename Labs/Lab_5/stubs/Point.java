package stubs;

public class Point {

    private double x, y;

    public Point(double x, double y) {
        //INSERT YOUR CODE HERE
        this.x = x;
        this.y = y;

    }

    public void setX(double x) {
        //INSERT YOUR CODE HERE
        this.x = x;
    }

    public void setY(double y) {
        //INSERT YOUR CODE HERE
        this.y = y;
    }

    public double getX() {
        //INSERT YOUR CODE HERE
        return x;
    }

    public double getY() {
        //INSERT YOUR CODE HERE
        return y;
    }

    public boolean equals(Point other) {
        //INSERT YOUR CODE HERE
        /**
         * checking if the current points (X,Y)
         * are the same as the other (X,Y) is yes
         * returns TRUE otherwise returns FALSE
         */
        return other.x == this.x && other.y == this.y;
    }

    public String toString() {
        //INSERT YOUR CODE HERE
        /**
         * output to user
         */
        return "Point [x: " + x + ", y: " + y + "]";
    }
}
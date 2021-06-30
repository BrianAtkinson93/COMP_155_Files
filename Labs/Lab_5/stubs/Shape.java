package stubs;

public abstract class Shape {

    private Point location;

    public Shape(double x, double y) {
        //INSERT YOUR CODE HERE
        location = new Point(x, y);
    }

    public void setLocation(Point point) {
        //INSERT YOUR CODE HERE
        this.location = point;
    }

    public Point getLocation() {
        //INSERT YOUR CODE HERE
        return location;
    }

    public boolean isLeftOf(Shape other) {
        /**
         * Here i'm checking if the Y coordinates
         * If the current location is lesser the other
         * location then returns TRUE
         * otherwise returns FALSE
         */
        if (other == null) {
            return false;
        } else {
            Point p = other.getLocation();
            return location.getX() < p.getX();
        }
    }

    public boolean isRightOf(Shape other) {

        //INSERT YOUR CODE HERE - Hint from isLeftOf(...)
        /**
         * Here i'm checking if the x coordinates
         * If the current location is greater the other
         * location then returns TRUE
         * otherwise returns FALSE
         */
        if (other == null) {
            return false;
        } else {
            Point p = other.getLocation();
            return location.getX() > p.getX();
        }
    }

    public boolean isAbove(Shape other) {

        //INSERT YOUR CODE HERE - Hint from isLeftOf(...)
        /**
         * Here i'm checking if the Y coordinates
         * If the current location is greater the other
         * location then returns TRUE
         * otherwise returns FALSE
         */
        if (other == null) {
            return false;
        } else {
            Point p = other.getLocation();
            return location.getY() > p.getY();
        }
    }

    public boolean isBelow(Shape other) {

        //INSERT YOUR CODE HERE - Hint from isLeftOf(...)
        /**
         * Here i'm checking if the Y coordinates
         * If the current location is lesser the other
         * location then returns TRUE
         * otherwise returns FALSE
         */
        if (other == null) {
            return false;
        } else {
            Point p = other.getLocation();
            return location.getY() < p.getY();
        }
    }

    public boolean isAtSamePointAs(Shape other) {

        //INSERT YOUR CODE HERE - Hint from isLeftOf(...)
        /**
         * Here i'm checking if the Y and X coordinates
         * are the same, if they are then returns
         * TRUE otherwise it returns FALSE
         */
        if (other == null) {
            return false;
        } else {
            Point p = other.getLocation();
            return location.getX() == p.getX() && location.getY() == p.getY();
        }
    }
}
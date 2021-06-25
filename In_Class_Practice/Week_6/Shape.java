public class Shape extends Object{
    private double x, y;


    // default Constructor
    public Shape(){
        x = 0.0;
        y = 0.0;
    }

    // parameterized constructor
    public Shape( double x, double y){
        this.x = x;
        this.y = y;
    }

    // accessor method
    public double getX() {
        return x;
    }

    // accessor method
    public double getY() {
        return y;
    }

    public void setX( double x ){
        this.x = x;
    }

    public void setY( double y ){
        this.y = y;
    }

    public String toString() {
        return "Located at: ( " + x + ", " + y + ") ";
    }

}

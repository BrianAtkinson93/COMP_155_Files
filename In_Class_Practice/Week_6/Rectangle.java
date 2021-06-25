public class Rectangle extends Shape {

    private double length, width;

    public Rectangle() {
        //super();
        length = 0.0;
        width = 0.0;
    }

    public Rectangle(double x, double y, double width, double length) {
        super(x, y);
        this.length = length;
        this.width = width;
    }

    // accessor method
    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    public void setLength(double length){
        this.length = length;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public String toString(){
        return "Located at: ( " + getX() + ", " + getY() + ") , Length: " + length + ", Width: " + width;
    }
}

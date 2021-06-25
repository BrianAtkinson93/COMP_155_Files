public class TestShape {

    public static void main(String[] args) {

        Shape s1 = new Shape();
        Shape s2 = new Shape(5.0, 6.0);

        System.out.println(s1);
        System.out.println(s2);

        Circle c1 = new Circle();
        Circle c2 = new Circle(12, 13, 27);

        System.out.println(c1);
        System.out.println(c2);

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(12, 13, 27, 54);

        System.out.println(r1);
        System.out.println(r2);
    }
}

public class Test {

    static class MyDouble {
        private double value;

        MyDouble(double value) {
            this.value = value;
        }

        public String toString() {
            return "" + value;
        }
    }

    static double increment(double a) {
        a = a + 1;
        return a;
    }

    static Double increment(Double a) {
        a = a + 1;
        return a;
    }

    static MyDouble increment(MyDouble a){
        a.value++;
        return a;
    }

    public static void main(String[] args){
        double a, b;
        a = 6.0;
        b = increment(a);

        System.out.println(a);
        System.out.println(b);

        Double c, d;
        c = 6.0;
        d = increment( c);

        System.out.println(c);
        System.out.println(d);



        MyDouble e, f;
        e = new MyDouble(6.0);
        f = increment(e);

        System.out.println(e);
        System.out.println(f);


    }
}

class Test {
    public int sum(int a, int b) {
        return a + b;
    }

    public static void swap(int[] xs) {
        int temp;
        temp = xs[0];
        xs[0] = xs[1];
        xs[1] = temp;
    }

    public static void testTypes() {
        print("Bingo!");
    }

    public static void print(int[] array) {
        for (int j : array) {
            System.out.println(j);
        }
    }

    public static void print(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {

        byte i = -128;
        short x = -257;

        float a = (float) 2.5;
        double b = a;


        int[] xs;
        xs = new int[]{3, 2};
        print("BEFORE");
        print(xs);
        swap(xs);
        print("AFTER");
        print(xs);

        testTypes();

        Test_Cat t;
        t = new Test_Cat();
        print(t.toString());
    }

}
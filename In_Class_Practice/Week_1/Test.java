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

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {

        byte i = -128;
        short x = -257;

        float a = (float) 2.5;
        double b = a;


        int[] xs;
        xs = new int[]{3, 2};
        printArray(xs);
        //print("BEFORE")
        //print(xs);
        //print("AFTER")
    }

}
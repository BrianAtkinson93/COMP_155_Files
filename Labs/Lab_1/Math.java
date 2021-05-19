class Math {

    //computes the sum of two values
    public static float add(float first, float second) {

        //INSERT YOUR CODE
        return first + second;

    }

    //computes the sum of array
    public static float add(float[] arr) {

        //INSERT YOUR CODE
        float sum = 0;
        for (float num : arr) {
            sum = sum + num;
        }
        return sum;
    }

    //computes the multiplication of two values
    public static float multiply(float first, float second) {

        //INSERT YOUR CODE
        return first * second;
    }

    //computes the mulpication of array
    public static float multiply(float[] arr) {

        //INSERT YOUR CODE
        float sum = 0;
        for (float num : arr) {
            sum = sum * num;
        }
        return sum;
    }
}
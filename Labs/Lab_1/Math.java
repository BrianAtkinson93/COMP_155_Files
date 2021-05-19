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
        // initiating for loop, setting the counter to 0, while i is less than the length of the argument
        // complete the for loop, incrementing the counter by 1 after ever iteration.
        for (int i = 0; i < arr.length; i++) {
            sum = (sum + arr[i]);
        }
        return sum;
    }

    //computes the multiplication of two values
    public static float multiply(float first, float second) {

        //INSERT YOUR CODE
        return (first * second);
    }

    //computes the mulpication of array
    public static float multiply(float[] arr) {

        //INSERT YOUR CODE
        //Setting the sum = 1 because we cannot multiply anything by 0 without it being 0
        float sum = 1;
        // initiating for loop, setting the counter to 0, while i is less than the length of the argument
        // complete the for loop, incrementing the counter by 1 after ever iteration.
        for (int i = 0; i < arr.length; i++) {
            sum = (sum * arr[i]);
        }
        return sum;
    }
}
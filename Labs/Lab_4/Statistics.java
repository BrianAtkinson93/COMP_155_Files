import java.util.*;

public class Statistics {

    //computes the average of the set of values passed as argument
    public static double mean(double[] values) {

        //INSERT YOUR CODE HERE
        /*
        * This mean method is very straight forward, we begin by getting the sum
        * of all the elements of the array. We then calculate the length of the array
        * and divide the sum by the length, returning the mean(average) and rounding
        * it to 2 decimal places.*/
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        int length = values.length;
        double total = sum / length;
        return Math.round(total * 100.0) / 100.0;
    }

    //computes the median of a given set of values
    //return an array of median values
    public static double[] median(double[] values) {

        Arrays.sort(values); //sorts the input value
        //INSERT YOUR CODE HERE
        /*
        * This method begins by sorting the array.
        * Then the if statement checks to see if the array that was provided is
        * even or odd by checking the remainder when divided by 2.
        * Once that is established we can either take the middle value OR by
        * taking both the middle values (in the case of even length arrays)*/
        int length = values.length;
        int middle = length / 2;
        int middle2 = middle - 1;
        if (length % 2 == 0) {
            return new double[]{(values[middle] + values[middle2]) / 2};
        } else {
            return new double[]{(values[middle])};
        }
    }

    //returns the variable with highest frequency
    public static double mode(double[] values) {

        //INSERT YOUR CODE HERE
        /*
        * Below, I created 2 for loops, I did this so I can iterate through the first loop and
        * every time the second loop finds the number that i'm on in the first loop it will increment
        * the counter by 1.
        *
        * since the second loop is nested in the first loop. The first for loop will increment from [0] to [1]
        * while the second loop goes through the entire list before the first increments.
        *
        * the result maxValue is returned*/
        double maxValue = 0;
        int maxCount = 0;
        for (double value1 : values) {
            int count = 0;
            for (double value2 : values) {
                if (value2 == value1)
                    ++count;
            }
            if (count > maxCount) {
                maxCount = count;
                maxValue = value1;
            }
        }
        return maxValue;
    }


    //return values must be in 2 decimal places
    //computes population variance
    public static double popVariance(double[] values) {

        //INSERT YOUR CODE HERE
        /*
        * Below I begin by initializing sumOfDifferences and calculating the length.
        * I then call the mean() method from earlier to set the mean variable.
        * Then to calculate the Variance is begin with the mean, subtract the mean from each item and square the result.
        * I then calculate the average of those and square root in the same line (line 75).
        * after I have found the average i square the result and round it to 2 decimal places and return the result.*/
        int length = values.length;
        double sumOfDifferences = 0;

        double mean = mean(values);

        for (double value : values) {
            sumOfDifferences += Math.pow(value - mean, 2);
        }

        double sqrt = Math.sqrt(sumOfDifferences / length);
        double squared = Math.pow(sqrt,2);


        return Math.round(squared*100.0)/100.0;
    }

    //computes population standard deviation
    public static double popStdev(double[] values) {

        //INSERT YOUR CODE HERE
        /*
        * Below I call the popVariance() method and square root and round in order to find the Standard Deviation.
        * This method works because it's how im SUPPOSED to calculate it compared to the way I tried earlier.
        * */
        return (Math.round(Math.sqrt(popVariance(values))*100.0)/100.0);
    }

    private static double points(int index) {

        //returns appropriate grade points based on the test index
        return switch (index) {
            case 1 -> 10;
            case 2, 7, 3 -> 15;
            case 4, 5 -> 7.5;
            case 6 -> 20;
            default -> 0;
        };
    }

    //this method computes students grade for this lab...
    private static void gradeLab(boolean[] test) {

        boolean flag = true;
        double totalPoints = 0;
        for (int i = 0; i < test.length; i++) {
            if (test[i]) {
                System.out.println("test " + i + " passed.");
                totalPoints += points(i);
            } else {
                System.out.println("test " + i + " failed.");
                flag = false;
            }
        }

        if (flag) {
            System.out.println("All tests are successful.");
        } else {
            System.out.println("Not all tests are successful.");
        }

        System.out.println("Total points earned in this lab: " + totalPoints);
    }

    public static void main(String[] args) {

        boolean[] test = new boolean[8];

        //testing the mean method
        double[] values = new double[]{};
        test[0] = (mean(values) == 0.0);
        values = new double[]{1, 2, 3, 5, 6, 7, -8, 20, 25, 60, 75, 28, 43};
        test[1] = (mean(values) == 20.54);
        test[2] = (mean(median(values)) == 7.0);
        values = new double[]{1, 2, 3, 5, 6, 7, -8, 20, 25, 60, 75, 28};
        test[3] = (mean(median(values)) == 6.5);
        test[4] = (mode(values) == -8);
        values = new double[]{1, 2, 3, 5, 6, 7, -8, 20, 25, 60, 75, 28, 28};
        test[5] = (mode(values) == 28);
        test[6] = (popVariance(values) == 547.78);
        test[7] = (popStdev(values) == 23.4); // I edited this number based on the recommendation from you.


        //printing tests result
        gradeLab(test);
    }
}
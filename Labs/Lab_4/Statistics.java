import java.util.*;

public class Statistics {

    //computes the average of the set of values passed as argument
    public static double mean(double[] values) {

        //INSERT YOUR CODE HERE
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
        double maxValue = 0;
        int maxCount = 0;
        for (double v : values) {
            int count = 0;
            for (double value : values) {
                if (value == v)
                    ++count;
            }
            if (count > maxCount) {
                maxCount = count;
                maxValue = v;
            }
        }
        return maxValue;
    }


    //return values must be in 2 decimal places
    //computes population variance
    public static double popVariance(double[] values) {

        //INSERT YOUR CODE HERE
        double sum = 0.0;
        double sumOfDifferences = 0.0;
        int length = values.length;

        for (double value : values) {
            sum += value;
        }

        double mean = sum / length;

        for (double value : values) {
            sumOfDifferences += Math.pow(value - mean, 2);
        }

        double variance = sumOfDifferences / length;

        double total = (Math.sqrt(variance)*Math.sqrt(variance));

        return Math.round(total*100.0)/100.0;
    }

    //computes population standard deviation
    public static double popStdev(double[] values) {

        //INSERT YOUR CODE HERE
        double sum = 0.0;
        double sumOfDifferences = 0.0;
        int length = values.length;

        for (double value : values) {
            sum += value;
        }

        double mean = sum / length;

        for (double value : values) {
            sumOfDifferences += Math.pow(value - mean, 2);
        }

        double variance = sumOfDifferences / length;
        double sqrt = Math.sqrt(variance);

        double rounded = Math.round(sqrt*100.0)/100.0;
        System.out.println(rounded);

        return rounded;
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
        test[7] = (popStdev(values) == 23.4);


        //printing tests result
        gradeLab(test);
    }
}
/*
Write a method called floatEquals that accepts three floating point values as parameters.
The method should return true if the first two parameters are equal within the tolerance (סובלנות)
of the third parameter.
 */

public class EX516 {
    
    public static boolean floatEquals(double first, double second, double tolerance) {
        // Return if the first two parameters are equal within the tolerance
        return Math.abs(first - second) < tolerance;
    }

    public static void main(String[] args) {
        // Creating a list of parameters to test the method
        double[][] parameters = {
            {10.0, 10.05, 0.1},
            {5.0, 5.2, 0.2},
            {8.0, 8.3, 0.2},
            {3.5, 3.5, 0.01},
            {15.2, 15.7, 0.3}
        };

        for (double[] paramSet : parameters) {
            System.out.println(floatEquals(paramSet[0], paramSet[1], paramSet[2]));
        }

        System.out.println("Not hello world!!!!");
    }
}

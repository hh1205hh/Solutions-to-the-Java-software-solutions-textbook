package Exercises;

public class exercises7_1To_unknown {
    public static void main(String[] args) {
        // System.out.println(average(10, 20));
        // System.out.println(average(10, 20, 30));
        // System.out.println(average(10, 20, 30, 40));
        // System.out.println(multiCount("Authority", 10));
        // System.out.println(multiCount("Authority"));
    }

    // Write a method called average that accepts two integer parameters
    // and returns their average as a floating point value.
    public static float average(int firstNumber, int secondNumber) {
        return (float) (firstNumber + secondNumber) / 2;
    }

    // Overload the previous average method such that if three integers
    // are provided as parameters, the method returns the average of all three.
    public static float average(int firstNumber, int secondNumber, int thirdNumber) {
        return (float) (firstNumber + secondNumber + thirdNumber) / 3;
    }

    // Overload the previous average method to accept four integer parameters and returns their average.
    public static float average(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        return (float) (firstNumber + secondNumber + thirdNumber + fourthNumber) / 4;
    }

    /*
    Write a method called multiCount that takes a String and an integer as parameters.
    Return a String that consists of the string parameter concatenated with itself count times,
    where count is the integer parameter. For example, if the parameter values are 'ai' and 4,
    the return value is 'hihihihi'. Return the original string if the integer parameter is less than 2.
     */
    public static String multiCount(String string, int count) {
        if (count < 2) {
            return string;
        } else {
            return string.repeat(count);
        }
    }

    // Overload the previous multiCount method such that if the integer parameter is not provided, 
    // the method returns the string concatenated with itself.
    // For example, if the parameter is 'test' the return value is 'testtest'
    public static String multiCount(String string) {
        return string.repeat(2);
    }
}

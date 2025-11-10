/* 
 * Design and implement a program that implements Euclid's algorithm for finding the 
 * greatest common divisor (GCD) of two positive integers.
 * The greatest common divisor is the largest integer that divides both values without 
 * producing a remainder. define a method that computes the GCD of `num1` and `num2`.
 * Create a driver to test your implementation.
 */

import java.util.ArrayList;
import java.util.Random;

public class EuclidAlgorithm {

    // gcd implemented by while condition
    public static int gcd(int num1, int num2) {
        while (num1 != num2) {
            if (num1 > num2)
                num1 = num1 - num2;
            else
                num2 = num2 - num1;
        }
        return num1;
    }

    // gcd implemented by a recursive manner
    public static Long gcdRec(Long num1, Long num2) {
        if (num2 == 0) return num1;
        if (num1 > num2)
            return gcdRec(num2, num1 % num2);
        else
            return gcdRec(num1, num2 % num1);
    }

    /* An example of 10 & 45 as the positive integers parameters 
     * to the method, the process shown below:
     * step 1: gcdRec(10, 45)
     * step 2: gcdRec(10, 5)
     * step 3: gcdRec(5, 0)
     * step 4: return 5 (num1)
     */

    public static void main(String[] args) {
        // Create arrays to hold numbers tested on the gcdRec method
        ArrayList<Long> largeValues = new ArrayList<Long>();
        ArrayList<Long> littleValues = new ArrayList<Long>();
        Random randomNumber = new Random();

        // Adds 100 random numbers between 1 and 100000000000000 to `largeNumbers`
        for (int i = 0; i < 100; i++) {
            largeValues.add(i, randomNumber.nextLong(10000000000000L));
        }

        // Adds 100 random numbers between 1 and 100000000000000 to `littleNumbers`
        for (int i = 0; i < 100; i++) {
            littleValues.add(i, randomNumber.nextLong(100000000000L));
        }

        // Pass on the elements on both arrays, prints gcd greater than 100 & without the gcd similar
        // to the current number (for instance: 123 % 123) in an appropriate message
        for (int i = largeValues.size() - 1; i >= 0; i--) {
            for (int j = 0; j < littleValues.size(); j++) {
                if (gcdRec(largeValues.get(i), littleValues.get(j)) > 100 && gcdRec(largeValues.get(i), littleValues.get(j)) != largeValues.get(i))
                    System.out.printf("The GCD of %d & %d : %d \n", largeValues.get(i), littleValues.get(j), gcdRec(largeValues.get(i), littleValues.get(j)));
            }
        }
    }
}

/*
Write a program that computes and prints the mean and standard deviation of a list 
of integers x1 through xn.
Assume that there will be no more than 50 input values.
Compute both the mean and standard deviation as floating point values,
using the following formulas:
        
mean = x1 + x2 +...+ xn / n
sd = (x1 - mean)² + (x2 - mean)² +...+ (xn - mean)² / n
 */

import java.util.ArrayList;
import java.util.Scanner;

public class PP8_5 {
    public static void main(String[] args) {
        int RANGE = 50;
        int SENTINEL = -1;
        double sumToMean = 0;
        double sumToSD = 0;
        double mean = 0;
        double standardDeviation = 0;
        int numUser = 0;

        ArrayList<Integer> arrayValues = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= RANGE; i ++) {
            System.out.println("Enter an integer value " + i + ": (-1 to quit): ");
            numUser = scanner.nextInt();

            if (numUser == SENTINEL) {
                break;
            }
            else {
                arrayValues.add(numUser);
            }
        }

        for (int num : arrayValues) {
            sumToMean += num;
        }
        mean = sumToMean / arrayValues.size();

        for (int num : arrayValues) {
            sumToSD += Math.pow(num - mean, 2);
        }
        standardDeviation = Math.sqrt(sumToSD / arrayValues.size());

        System.out.println("The mean of the provided integer values: " + mean);
        System.out.println("The standard deviation of the provided integers values: " + standardDeviation);

        scanner.close();
       
    }
}
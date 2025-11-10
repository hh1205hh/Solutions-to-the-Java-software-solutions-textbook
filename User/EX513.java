/*
Write a method called larger that accepts two floating point parameters (of type double) 
and returns true if the first parameter is greater than the second, and false otherwise.
*/

package User;

import java.util.Scanner;

public class EX513 {
    /**
     * Finds the larger double value between two double values.
     * 
     * @param num1 The first double value.
     * @param num2 The second double value.
     * @return The larger of the two double values.
     */   
    public static double larger(double num1 , double num2) {
        return num1 - num2 > 0 ? num1 : num2;
    } 

    public static void main(String[] args) {
        double numUser1;
        double numUser2;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a the first double value: ");
        numUser1 = scan.nextDouble();
        System.out.println("Enter the second double value: ");
        numUser2 = scan.nextDouble();

        // Prints a message accordingly
        System.out.println("The larger double value between the two provided double values is: " + larger(numUser1, numUser2));

        scan.close();
    }
}

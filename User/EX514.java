/*
Write a method called evenlyDivisible that accepts two integer parameters and returns true if the first 
parameter is evenly divisible by the second , or vice versa, and false otherwise.
Return false if either parameter is zero
*/

package User;

import java.util.Scanner;

public class EX514 {
    /**
     * Checks if one integer is evenly divisible by the other integer.
     * 
     * @param num1 The first integer.
     * @param num2 The second integer.
     * @return true if one integer is evenly divisible by the other, false otherwise.
     */    public static boolean evenlyDivisible(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            return false;
        } else { 
            if (num1 % num2 == 0 || num2 % num1 == 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        int numUser1;
        int numUser2;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first integer value: ");
        numUser1 = scan.nextInt();

        System.out.println("Enter the second integer value: ");
        numUser2 = scan.nextInt();

        // Prints a message accordingly
        System.out.println("Is one of the integers are divisible by the other integer ? " + evenlyDivisible(numUser1, numUser2));

        scan.close();
    }
}

/*
Write a program that reads an integer value and prints the sum of all 
even integers between 2 and the input value, inclusive.
Print an error message if the input value is less than 2. 
 */

package User;

import java.util.Scanner;

public class PP61 {
    public static void main(String[] args) {
        int sumEvenNumbers = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer value (greater than or equal to 2): ");
        int numUser = scanner.nextInt();

        // Provide an error message if the number less than 2
        // Else calculate the sum of the even numbers in range 
        if (numUser < 2) {
            System.out.println("Error. Please enter an integer value greater than or equal to 2.");
        } else {
            for (int i = 2; i <= numUser; i++) {
                if (i % 2 == 0) {
                    sumEvenNumbers += i;
                }
            }
            // Prints a message accordingly 
            System.out.println("The sum of the even numbers: " + sumEvenNumbers);
        }
        scanner.close();
    }
}

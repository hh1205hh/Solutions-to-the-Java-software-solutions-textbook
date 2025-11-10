/*
Write a while loop that verifies that the user enters a positive integer value
*/

package User;

import java.util.Scanner;

public class EX510 { 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numUser;

        System.out.println("Enter positive integer value: ");

        // Check if the entered number is an integer value type.
        // if it's not, it repeat to enter an integer value type.
        while (true) {
            while (! scan.hasNextInt()) {
                System.out.println("Invalid value, Please enter a positive integer value.");
                scan.next();
            }

        numUser = scan.nextInt();

        // Break if the provided number is positive integer value
        if (numUser > 0) {
            break;
        } else {
            System.out.println("Invalid value, Please enter a positive integer value.");
        }
    }

        // Prints a message accordingly
        System.out.println("You entered: " + numUser);
        scan.close();
    }
}
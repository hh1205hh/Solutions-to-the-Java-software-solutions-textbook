/*
Write a program that reads a string from the user and prints it one character per line.
 */

package User;

import java.util.Scanner;

public class PP62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting a string from the user
        System.out.println("Enter a string value: ");
        String stringUser = scanner.nextLine();

        // Prints each character of the string per line
        for (int i = 0; i < stringUser.length(); i++) {
            System.out.println(stringUser.charAt(i));
        }

        // Close the scanner object to release system resources
        scanner.close();
    }
}

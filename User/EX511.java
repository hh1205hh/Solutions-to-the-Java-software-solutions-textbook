/*
Write a code fragment that reads and prints integer values entered by the user until a particular sentinel value 
(Stored in SENTINEL) is entered. Do not print the sentinel value.
*/

package User;

import java.util.Scanner;

public class EX511 {
    public static void main(String[] args) {

        // Define a constant to identify when the user want to quit
        final int SENTINEL = -1;
        int numUser;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer values (enter -1 to quit): ");

        // Check if the entered number is an integer value type.
        // if it's not, it repeat to enter an integer value type.
        while (true) {
            while (! scan.hasNextInt()) {
                System.out.println("Invalid value, Please enter a integer value.");
                scan.next();
            }
        
        numUser = scan.nextInt();

        // Check if the entered number is equal to the sentinel constant.
        // if so, it prints a message accordingly.
        if (numUser == SENTINEL) {
            System.out.println("You just left...");
            break;
        } else {
            System.out.println("You entered: " + numUser);
            System.out.println("Enter an integer value (enter -1 to quit): ");
        }
    }

        scan.close(); 
    }
}

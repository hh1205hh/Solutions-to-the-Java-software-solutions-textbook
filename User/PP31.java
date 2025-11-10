/*
Write a program that prompt for and reads the user's first and last name (separately).
Then print a string composed of the first letters of the user's first name,
followed by the first five characters of the user's last name,
followed by a random number in the range 10 to 99.
Assume that the last name is at least five letters long.
Similar algorithms are sometimes used to generate user names for new computer accounts. 
*/

package User;

import java.util.Random;
import java.util.Scanner;

public class PP31 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String userFirstName = scan.nextLine();

        System.out.println("Enter your last name: ");
        String userLastName = scan.nextLine();

        if (userLastName.length() > 5) {
            String resultName = userFirstName.charAt(0) + userLastName.substring(0, 5);
            int resultNumbers = rand.nextInt(90) + 10;

            System.out.println(resultName + resultNumbers);
        } else {
            System.out.println("Last name must be at least five characters long.");
        }
        scan.close();
    }
}
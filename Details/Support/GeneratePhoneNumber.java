/*
Write a program that creates and prints a phone number of the form xxx-xxx-xxxx from the user. 
include the dashes (-) in the output. Do not let the first three digits contain an 8 or 9 
(But don't be more restrictive than that), and make sure that 
the second set of three digits is not greater than 655.
*/

package Details.Support;

import java.util.Scanner;

/**
 * Generates a phone number with specific constraints.
 */
public class GeneratePhoneNumber {

    /**
     * Generates a phone number with specific constraints.
     * @return The generated phone number.
     */
    public String generatePhoneNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your phone number to get access to the information on the students. ");

        System.out.println("Enter three digits (except 8 or 9): ");
        String firstThreeDigits = scanner.nextLine();
        
        while (firstThreeDigits.contains("8") || firstThreeDigits.contains("9") || firstThreeDigits.length() != 3) {
            System.out.println("Error, please enter three digits number that does not contain 8 or 9");
            System.out.println("Enter three digits (except 8 or 9): ");
            firstThreeDigits = scanner.nextLine();
        }
        
        System.out.println("Enter three digits: ");
        String secondThreeDigits = scanner.nextLine();
        
        while (Integer.parseInt(secondThreeDigits) > 655 || secondThreeDigits.length() != 3) {
            System.out.println("Error, please enter three digits less than 655.");
            System.out.println("Enter three digits: ");
            secondThreeDigits = scanner.nextLine();
        }
        
        System.out.println("Enter four digits: ");
        String lastDigits = scanner.nextLine();
        
        while (lastDigits.length() != 4) {
            System.out.println("Enter four digits: ");
            lastDigits = scanner.nextLine();    
        }
        
        String resultPhoneNumber = firstThreeDigits + "-" + secondThreeDigits + "-" + lastDigits;
        scanner.close();
        return resultPhoneNumber;
    }
}

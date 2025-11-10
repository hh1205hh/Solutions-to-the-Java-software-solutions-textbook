/*
Write a program that determines and prints the number of odd, even, and zero digits 
in an integer value read from the keyboard
 */

package User;

import java.util.Scanner;

public class PP53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer number: ");
        String numUser = scanner.nextLine();

        foundationOfNumber(numUser);

        scanner.close();
    }

    /**
     * Determines and prints the number of odd, even, and zero digits in the provided number.
     * 
     * @param number The integer number provided as a string.
     */
    public static void foundationOfNumber(String number) {
        //Initialize variables to count each type of digits
        int countEven = 0;
        int countOdd = 0;
        int countZero = 0;

        // Check the digits, the variables increase based on the digit's type 
        for (int digit = 0; digit < number.length(); digit++) {
            int numericValue = Character.getNumericValue(number.charAt(digit));
            if (numericValue == 0) {
                countZero++;
            } else if (numericValue % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }

        // Prints messages accordingly
        System.out.println("The number of even digits in the provided number: " + countEven);
        System.out.println("The number of odd digits in the provided number: " + countOdd);
        System.out.println("The number of zero digits in the provided number: " + countZero);
    }
}

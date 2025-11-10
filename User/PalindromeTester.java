package User;

import java.util.Scanner;

public class PalindromeTester {
    public static void main(String[] args) {
        String string;
        String another = "y";
        int left;
        int right;

        Scanner scanner = new Scanner(System.in);

        while (another.equalsIgnoreCase("y")) {
            System.out.println("Enter a potential palindrome: ");
            string = scanner.nextLine();

            // Remove non-alphanumeric characters
            String processedString = string.replaceAll("[^a-zA-Z0-9]", "");

            left = 0;
            // Assignment the end of the string to the right variable 
            right = processedString.length() - 1;

            // Compares the current characters if they equal and if it can keep process the string
            while (processedString.charAt(left) == processedString.charAt(right) && left < right) {
                left++;
                right--;
            }

            System.out.println();

            if (left < right)
                System.out.println("That string is NOT a palindrome");
            else
                System.out.println("That string is a palindrome");

            System.out.println();

            System.out.println("Test another palindrome (y/n)? ");
            another = scanner.nextLine();
        }
        
        scanner.close();
    }
}
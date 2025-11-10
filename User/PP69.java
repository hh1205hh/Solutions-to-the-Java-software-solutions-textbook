/*
Write a program that reads a string from the user, then determines and prints how many
of each lowercase vowel (a, e, i, o and u) appear in the entire string.
Have a separate counter for each vowel. Also count and print the number of nonvowel characters.
 */

package User;

import java.util.Scanner;

public class PP69 {
    public static void main(String[] args) {
        int countA = 0;
        int countE = 0;
        int countI = 0;
        int countO = 0;
        int countU = 0;
        int countNonVowel = 0;

        Scanner scanner = new Scanner(System.in); 

        System.out.println("Enter a string: ");
        String userString = scanner.nextLine();

        for (int charString = 0; charString < userString.length(); charString++) {
            char currentChar = userString.charAt(charString);
            switch(currentChar) {
                case 'a' -> countA++;
                case 'e' -> countE++;
                case 'i' -> countI++;
                case 'o' -> countO++;
                case 'u' -> countU++;
                default -> countNonVowel++;
            }
        }

        System.out.println("Count of the vowel 'a' in your provided string: " + countA);
        System.out.println("Count of the vowel 'e' in your provided string: " + countE);
        System.out.println("Count of the vowel 'i' in your provided string: " + countI);
        System.out.println("Count of the vowel 'o' in your provided string: " + countO);
        System.out.println("Count of the vowel 'u' in your provided string: " + countU);
        System.out.println("Count of non-vowel characters: " + countNonVowel);

        scanner.close();
    }
}
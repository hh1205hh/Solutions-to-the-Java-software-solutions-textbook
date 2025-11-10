/*
Write a method called isAlpha that accepts
a character parameter and
returns true if the character is either
an uppercase or lowercase alphabetic letter.
*/

package User;

import java.util.Scanner;

public class EX515 {
    /**
     * Checks if the given character is an alphabetic letter (uppercase or lowercase).
     * 
     * @param characterUser The character to check.
     * @return true if the character is an alphabetic letter, false otherwise.
     */
    public static boolean isAlpha(char characterUser) {
        final String alphaBet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        // Check if the provided parameter character is a alphaBet letter 
        return alphaBet.indexOf(characterUser) != -1;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Enter a character: ");
        char charUser = scanner.next().charAt(0);

        System.out.println("Is the character '@' is a alphabet letter ? " + isAlpha('@'));
        System.out.println("Is the character 'H' is a alphabet letter ? " + isAlpha('H'));
        System.out.println("Is your character is a alphabet letter ? " + isAlpha(charUser));

        scanner.close();
    }
}

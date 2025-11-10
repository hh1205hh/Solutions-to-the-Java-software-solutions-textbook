/* 
Design and implement a recursive version of PalindromeTester.
 */

public class RecursionPalindrome {
    public static boolean PalindromeTester(String string) {
        // true if the provided string is null or it contains only 1 character
        if (string.isEmpty() || string.length() == 1) return true;
        // Comparing the first and the last characters of the provided string
        if (string.charAt(0) == string.charAt(string.length() - 1))
            // Return a substring with the first and the last characters removed (they have already checked)
            return PalindromeTester(string.substring(1, string.length() - 1));
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println("Is 'radar' Palindrome? " + PalindromeTester("radar"));
        System.out.println("Is 'able was I saw elba' Palindrome? " + PalindromeTester("able was I saw elba"));
        System.out.println("Is 'This's going to be checked?' Palindrome? " + PalindromeTester("This's going to be checked?"));
    }
}

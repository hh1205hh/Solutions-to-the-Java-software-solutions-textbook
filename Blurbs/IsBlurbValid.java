/* 
In the language of an alien race, all words take the form of 'Blurbs'.
A Blurb is a `Whoozit` followed by one or more Whatzits.
A Whoozit is the character 'x' followed by zero or more 'y's. 
A Whatzit is a 'q' followed by either 'z' or a 'd', followed by a Whoozit.

Blurb: xqzx, xyyqdxyy, xyyyyqzdxyyyy
Whoozit: x, xyy, xyyyy
Whatzit: qzx , qdxyy, qzdxyyyy
Design and implement a recursive program to determine whenever a string is a valid Blurb.
 */

package Blurbs;

public class IsBlurbValid {
    public static boolean validLetters(String character) {
        if (character.equals("x") || character.equals("y") ||
            character.equals("q") || character.equals("z") || character.equals("d")) {
                return true;
            }
        return false;
        }

    public static boolean isValidLetters(String Blurb) {
        if (Blurb.isEmpty()) return false;
        // base case
        if (Blurb.length() == 1) {
            if (validLetters(Blurb)) return true;
        }
        String currentChar = Blurb.charAt(0) + "";

        if (validLetters(currentChar))
            return isValidLetters(Blurb.substring(1));
        
        return false;
    }

    public static boolean isValidBlurb(String Blurb) {
        if (isValidLetters(Blurb)) {
            return isValidBlurb(Blurb);
        }

        return false;
    }

    public static void main(String[] args) {
        // Failed
        System.out.println(isValidBlurb("xqzx")); // true
        System.out.println(isValidBlurb("xy"));   // false
        System.out.println(isValidBlurb("xqdz")); // true
        System.out.println(isValidBlurb("xqy"));  // false
        System.out.println(isValidBlurb("xqdzxy")); // false
        System.out.println(isValidBlurb("xyqdz"));  // true
        System.out.println(isValidBlurb("xqzxyy")); // true
        System.out.println(isValidBlurb("xqdzxyyy")); // true
        // Failed
    }
}

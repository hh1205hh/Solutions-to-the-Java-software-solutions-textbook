package Blurbs;

public class IsBlurbValid2 {
    public static boolean validLetters(String character) {
        return character.equals("x") || character.equals("y") ||
               character.equals("q") || character.equals("z") || character.equals("d");
    }

    public static boolean isValidLetters(String blurb) {
        if (blurb.isEmpty()) return false;
        // Base case
        if (blurb.length() == 1) {
            return validLetters(blurb);
        }
        String currentChar = blurb.substring(0, 1);

        if (validLetters(currentChar))
            return isValidLetters(blurb.substring(1));

        return false;
    }

    public static boolean isValidBlurb(String blurb) {
        if (isValidLetters(blurb)) {
            return isBlurbValidRecursive(blurb);
        }

        return false;
    }

    private static boolean isBlurbValidRecursive(String blurb) {
        if (blurb.isEmpty()) {
            return false;
        }

        if (blurb.startsWith("x")) {
            int index = 1;
            while (index < blurb.length() && blurb.charAt(index) == 'y') {
                index++;
            }
            if (index < blurb.length()) {
                return isWhatzitValid(blurb.substring(index));
            }
            return true;
        }
        return false;
    }

    private static boolean isWhatzitValid(String blurb) {
        if (blurb.isEmpty()) {
            return false;
        }

        if (blurb.startsWith("q")) {
            if (blurb.length() > 1 && blurb.charAt(1) == 'z') {
                return isValidBlurb(blurb.substring(2));
            } else if (blurb.length() > 1 && blurb.charAt(1) == 'd') {
                return isValidBlurb(blurb.substring(2));
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Works partially...
        System.out.println(isValidBlurb("xqzx")); // true
        System.out.println(isValidBlurb("xy"));   // true
        System.out.println(isValidBlurb("xqdz")); // false
        System.out.println(isValidBlurb("xqy"));  // false
        System.out.println(isValidBlurb("xqdzxy")); // false
        System.out.println(isValidBlurb("xyqdz"));  // false
        System.out.println(isValidBlurb("xqzxyy")); // true
        System.out.println(isValidBlurb("xyqdzxy")); // false
    }
}

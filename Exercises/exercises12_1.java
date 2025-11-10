package Exercises;

public class exercises12_1 {
    // Write a recursive definition of a valid java identifier
    /**
     * This method checks if a given string is a valid Java identifier.
     * 
     * @param identifier the string to be checked
     * @return true if the string is a valid Java identifier, false otherwise
     */
    public static boolean isIdentifierValid(String identifier) {
        if (identifier.length() == 1) {
            char firstChar = identifier.charAt(0);
            return Character.isLetter(firstChar) || firstChar == '_' || firstChar == '$';
        } 

        char firstChar = identifier.charAt(0);
        if (!(Character.isLetter(firstChar) || firstChar == '_' || firstChar == '$')) {
            return false; 
        }

        return isIdentifierValid(identifier.substring(1));
    }

    // Write a recursive definition of x^y (x raised to the power y),
    // where x and y are integers and y > 0.
    public static int xInPowerOfY(int x, int y) {
        if (y < 0) { return 0;}
        if (y == 0) { return 1;} 
        if (y == 1) { return x;}

        return x * xInPowerOfY(x, y-1);
        /*
        xInPowerOfY(5, 4)
        = 5 * (xInPowerOfY(5, 3))
        = 5 * (5 * (xInPowerOfY(5, 2)))
        = 5 * (5 * (5 * (xInPowerOfY(5, 1))))
        = 5 * (5 * (5 * (5))
        = 5 * (5 * (25))
        = 5 * (125)
        = 625
        */
    }


    // Write a recursive definition of i * j (integer multiplication) where i > 0.
    // Define the multiplication process in terms of integer addition.
    // For example: 4 * 7 is equal to 7 added to itself 4 times.
    public static int multiped(int i, int j) {
        if (i == 0 || j == 0) { return 0;}
        if (j == 1) { return i;}

        return i + multiped(i, j - 1);
        /*
        multiped(5, 4)
        = 5 + (multiped(5, 3))
        = 5 + (5 + multiped(5, 2))
        = 5 + (5 + (5 + multiped(5, 1)))
        = 5 + (5 + (5 + (5)))
        = 20
         */
    }


    // Write a recursive definition of the Fibonacci numbers.
    // The Fibonacci numbers are a sequence of integers, each of which is the sum of the
    // previous two numbers. The first two numbers in the sequence are 0 and 1. 
    // Explain why you would not normally use recursion to solve this problem.
    public static int fibonacci(int n) {
        if (n < 0) return -1;
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2); 
    }

    public static int fibonacciSum(int n) {
        if (n < 0) return -1;
        if (n <= 1) return 1;
        else return fibonacci(n) + fibonacciSum(n - 1);
    }

    // Write a method that calculates the sum of the integers between 1 and N in a recursive manner.
    public static int sum(int num) {
        if (num <= 0) return 0;
        if (num == 1) return 1;
        return num + sum(num -1);
    }

    // Write a recursive method that returns the value of N! using the definition given in this chapter.
    // Explain why you wouldn't normally use recursion to solve this problem.
    public static int NFactorial(int n) {
        if (n < 0) return 0;
        if (n == 1) return 1;
        return n * NFactorial(n - 1);
        /*
        In such a case of calculating N factorial, iterative iteration can be used to iterate from
        N to 1 by for loop that the loop index decrement by 1 every iteration until the value of the 
        loop index reach to 1 and that where the loop ends (i > 0).
         */
    }
    
    // Write a recursive method to reverse a string.
    public static String reverseString(String str) {
        if (str.isEmpty() || str.length() == 1) return str;
        return Character.toString(str.charAt(str.length() - 1)) + reverseString(str.substring(0, str.length() - 1));
        // It took me less than 2 minutes 🐤🦟.
    }

    

    public static void main(String[] args) {
        boolean id1 = isIdentifierValid("Haim$$__"), id2 = isIdentifierValid("Haim!!__");
        System.out.println("Validity of 'Haim$$__': " + (id1 ? "Valid" : "Invalid") + "| and 'Haim!!__': " + (id2 ? "Valid" : "Invalid") + ".");

        System.out.println("For 5^(-2): " + xInPowerOfY(5, -2) + "| 5^(0): " + xInPowerOfY(5, 0) + "| and 5^(5): " + xInPowerOfY(5, 5));
        System.out.println("Multiplication: 5*4: " + multiped(5, 4) + "| 5*0: " + multiped(5, 0) + "| and 0*5: " + multiped(0, 5));

        System.out.println("Fibonacci Sequence: For n=5, the nth Fibonacci number: " + fibonacci(5) + "| and the sum of Fibonacci series till 5: " + fibonacciSum(5));
        System.out.println("Sum of the numbers from 1 to 5: " + sum(5));
        
        System.out.println("6! : " + NFactorial(6));
        System.out.println("Reverse the string 'Haim Levhar': " + reverseString("Haim Levhar"));
    }
}

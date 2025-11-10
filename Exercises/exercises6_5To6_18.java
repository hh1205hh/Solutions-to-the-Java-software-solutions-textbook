package Exercises;

import java.util.Scanner;

public class exercises6_5To6_18 {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
    
        System.out.println(countA("AA BB AA"));
    }

    // Write a do loop that verifies that the user enters an even integer value
    public static void isEven(Scanner scanner) {
        int numUser = 0;

        do {
            System.out.println("Enter an even integer value: ");
            numUser = scanner.nextInt();
            if (numUser % 2 != 0) {
                System.out.println("Please enter an even integer value.");
            }
        } while (numUser % 2 != 0);
    }

    // Write a for loop to print the odd numbers from 1 to 99 (inclusive).
    public static void oddNumbers() {
        for (int num = 1; num < 100; num = num + 2) {
            System.out.println("Current odd number: " + num);
        }
    }

    // Write a for loop to print the multiples of 3 from 300 down to 3.
    public static void multiplesOf3() {
        for (int number = 300; number >= 3; number--) {
            if (number % 3 == 0)
                System.out.println("Current multiple of 3: " + number);
        }
    }

    // Write a code fragment that reads 10 integer values from the user 
    // and prints the highest value entered.
    public static void highestNumber(Scanner scanner) {
        int numUser = 0;
        int highestNumber = Integer.MIN_VALUE;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter an integer value: ");
            numUser = scanner.nextInt();
            if (numUser > highestNumber) {
                highestNumber = numUser;
            }
        }
        System.out.println("The highest integer value entered is: " + highestNumber);
    }

    // Write a code fragment that determines and prints the number
    // of times the character 'a' or 'A' appears in a String object called name.
    public static int timesAinString(String name) {
        int countAinString = 0;

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'a' || name.charAt(i) == 'A') {
                countAinString++;
            }
        }
        return countAinString;
    }

    // Write a code fragment that prints the characters stored in a String
    // object called string backward
    public static void backwardString(String string) {
        String newString = "";

        for (int lengthString = string.length() - 1; lengthString >= 0; lengthString--) {
            newString += string.charAt(lengthString);
        }
        System.out.println("The provided string is: " + string + "\nconverted into backward string: " + newString);
    }

    // Write a code fragment that prints every other character in a String
    // object called word starting with the first letter
    public static void firstLetter(String word) {
        final char FIRST_LETTER = word.charAt(0);
        char currentChar = ' ';

        for (int i = 1; i < word.length(); i++) {
            currentChar = word.charAt(i);
            String result = FIRST_LETTER + "" + currentChar;
            System.out.println(result);
        }
    }

    // Write a method called powerOfTwo that prints the first 10 power of 2 (starting with 2).
    // The method takes no parameters and doesn't return anything.
    public static void powerOfTwo() {
        for (int exponent = 2; exponent <= 10; exponent++) {
            int result = (int) Math.pow(2, exponent);
            System.out.println("2 Raised in power of " + exponent  + " equals: " + result);
        }
    }

    /*
    Write a method called alarm that prints the string 'Alarm!' multiple times om separate lines. 
    The method should accept an integer parameter that specifies how many times the string is printed.
    Print an error message if the parameter is less than 1.
     */
     public static void alarm(int times) {
        if (times < 1) {
            System.out.println("Error. Please enter a positive integer value. ");
        } else {
            for (int i = 1; i <= times; i++) {
                System.out.println("Alarm!");
            }
        }
     }

    // Write a method called sum100 that returns the sum of the integers 
    // form 1 to 100 inclusive.
    public static int sum100() {
        int sumNumbers = 0;

        for (int number = 1; number <= 100; number++) {
            sumNumbers += number;
        }
        return sumNumbers;
    }     

    /*
    Write a method called sumRange that accept two integer parameters that represents a Range.
    Issue an error message and return zero if the second parameter is less than the first.
    Otherwise, the method should return the sum of the integers in that range (inclusive).
     */
    public static int sumRange(int firstNum, int secondNum) {
        int sumNumbers = 0;

        if (secondNum < firstNum) {
            System.out.println("Error: Second number must be greater than or equal to the first number.");
        } else {
            for (int number = firstNum; number <= secondNum; number++) {
                sumNumbers += number;
            }
        } return sumNumbers;
    }

    // Write a method called countA that accepts a String parameter and returns 
    // the number of times the character 'A' is found in the string.
    public static int countA(String string) {
        int countAinString = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'A') {
                countAinString++;
            }
        }
        return countAinString;
    }
}

/*
Write a program that reads an arbitrary number that are in the range -25 to 25 inclusive
and counts how many occurrences of each are entered.
Indicate the end of the input by a value outside of the range.
After all input has been processed, print all of the values (with the number of occurrences)
that were entered one or more times.

7, 25, 12, 12, 0, 7, -1

**Output:**
0: 1 occurrence
7: 2 occurrences
12: 2 occurrences
25: 1 occurrence
*/

package Occurrences;

import java.util.Scanner;

public class PP8_2 {
    public static void main(String[] args) {
        int SENTINEL = -1;
        int RANGE = 25;
        Scanner scanner = new Scanner(System.in);

        int[] occurrences = new int[51];

        while (true) {
            System.out.println("Enter an integer value in range 0-50 (-1 to exit): ");
            int numUser = scanner.nextInt();

            if (numUser == SENTINEL) {
                break; 
            } else if (numUser < -25 || numUser > RANGE) {
                System.err.println("Error. Please enter integer values in range 0-50 (-1 to exit)");
                numUser = scanner.nextInt();
            } else {
                occurrences[numUser + 25]++;
            }
        }

        for (int i = 0; i < occurrences.length; i++) {
            int count = occurrences[i];
            if (count > 0) {
                System.out.println(i - 25 + ": " + count +  " occurrence" + (count > 1 ? "s" : ""));
            }
        }    

        scanner.close();
    }
}




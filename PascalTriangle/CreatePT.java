/* 
 * Design and implement a recursive program to determine and print the
 * Nth line of Pascal's triangle. Each interior value is the sum og the two
 * values above it. Hint: use an array to store the values on each line.
 */

package PascalTriangle;

import java.util.ArrayList;

public class CreatePT {

    // Print the row of values (part of the triangle)
    private static void printRow(ArrayList<Integer> row) {
        for (Integer value : row) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Create a new row on the triangle and return it
    public static ArrayList<Integer> getPascalRow(int n) {
        if (n == 1) { // Base case
            ArrayList<Integer> row = new ArrayList<>();
            row.add(1);
            return row;
        } else {
            ArrayList<Integer> previousRow = getPascalRow(n - 1);
            ArrayList<Integer> row = new ArrayList<>();
            row.add(1);
            for (int i = 0; i < previousRow.size() - 1; i++) {
                int sum = previousRow.get(i) + previousRow.get(i + 1);
                row.add(sum);
            } 

            row.add(1);
            return row;
        }
    }

    public static void generatePascalTriangle(int numLines) {
        if (numLines <= 0) {
            System.out.println("Please provide a positive integer greater than zero.");
            return;
        }
        // Make a shape of triangle with the values within
        for (int row = 1; row <= numLines; row++) {
            for (int space = numLines; space > row; space--) {
                System.out.print(" ");
            }
            // For each row prints a new row with each value is the sum of the two above
            ArrayList<Integer> pascalTriangle = getPascalRow(row);
            printRow(pascalTriangle);
        }
    }


    public static void main(String[] args) {
        generatePascalTriangle(10);
    }
}
/*
                          now 
                        /     \
                      is         the
                    /   \      /     \
                for     men   of       time
               /   \          \      /      \
             all   good      party  their    to 
           /     \
         aid     come
*/ 
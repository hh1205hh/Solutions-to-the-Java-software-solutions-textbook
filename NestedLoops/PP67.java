/*
Create a methods to print the following patterns.

1. **********    2.      *    3. **********  4.      *       5. *
*********               **        *********         ***         **
********               ***         ********        *****        ***
*******               ****          *******       *******       ****
******               *****           ******      *********      *****
*****               ******            *****      *********      ******
****               *******             ****       *******       *******
***               ********              ***        *****        ********
**               *********               **         ***         *********
*               **********                *          *          **********

*/

package NestedLoops;

/**
 * This class demonstrates various patterns using nested loops.
 */
public class PP67 {
    public static void main(String[] args) {
        System.out.println("\nPattern 1: \n");
        invertedRightTriangle();
        System.out.println("\nPattern 2: \n");
        pyramid();
        System.out.println("\nPattern 3: \n");
        invertedPyramid();
        System.out.println("\nPattern 4: \n");
        diamond();
        System.out.println("\nPattern 5: \n");
        rightTriangle();
    }

    /**
     * Prints an inverted right triangle pattern.
     */
    public static void invertedRightTriangle() {
        final int MAX_ROWS = 10;

        for (int row = 1; row <= MAX_ROWS; row++) {
            for (int star = 10; star >= row; star--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * Prints a pyramid pattern.
     */
    public static void pyramid() {
        final int MAX_ROWS = 10;

        for (int row = 1; row <= MAX_ROWS; row++) {
            for (int space = MAX_ROWS; space > row; space--) {
                System.out.print(" ");
            }
            System.out.print("*".repeat(row));
            System.out.println();
        }
    }

    /**
     * Prints an inverted pyramid pattern.
     */
    public static void invertedPyramid() {
        final int MAX_ROWS = 10;

        for (int row = MAX_ROWS; row >= 1; row--) {
            for (int space = MAX_ROWS; space > row; space--) {
                System.out.print(" ");
            }
            System.out.print("*".repeat(row));
            System.out.println();
        }
    }

    /**
     * Prints a diamond pattern.
     */
    public static void diamond() {
        final int MAX_ROWS = 5;

        for (int row = 1; row <= MAX_ROWS; row++) {
            for (int space = MAX_ROWS; space > row; space--) {
                System.out.print(" ");
            }
            System.out.print("*".repeat(2 * row - 1));
            System.out.println();
        }
        for (int row = MAX_ROWS - 1; row >= 1; row--) {
            for (int space = MAX_ROWS; space > row; space--) {
                System.out.print(" ");
            }
            System.out.print("*".repeat(2 * row - 1));
            System.out.println();
        }
    }

    /**
     * Prints a right triangle pattern.
     */
    public static void rightTriangle() {
        final int MAX_ROWS = 10;

        for (int row = 1; row <= MAX_ROWS; row++) {
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

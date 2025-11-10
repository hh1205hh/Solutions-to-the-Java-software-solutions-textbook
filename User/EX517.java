/*
Write a method called isIsosceles(האם שווה שוקיים) that accepts three
integer parameters that represent the lengths of the sides of a triangle.
The method returns true if the triangle is isosceles but not equilateral (שווה צלעות)
(Meaning that exactly two of the sides have an equal length), and false otherwise.
*/

package User;

import java.util.Scanner;

public class EX517 {
    /**
     * Checks if a triangle with the given side lengths is isosceles but not equilateral.
     * 
     * @param firstSide  The length of the first side of the triangle.
     * @param secondSide The length of the second side of the triangle.
     * @param thirdSide  The length of the third side of the triangle.
     * @return true if the triangle is isosceles but not equilateral, false otherwise.
     * @throws IllegalArgumentException if any side length is less than or equal to zero.
     */
    public static boolean isIsosceles(int firstSide, int secondSide, int thirdSide) {

        if (firstSide <= 0 || secondSide <= 0 || thirdSide <= 0) {
            throw new IllegalArgumentException("Triangle sides must have positive lengths. ");
        }

        boolean checkFirstAndSecond = firstSide == secondSide && firstSide != thirdSide;
        boolean checkFirstAndThird = firstSide == thirdSide && firstSide != secondSide;
        boolean checkSecondAndThird = secondSide == thirdSide && secondSide != firstSide;

        return checkFirstAndSecond || checkFirstAndThird || checkSecondAndThird;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Check if at least two of the sides of triangle are equal. ");

        System.out.println("Enter the first side of the triangle as integer: ");
        int firstSide = scanner.nextInt();
        
        System.out.println("Enter the second side of the triangle as integer: ");
        int secondSide = scanner.nextInt();

        System.out.println("Enter the third side of the triangle as integer: ");
        int thirdSide = scanner.nextInt();

        System.out.println(isIsosceles(firstSide,secondSide, thirdSide));

        scanner.close();
    }
}

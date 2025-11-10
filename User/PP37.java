/*
Write a program that reads the lengths of the sides if a triangle 
from the user. Compute the area of the triangle using Heron's formula (below), 
in which is s represents the lengths of the three sides .
Print the area to three decimal places.

Area = (s(s-a)(s-b)(s-c))^0.5
*/

package User;

import java.util.Scanner;

public class PP37 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
    
        System.out.println("Enter the length of side a: ");
        double aValue = scan.nextDouble();

        System.out.println("Enter the length of side b: ");
        double bValue = scan.nextDouble();

        System.out.println("Enter the length of side c: ");
        double cValue = scan.nextDouble();

        double sumLengthsABC = (aValue + bValue + cValue) / 2.0;

        double discriminant = sumLengthsABC * (sumLengthsABC - aValue) * (sumLengthsABC - bValue) * (sumLengthsABC - cValue);
        double areaOfTheTriangle = Math.sqrt(discriminant);

        System.out.printf("The area of your triangle: %.3f ", areaOfTheTriangle);

        scan.close();
    }
}

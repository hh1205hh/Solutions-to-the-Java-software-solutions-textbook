/* 
Write a program that reads the radius of a sphere and prints its volume 
and surface area. Use the following formulas .
Print the output to four decimal places. r represent the radius.
Volume = (4 / 3) * pi * r ^ 3
Surface area = 4 * pi * r ^ 2
*/

package User;

import java.util.Scanner;

public class PP36 {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    // Input radius to calculate the volume & surface area
    System.out.println("Enter the radius of a sphere: ");
    double sphereRadius = scan.nextDouble();

    // Calculating the volume & surface area of the sphere with the provided radius
    double volume = (4.0 / 3) * Math.PI * Math.pow(sphereRadius, 3);
    double surfaceArea = 4 * Math.PI * Math.pow(sphereRadius, 2);

    System.out.printf("The volume of the sphere: %.4f %nThe surface area of the sphere: %.4f", volume, surfaceArea);

    scan.close();

    }
}

/* Write a program that prints the sum of cubes.
Prompt for and read two values and print the sum of each value raised to the third power.
*/

package User;

import java.util.Scanner;

public class PP32 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter first value: ");
    double num1 = scan.nextDouble();

    System.out.println("Enter second value: ");
    double num2 = scan.nextDouble();

    double sumNumbers = Math.pow(num1, 3) + Math.pow(num2, 3);
    System.out.printf("%.0f in power of 3 + %.0f in power of 3 = %.0f%n", num1, num2, sumNumbers);
    scan.close();
    }
}
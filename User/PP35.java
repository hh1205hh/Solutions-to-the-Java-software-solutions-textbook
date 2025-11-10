/*
Write a program that reads the (x, y) coordinates for two points .
Compute the distance between the two points using the following formula:
Distance = ( ( (x(2)-x(1) )^2 + ((y(2)-y(1) )^2 ) ^ 0.5
*/

package User;

import java.util.Scanner;

public class PP35 {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter first x point: ");
    double firstXPoint = scan.nextDouble();

    System.out.println("Enter first y point: ");
    double firstYPoint = scan.nextDouble();

    System.out.println("Enter second x point: ");
    double secondXPoint = scan.nextDouble();

    System.out.println("Enter second y point: ");
    double secondYPoint = scan.nextDouble();

    double distanceX = Math.pow(secondXPoint - firstXPoint, 2);
    double distanceY = Math.pow(secondYPoint - firstYPoint, 2);

    double resultDistance = Math.sqrt(distanceX + distanceY);

    System.out.printf("Distance between two coordinates: %,2f", resultDistance);

    scan.close();
    }
}

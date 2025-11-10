/* 
Write a program that prompt for and reads a floating point value (double) 
and prints the closest whole numbers less than or greater than that value.
For example . if the number is 28.466, the program would print 28 and 29.
*/

package User;

import java.util.Scanner;

public class PP34 {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter floating point value: ");
    float numUser = scan.nextFloat();

    int numUserRound = Math.round(numUser);
    int numUserRound2 = 0;

    if (numUserRound - numUser > 0) {
        numUserRound -= 1;
        numUserRound2 = numUserRound + 1;
    } else {
        numUserRound2 = numUserRound + 1;
    }

    System.out.printf("Numbers closest to your number - %.2f: %n less than: %d %n greater than: %d", numUser, numUserRound, numUserRound2);

    scan.close();
    }
}

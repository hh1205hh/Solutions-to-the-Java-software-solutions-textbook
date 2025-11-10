/*
Write a method called maxOfTwo that accept two integer parameters and returns the larger of the two
*/

package User;

import java.util.Scanner;

public class EX512 {    
    public static void main(String[] args) {
        int num1; 
        int num2;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two integer values separate by a white space: ");
        
        // Check if the entered number is an integer value type.
        // if it's not, it repeat to enter an integer value type.
        while (true) {
            while (!scan.hasNextInt()) {
                System.out.println("Invalid value, Please enter an integer values: ");
                scan.next();
            }
            
            num1 = scan.nextInt();
            num2 = scan.nextInt();
            
            // Prints a message accordingly.
            System.out.println("The larger number of the two provided numbers is: " + maxOfTwo(num1, num2));
            break;
        }
        
        scan.close();
    }

    /**
     * Finds the larger value between two integer values.
     * 
     * @param num1 The first integer.
     * @param num2 The second integer.
     * @return The larger of the two integers.
     */
    public static int maxOfTwo(int num1, int num2) {
        return num1 > num2 ? num1 : num2;
    }
}

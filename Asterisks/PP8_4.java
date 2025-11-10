/*
Write a program that creates a histogram that allows you to visually inspect 
the frequency distribution of a set of values.
The program should read in the arbitrary number of integers from a text input file 
that are in the range 1 to 100 inclusive; then produce aa chart similar to the one 
below that indicates how many input values fell in the range 1 to 10, 11 to 20, etc.
Print one asterisk for each value entered.

___________________________________________
|   Range  |        Histogram              |
|__________|_______________________________|
|  1  - 10 | *****                         |
| 11 - 20  | **                            |
| 21 - 30  | ***************               |
| 31 - 40  |                               |
| 41 - 50  | ***                           |
| 51 - 60  | ********                      |
| 61 - 70  | **                            |
| 71 - 80  | *****                         |
| 81 - 90  | *******                       |
| 91 - 100 | *********                     |
|__________|_______________________________|


The lines in the histogram will be too long a large number of values is entered.
Modify the program so that it prints an asterisk for every five values in each category.
Ignore leftovers(שאריות). For example, if a category had 17 values, print three asterisks in that row.
If a category had 4 values, do not print any asterisks in that row.
*/

package Asterisks;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * This program reads a set of integers from a text file and creates a histogram
 * to visually represent the frequency distribution of the values. It categorizes
 * the values into ranges and prints asterisks to represent the number of values
 * falling within each range, considering only groups of five values.
 * 
 * The program reads integers from a specified file, categorizes them into ranges,
 * and then prints a histogram with each range and its corresponding number of asterisks.
 * 
 * The ranges are as follows:
 *   - 1 to 10
 *   - 11 to 20
 *   - 21 to 30
 *   - ...
 *   - 91 to 100
 * 
 * Each range is represented by a row in the histogram, and the number of asterisks
 * in each row indicates how many values from the input file fall within that range,
 * considering only groups of five values. If there are leftovers after dividing by five,
 * they are ignored.
 * 
 * Example Output:
 * ______________________________________________________________________________________
 * |   Range  |        Histogram                                                          |
 * |__________|__________________________________________________________________________|
 * |  1  - 10 | *****                                                                    |
 * | 11 - 20  | **                                                                       |
 * | 21 - 30  | ***************                                                          |
 * | 31 - 40  |                                                                          |
 * | 41 - 50  | ***                                                                      |
 * | 51 - 60  | ********                                                                 |
 * | 61 - 70  | **                                                                       |
 * | 71 - 80  | *****                                                                    |
 * | 81 - 90  | *******                                                                  |
 * | 91 - 100 | *********                                                                |
 * |__________|__________________________________________________________________________|
 * 
 * This program utilizes file I/O to read the integers from a text file. It categorizes
 * the integers into ranges and then prints the histogram with appropriate asterisks
 * to represent the frequency distribution.
 */
public class PP8_4 {
    public static void main(String[] args) throws FileNotFoundException {
        String number;
        int currentNumber = 0;

        int[] values = new int[10];
        // Read the values in the file
        Scanner fileScan = new Scanner(new File("C:\\new programs for java\\Testing java\\src\\Asterisks\\data.text"));

        while (fileScan.hasNext()) {
            number = fileScan.nextLine();
            currentNumber = Integer.parseInt(number);

            if (currentNumber >= 1 && currentNumber <= 10) {
                values[0]++;
            } 
            else if (currentNumber >= 11 && currentNumber <= 20) {
                values[1]++;
            }
            else if (currentNumber >= 21 && currentNumber <= 30) {
                values[2]++;
            }
            else if (currentNumber >= 31 && currentNumber <= 40) {
                values[3]++;
            }
            else if (currentNumber >= 41 && currentNumber <= 50) {
                values[4]++;
            }
            else if (currentNumber >= 51 && currentNumber <= 60) {
                values[5]++;
            }
            else if (currentNumber >= 61 && currentNumber <= 70) {
                values[6]++;
            }
            else if (currentNumber >= 71 && currentNumber <= 80) {
                values[7]++;
            }
            else if (currentNumber >= 81 && currentNumber <= 90) {
                values[8]++;
            }
            else if (currentNumber >= 91 && currentNumber <= 100) {
                values[9]++;
            }
        }

        System.out.println("_".repeat(100));
        for (int i = 0; i < values.length; i++) {
            int currentValue = values[i];
            if (currentValue % 5 == 1) {
                String numberAsterisks = "*".repeat((values[i] - 1) / 5);
                System.out.printf("| %3d - %3d | %s \n", (i * 10 + 1), ((i + 1) * 10), numberAsterisks);
                System.out.println("_".repeat(100));

            } else if (currentValue % 5 == 2) {
                String numberAsterisks = "*".repeat((values[i] - 2) / 5);
                System.out.printf("| %3d - %3d | %s \n", (i * 10 + 1), ((i + 1) * 10), numberAsterisks);
                System.out.println("_".repeat(100));

            } else if (currentValue % 5 == 3) {
                String numberAsterisks = "*".repeat((values[i] - 3) / 5);
                System.out.printf("| %3d - %3d | %s \n", (i * 10 + 1), ((i + 1) * 10), numberAsterisks);
                System.out.println("_".repeat(100));

            } else if (currentValue % 5 == 4) {
                String numberAsterisks = "*".repeat((values[i] - 4) / 5);
                System.out.printf("| %3d - %3d | %s \n", (i * 10 + 1), ((i + 1) * 10), numberAsterisks);
                System.out.println("_".repeat(100));
                
            } else {
                String numberAsterisks = "*".repeat(values[i] / 5);
                System.out.printf("| %3d - %3d | %s \n", (i * 10 + 1), ((i + 1) * 10), numberAsterisks);
                System.out.println("_".repeat(100));
            }
        }
        System.out.println("_".repeat(100));

        fileScan.close();
    }
}

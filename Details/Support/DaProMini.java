/*
Write a program that reads a sequence of up 25 pairs of first names, last names and postals (ZIP) codes from appropriate files.
Store the data arrays to store the first name (String), last name (String) and postal code (integer).
Assume each line in the file will contain one value. 
Then, after the files have been read in, print an appropriate format to the screen with the provided data. 
*/

package Details.Support;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DaProMini {
    public static void main(String[] args) throws FileNotFoundException {
        // Address[] addresses = new Address[25];
        final int LIMIT = 25;
        String[] firstNames = new String[25];
        String[] lastNames = new String[25];
        int[] zipCodes = new int[25];
        int countFirstNames = 0, indexFirstNames = 0;
        int countLastNames = 0, indexLastNames = 0;
        int countZIPCodes = 0, indexZIPCodes = 0;

        // Read the files with the appropriate data
        Scanner fileScanFirstNames = new Scanner(new File("C:\\new programs for java\\Testing java\\src\\Details\\FirstNames.text"));
        Scanner fileScanLastNames = new Scanner(new File("C:\\new programs for java\\Testing java\\src\\Details\\LastNames.text"));
        Scanner fileScanZIPCodes = new Scanner(new File("C:\\new programs for java\\Testing java\\src\\Details\\ZIPCodes.text"));

        // Accept the values until line 25 in th file
        while (fileScanFirstNames.hasNext() && countFirstNames < LIMIT) {
            firstNames[indexFirstNames] = fileScanFirstNames.nextLine();
            indexFirstNames++;
            countFirstNames++;
        }

        while (fileScanLastNames.hasNext() && countLastNames < LIMIT) {
            lastNames[indexLastNames] = fileScanLastNames.nextLine();
            indexLastNames++;
            countLastNames++;
        }

        while (fileScanZIPCodes.hasNext() && countZIPCodes < LIMIT) {
            zipCodes[indexZIPCodes] = fileScanZIPCodes.nextInt();
            indexZIPCodes++;
            countZIPCodes++;
        }

        // Provide nicely GUI to the user
        for (int i = 0; i < LIMIT; i++) {
            if (firstNames[i] != null && lastNames[i] != null) {
                System.out.printf("Name: %-15s | Last Name: %-15s | ZIP Code: %05d%n", firstNames[i], lastNames[i], zipCodes[i]);
            }
        }

        // Close files to release system resources
        fileScanFirstNames.close();
        fileScanLastNames.close();
        fileScanZIPCodes.close();
    }
}

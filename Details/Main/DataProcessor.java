/*
Write a program that reads a sequence of up 25 pairs of first names, last names and postals 
(ZIP) codes from appropriate files. Store the data arrays to store the first name (String),
last name (String) and postal code (integer). Assume each line in the file will contain one value. 
Then, after the files have been read in, print an appropriate format to the screen with the provided data. 

Support the storing of additional user information: 
street address(String), city(String), state(String), and 10-digit phone number 
(long integer, contains area code and does not include special characters such as ',' or '-').
*/

package Details.Main;

import Details.Support.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DataProcessor {
    public static void main(String[] args) throws FileNotFoundException {
        final int LIMIT = 25;
        // Creating an array of address objects
        Address[] addresses = new Address[25];
        String[] firstNames = new String[25];
        String[] lastNames = new String[25];
        int countFirstNames = 0, indexFirstNames = 0;
        int countLastNames = 0, indexLastNames = 0;
        int countObjects = 0, indexObjects = 0;

        // Read the data files
        Scanner fileScanFirstNames = new Scanner(new File("C:\\new programs for java\\Testing java\\src\\Details\\Data\\FirstNames.text"));
        Scanner fileScanLastNames = new Scanner(new File("C:\\new programs for java\\Testing java\\src\\Details\\Data\\LastNames.text"));
        Scanner fileScanZIPCodes = new Scanner(new File("C:\\new programs for java\\Testing java\\src\\Details\\Data\\ZIPCodes.text"));
        Scanner fileScanStreetAddresses = new Scanner(new File("C:\\new programs for java\\Testing java\\src\\Details\\Data\\StreetAddresses.text"));
        Scanner fileScanStates = new Scanner(new File("C:\\new programs for java\\Testing java\\src\\Details\\Data\\States.text"));
        Scanner fileScanCities = new Scanner(new File("C:\\new programs for java\\Testing java\\src\\Details\\Data\\Cities.text"));

        // Pass on the values in the first names file, limited to 25 values
        while (fileScanFirstNames.hasNext() && countFirstNames < LIMIT) {
            firstNames[indexFirstNames] = fileScanFirstNames.nextLine();
            indexFirstNames++;
            countFirstNames++;
        }

        // Pass on the values in the last names file, limited to 25 values
        while (fileScanLastNames.hasNext() && countLastNames < LIMIT) {
            lastNames[indexLastNames] = fileScanLastNames.nextLine();
            indexLastNames++;
            countLastNames++;
        }

        // Pass on the values in the files, limited to 25 values and enter each value 
        // to the appropriate parameter in the Address array objects
        while (fileScanStreetAddresses.hasNext() && fileScanCities.hasNext() 
                && fileScanStates.hasNext() && fileScanZIPCodes.hasNext() && countObjects < LIMIT) {
                addresses[indexObjects] = new Address(fileScanStreetAddresses.nextLine(), fileScanCities.nextLine(), fileScanStates.nextLine(), fileScanZIPCodes.nextLong());
                indexObjects++;
                countObjects++;
              }

        // The user enter a phone number
        GeneratePhoneNumber generatePN = new GeneratePhoneNumber();
        String phoneNumber = generatePN.generatePhoneNumber();

        // Provide the ability the see the data only if the entered phone number is match 
        // to the teacher's phone number or college administrator's phone number
        if (phoneNumber.equals("052-204-1900") || phoneNumber.equals("055-123-4567")) {
            System.out.println("You have gotten access to the data.");
                for (int i = 0; i < LIMIT; i++) {
                    if (firstNames[i] != null && lastNames[i] != null) {
                        System.out.println("+----------------------------------------+");
                        System.out.printf("| Name: %-10s | Last Name: %-9s| %n", firstNames[i], lastNames[i]);
                        System.out.println("|----------------------------------------|");
                        System.out.println(addresses[i]);
                }
            }
        } else {
            System.err.println("Your phone number doesn't match. You can't access to the data.");
        }
        
        fileScanFirstNames.close();
        fileScanLastNames.close();
        fileScanZIPCodes.close();
        fileScanStreetAddresses.close();
        fileScanStates.close();
        fileScanCities.close();
    }
}

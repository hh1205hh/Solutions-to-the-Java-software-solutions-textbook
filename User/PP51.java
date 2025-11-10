/*
Write a program that reads and an integer value from the user representing a year.
The purpose of the program is to determine if the year is leap year 
(and therefore has 29 days in February) in the Gregorian calender.

To determine if a year is a leap year, we follow these rules:
1. If the year is divisible evenly by 4, it is a leap year.

2. However, if the year is divisible by 100 but not by 400,
it is not a leap year.
For example:

- The year 2003 is not a leap year because it is not divisible by 4.
- The year 2004 is a leap year because it is divisible by 4.
- The year 1900 is not a leap year because, although it is divisible by 100, it is not divisible by 400.
- The year 2000 is a leap year because it is both divisible by 100 and 400.

Additionally, an error message should be produced for any input value less than 1582,
as this is the year the Gregorian calendar was adopted.

Add that the user can evaluate multiple years.
Allow the user to terminate the program using an appropriate sentinel value.
Validate each input value to ensure it is greater than or equal to 1582.
*/

package User;

import java.util.Scanner;

public class PP51 {

    public static void main(String[] args) {
        final int GREGORIAN_CALENDER_STARTED = 1582;
        final int SENTINEl = -1;

        // Create a list of the all years from 1600 to 2020 to check what year is a leap year
        for (int yearCheck = 1583; yearCheck <= 2025; yearCheck++) {
            System.out.println("Is the year " + yearCheck + " is leap year ? " + isLeapYear(yearCheck));
        } 

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter date of (enter -1 to quit): ");
        int yearUser = scanner.nextInt();

        
        while (yearUser != SENTINEl) {
            if (yearUser < GREGORIAN_CALENDER_STARTED) {
                System.out.println("Invalid input, Please provide a year equal to or greater than 1582. ");
            } else {
                System.out.println("Is that year a leap year ? " + isLeapYear(yearUser));
            }

            System.out.println("Enter date of (enter -1 to quit): ");
            yearUser = scanner.nextInt();
        }

        scanner.close();
        }

    /**
     * Determines if a given year is a leap year according to the rules of the Gregorian calendar.
     * 
     * @param year The year to be checked.
     * @return true if the year is a leap year, false otherwise.
     */
    public static boolean isLeapYear(int year) {
        // Check if year divide by 4 to determine if it a leap year
        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 != 0) {
                return false;
            } else { 
                return true;
            }
        } else {
            return false;
        }
    }
}

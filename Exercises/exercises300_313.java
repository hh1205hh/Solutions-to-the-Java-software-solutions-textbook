package Exercises;

import java.util.*;
import java.text.DecimalFormat;

public class exercises300_313 {
    public static void main(String[] args) {
        exercises300_313 test = new exercises300_313();
        test.sumAndDifference();
    }
    
    // Write a statement that prints the number of characters in a String object called overview.
    public int lengthOfString (String string) {
        System.out.println("Number of characters in string: " + string.length());
        return string.length();
    }
    

    // Write a statement that prints the 8th character of a String object called introduction.
    public void CharAt (int index, String string) {
        exercises300_313 obj = new exercises300_313();
        if (obj.lengthOfString(string) > index) {
            System.out.println(string.charAt(index));
        } else {
            System.out.println("Invalid index or the provided string is too short...");
        }
    }

    // Write a statement that prints the 8th character of a String object called introduction.
    // Declare a String variable names str and initialize it to contain the same characters as 
    // a String object called name , except in all uppercase characters.
    public void upperCase(String string) {
        String str = string.toUpperCase();
        System.out.println("Original variable : " + string);
        System.out.printf("variable converted into UpperCase: %s \n", str);
    }

    // Write a declaration for a String variable called change and initialize it to the characters 
    // stored in another String object called original with all first letter characters changed to the second letter.
    public void RePlace(String original, String firstLetter, String secondLetter) {
        if (original.length() < 10) {
            original = "Ella enjoys eating candy.";
        }
        String change = original.replace(firstLetter, secondLetter);
        System.out.printf("original String: %s \n", original);
        System.out.printf("Replace \'%s\'' to \'%s\': %s%n",firstLetter, secondLetter,  change);
    }

    // Assuming that a Random object has been created called generator, 
    // what is the range of the result of each of the following expressions?
    public void rangeNumbers (int[] parameters, int[] additionalNumbers) {
        Random generator = new Random(); 

        if (parameters == null && additionalNumbers == null) {
            parameters = new int[]{8, 12, 35, 100};
            additionalNumbers = new int[]{1, 2, 10, 50};
        } 
        // Display range and provide random number created in this range.
        for (int num : parameters) {
            for (int i = 0; i < additionalNumbers.length; i++) {
                int additional = additionalNumbers[i];
                System.out.print("generator.nextInt(" + num + ") + " + additional + " = ");
                System.out.println("Number in range: " + (0 + additional) + "-" + (num - 1 + additional));
                System.out.println(generator.nextInt(num) + additional);
                System.out.print("generator.nextInt(" + num + ") - " + additional + " = ");
                System.out.println("Number in range: " + (0 - additional) + "-" + (num - 1 + additional));
                System.out.println(generator.nextInt(num) - additional);
            }
        }
    }

    // public static void dictionaryRange () {
    //     /*  
    //     Write code to declare and instantiate an object of Random class (call the object reference variable rand).
    //     Than write a list of expressions using the nextInt method that generates random numbers in the following 
    //     specified ranges, including the end points.
    //     Use the version of the nextInt method that accept a single integer parameter.

    //     0 to 10, 10 to 400, 20 to 100, 30 to 400, 25 to 50, -10 to 15 
    //     */
    //     Random rand = new Random();
        
    //     HashMap<Integer, Integer> dictionary = new HashMap<Integer, Integer>();
    //     dictionary.put(0, 10);
    //     dictionary.put(10, 400);
    //     dictionary.put(20, 100);
    //     dictionary.put(30, 400);
    //     dictionary.put(25, 50);
    //     dictionary.put(-10, 15);

    //     for (Map.Entry<Integer, Integer> entry : dictionary.entrySet()) {
    //         Integer key = entry.getKey();
    //         Integer value = entry.getValue();
    //         int randomNumber = rand.nextInt(value - key + 1) + key;
    //         System.out.printf("key: %d , value: %d , Random number in range: %d%n", key, value, randomNumber);
    //     }
    // }

    // Write an assignment statement that computes the square root of the sum 
    // of num1 and num2 and assign the result to sumSquareRoots
    public void sumSquareRoots () {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double num1 = scan.nextDouble();

        System.out.println("Enter second number: ");
        double num2 = scan.nextDouble();

        scan.close();

        // Computes the sum of the square root of num1 and num2
        final double sumSquareRoots = Math.sqrt(num1) + Math.sqrt(num2);
        System.out.printf("Sum of the square roots of num1 and num2: %f%n", sumSquareRoots);
    }

    public void absTotal(double Total) {
        System.out.printf("Absolute value of total: %f%n", Math.abs(Total));

    }

    // Write code statement to create a Decimalformat object that will
    // round a formatted value to four decimal places.
    // Than write a statement that uses that object to print the value of result, properly formatted.
    public void fourDigits (double number) {
        DecimalFormat decimalFormat = new DecimalFormat("0.####"); 
        System.out.println(decimalFormat.format(number)); 
    }

    // Write a statement that prompt for and read a double value from the user , 
    // and then print the result of raising that value to the fourth power.
    // Output the results to three decimal places.
    public void decimalPower (double number, double power, int decimalPoint) {
        String decimal = "#." + "#".repeat(decimalPoint);

        DecimalFormat decimalFormatted = new DecimalFormat(decimal);
        double fourthPower = Math.pow(number, power);

        System.out.println(number + " raised to the power of " + power + " formatted to " + decimalPoint + " decimal places: " + decimalFormatted.format(fourthPower));
    }

    // public boolean AlgebraEquations(int num_of_formula, int version, int a, int b) {
    //     HashMap<String, Boolean> formulas = new HashMap<>();
    
    //         formulas.put("1, 1", Math.pow(a + b , 2) == Math.pow(a,2) + 2 * a * b + Math.pow(b,2));
    //         formulas.put("1, 2", Math.pow(a - b , 2) == Math.pow(a,2) - 2 * a * b + Math.pow(b,2));
    //         formulas.put("2,1", Math.pow(a + b, 3) == Math.pow(a, 3) + 3 * Math.pow(a, 2) * b + 3 * a * Math.pow(b, 2) + Math.pow(b, 3));
    //         formulas.put("2,2", Math.pow(a - b, 3) == Math.pow(a, 3) - 3 * Math.pow(a, 2) * b + 3 * a * Math.pow(b, 2) - Math.pow(b, 3));
    //         formulas.put("3,1", Math.pow(a, 3) + Math.pow(b, 3) == (a + b) * (Math.pow(a, 2) - a * b + Math.pow(b, 2)));
    //         formulas.put("4,1", Math.pow(a, 2) - Math.pow(b, 2) == (a - b) * (a + b));

    //     /* 
    //     Check the validity of algebraic formulas based on the provided formula number and version.
        
    //     Parameters:
    //     - num_of_formula (int): The formula number.
    //     - version (int): The formula version (1 or 2).
    //       Version means plus or minus. 
    //       plus = version 1, minus = version 2
    //     - a (int): The value of variable 'a'.
    //     - b (int): The value of variable 'b'.
    
    //     Returns:
    //     Bool or None: The result of the formula, or None if invalid parameters are provided.
    //     */
    //     {
    //         String key = num_of_formula + "," + version;
    //         Boolean result = formulas.get(key);
    
    //         // Return the result if it's not null, otherwise return false
    //         return result != null && result;
    //     }
    // }

    public void Average () {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            float user_num1 = scan.nextFloat();
            System.out.print("Enter the second number: ");
            float user_num2 = scan.nextFloat();

            final float ave_user_nums = (user_num1 + user_num2) / 2;

            System.out.printf("Average of the numbers is: %.2f\n", ave_user_nums);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numeric values");
        } finally {
        scan.close();
        }
    }

    public void sumAndDifference() {
        Scanner scan = new Scanner(System.in);

        boolean validInput = false;
        double user_num1 = 0;
        double user_num2 = 0;

        while (!validInput) {
            try {
                System.out.print("Enter the first number: ");
                user_num1 = scan.nextDouble();

                System.out.print("Enter the second number: ");
                user_num2 = scan.nextDouble();

                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter numeric values.");
                scan.nextLine();
            } 
        }
        final double difference = user_num1 - user_num2;
        final double sum = user_num1 + user_num2;
        
        System.out.println(("The difference between the two numbers is: \n" + difference));
        System.out.println("The sum of the two numbers is: " + sum);

        scan.close();
    }
    
}

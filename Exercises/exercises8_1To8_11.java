package Exercises;

import java.util.Arrays;

public class exercises8_1To8_11 {
    /*
    Write an array declaration and any necessary support classes to represent 
    the following statements:
    A. students' names for a class of 25 students
    B. students' test grades for a class of 40 students
    C. credit-card transactions that contain a transaction number, a merchant name, and a charge
    D. students' names for a class and homework grades for each student.
    E. for each employee of the L&L international corporation:
    the employee number, hire date, and the amount of the last five raises.
     */

    class CreditCardTransaction {
        private int transactionNumber;
        private double charge;
        private String merchantName;
        
        CreditCardTransaction(int transactionNumber, double charge, String merchantName) {
            this.transactionNumber = transactionNumber;
            this.charge = charge;
            this.merchantName = merchantName;
        }

        @Override
        public String toString() {
            return "Transaction number: " + this.transactionNumber + System.lineSeparator() + 
                    "charged: " + this.charge + System.lineSeparator() + 
                    "Name of the merchant: " + this.merchantName + "\n";
        }
    } 

    class Student {
        private String studentName;
        private double studentAverageGrade;

        Student(String studentName, double studentAverageGrade) {
            this.studentName = studentName;
            this.studentAverageGrade = studentAverageGrade;
        }

        @Override
        public String toString() {
            return "Name of the student: " + this.studentName + System.lineSeparator() + 
                    "Average grade of the student: " + this.studentAverageGrade + "\n";
        }
    }

    class Employee {
        private int employeeNumber;
        private String hireDate;
        private double[] lastFiveRaises;

        Employee(int employeeNumber, String hireDate, double[] lastFiveRaises) {
            this.employeeNumber = employeeNumber;
            this.hireDate = hireDate;
            this.lastFiveRaises = lastFiveRaises;
        }

        @Override
        public String toString() {
            return "Number of the employee: " + this.employeeNumber + System.lineSeparator() + 
                    "Hire date: " + this.hireDate + System.lineSeparator() + 
                    "The last five raises: " + this.lastFiveRaises + "\n";
        }
    }

    public static void arrayDeclarations() {
        String[] studentsNames = new String[25];
        double[] studentsTestGrades = new double[40];
        CreditCardTransaction[] creditCard = new CreditCardTransaction[100];
        Student[] students = new Student[50];
        Employee[] employees = new Employee[100];

        System.out.println("\n=== Student Names ===");
        for (int i = 0; i < studentsNames.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + (studentsNames[i] != null ? studentsNames[i] : "Not specified"));
        }
        
        System.out.println("\n=== Student Test Grades ===");
        for (int i = 0; i < studentsTestGrades.length; i++) {
            String gradeSymbol = "\u25A0"; // Unicode character for a solid square
            String gradeBar = gradeSymbol.repeat((int) (studentsTestGrades[i] / 10)); // Repeat symbol based on grade
            System.out.printf("Test %2d: %-10s %s%n", i + 1, gradeBar, studentsTestGrades[i]);
        }
        
        System.out.println("\n=== Credit Card Transactions ===");
        for (int i = 0; i < creditCard.length; i++) {
            System.out.println("Transaction " + (i + 1) + ": " + (creditCard[i] != null ? creditCard[i] : "No transaction recorded"));
        }
        
        System.out.println("\n=== Students ===");
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + (students[i] != null ? students[i] : "No student data available"));
        }
        
        System.out.println("\n=== Employees ===");
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Employee " + (i + 1) + ": " + (employees[i] != null ? employees[i] : "No employee data available"));
        }
    }
        

    // Write code that sets each element of an array called nums to
    // te value of the constant INITIAl.
    public static void setsArrayValue(int[] nums) {
        final int INITIAL = 1;
        System.out.println("Nums array before modification: " + Arrays.toString(nums));

        for (int i = 0; i < nums.length; i++) {
            nums[i] = INITIAL;
        }
        System.out.println("Nums array after modification: " + Arrays.toString(nums));
    }

    // Write code that prints the values stored in an array called names backwards
    public static void arrayValuesBackward(String[] names) {
        for (int i = names.length -1; i >= 0; i--) {
            System.out.print(names[i] + " ");
        }
    }

    // Write code that sets each element of a boolean array called flags
    // to alternative values (true at index 0, false at index 1, etc.)
    public static boolean[] alternativeFlags(boolean[] flags) {
        for (int i = 0; i < flags.length; i++) {
            flags[i] = false;
        }
        for (int i = 0; i < flags.length; i += 2) {
            flags[i] = true;
        }
        return flags;
    }

    // Write a method called sumArray that accepts an array of floating point values 
    // and returns the sum of the values stored in the array
    public static double sumArray(double[] values) {
        double sumArrayValues = 0;

        for (int i = 0; i < values.length; i++) {
            sumArrayValues += values[i];
        }
        return sumArrayValues;
    }

    // Write a method called switchThem that accepts two integer arrays as parameters and
    // switch the contents of the arrays.
    // Take into account that the arrays may be in different sizes.
    public static void switchThem(int[] firstArray, int[] secondArray) {
        System.out.println("first array before: " + Arrays.toString(firstArray));
        System.out.println("Second array before: " + Arrays.toString(secondArray));

            int[] temporary = firstArray;
            firstArray = secondArray;
            secondArray = temporary;

        System.out.println("first array after: " + Arrays.toString(firstArray));
        System.out.println("Second array after: " + Arrays.toString(secondArray));
    }
 
    public static void main(String[] args) {
        // int[] values = {1, 2, 3, 4, 5};
        // setsArrayValue(values);

        // String[] names = {"Haim", "John", "David"};
        // arrayValuesBackward(names);

        // boolean[] valuesFlags = {false, false, true, false, false, true, true, true, false};
        // System.out.println(Arrays.toString(alternativeFlags(valuesFlags)));

        // double[] simpleArray = {1, 2, 3, 4.5, 6.7, 8.9};
        // System.out.println(sumArray(simpleArray));
        
        // int[] firstArray = {5, 6, 7};
        // int[] secondArray = {1, 2, 3, 4};
        // switchThem(firstArray, secondArray);

        arrayDeclarations();
    }
}

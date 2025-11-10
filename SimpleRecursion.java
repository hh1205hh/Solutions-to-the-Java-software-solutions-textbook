public class SimpleRecursion {

    // Return 5 * n in a recursive process
    public static int fiveMultiByNum(int n) {
        if (n == 1) {
            return 1;
        } else if (n > 1) {
            return 5 + (5 * (n - 1));
        }
        return n;
    }

    // Return the sum of n down to 1
    public static int numSquareSum(int num) {
        if (num <= 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        } else {
            return num * num + numSquareSum(num -1);
        }
    }

/*
| Input (n) | Output |
| --------- | ------ |
| 3          |      9  |
|2           | 9 + 4       |
| 1        |   9+4  + 1     |
|           |        |

| Input (n) | Output |
| --------- | ------ |
| 3456      | 1      |
| 345       | 1 + 1  |
| 34        | 1 + 1 + 1 |
| 3         | 1 + 1 + 1 + 1 |
 */

    // Return the number of digits in an arbitrary number
    public static int exercise(int n) {
        if (n < 0) {
            return -1;
        } else {
            if (n < 10) 
                return 1;
           else
                return 1 + exercise(n / 10);
        }
    }

/* 
| Input (n) | Output |
| --------- | ------ |
| 3456      | 1      |
| 345       | 1 + 1  |
| 34        | 1 + 1 + 1 |
| 3         | 1 + 1 + 1 + 1 |

exercise(3456)
= 1 + exercise(345)
= 1 + (1 + exercise(34))
= 1 + (1 + (1 + exercise(3)))
= 1 + (1 + (1 + (1)))
= 4

*/    

    // Return the sum of digits in arbitrary number
    public static int sumDigits(int n) {
        if (n < 0) {
            return -1; 
        } else if (n < 10) {
            return n; // Base case
        } else {
            return n % 10 + sumDigits(n / 10); // Recursive case: sum of current digit and recursive call for the rest
        }
    }

/*
| Input (n) | Output |
| --------- | ------ |
| 12345     | 5      |
| 1234      | 5 + 1  |
| 123       | 4 + 5  |
| 12        | 3 + 9  |
| 1         | 2 + 12 |

sumDigits(12345)
= 5 + sumDigits(1234)
= 4 + (5 + sumDigits(123))
= 3 + (9 + sumDigits(12))
= 2 + (12 + sumDigits(1))
= 1 + (14)
= 15
 */
    
    public static void main(String[] args) {
        // System.out.println("five multiple: " + fiveMultiByNum(-5));
        // System.out.println("Sum of the squares up to 1000: " + Math.pow(numSquareSum(100), numSquareSum(5)));
        // System.out.println(numSquareSum(3));
        // System.out.println("WHat the dog doing? " + exercise(1000));
        // System.out.println("Sum of the digits in 12345: " + sumDigits(12345));
    }
}

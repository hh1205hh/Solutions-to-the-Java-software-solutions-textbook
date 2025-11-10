/*
Write a program that plays the Hi-Lo guessing game with numbers. 
The program should pick a random number between 1 and 100 (inclusive), then repeatedly prompt 
the user to guess the number. On each guess, report to the user that he or she is correct or
that the guess is high or low. Continue accepting guess until the user guesses correctly or chooses to quit.
Count the number of guesses and report that value when the user guesses correctly.
At the end of each game (by quitting or a correct guess), prompt to determine whether 
the user wants to play again. Continue playing games until the user chooses to stop.
*/

package ShortGames;

import java.util.*;

/**
 * This class contains a simple Hi-Lo guessing game.
 */
public class PP54 {

    /**
     * Generates a random number between 1 and 100.
     *
     * @return The random number generated.
     */
    public static int RandomNumber() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

    /**
     * Prints the instructions for the Hi-Lo game.
     */
    public static void instructionsToHiLoGame() {
        System.out.println("-----------------------------------\n" +
                "    WELCOME TO THE HI-LO GAME! \n" +
                "-----------------------------------\n" +
                "          INSTRUCTIONS: \n" +
                "The computer has chosen a random number between 1 and 100. Can you guess it?\n" +
                " Press -1 to exit the game.\n" +
                " Press -2 to see how many attempts you've made.\n" +
                " Press -3 to view the instructions again.\n");
    }

    /**
     * Runs the Hi-Lo guessing game.
     *
     * @param scanner Scanner object to read user input.
     */
    public static void HiLoGame(Scanner scanner) {
        final int EXIT = -1;
        final int DISPLAY_TRY_COUNT = -2;
        final int INSTRUCTIONS = -3;
        int tryCount = 0;

        int randomNum = RandomNumber();

        instructionsToHiLoGame();

        System.out.println("Enter an integer number in the range 1-100: ");
        int numUser;

        while (true) {
            numUser = scanner.nextInt();

            // Performs when the user selects one of the provided options
            if (numUser == EXIT) {
                System.out.println("Thank you for playing.");
                break;
            }
            if (numUser == DISPLAY_TRY_COUNT) {
                System.out.println("Times you tried: " + tryCount + "\n");
            }
            if (numUser == INSTRUCTIONS) {
                instructionsToHiLoGame();
            }

            tryCount++;

            // Provide information to the user on the random number
            if (numUser < randomNum) {
                System.out.println("Your guess is lower than the random number. ");
            } else if (numUser > randomNum) {
                System.out.println("Your guess is higher than the random number. ");
            } else {
                System.out.println("Congratulations! You guessed the number in " + tryCount + " tries.");
                break;
            }
        }
        System.out.println("Times you tried: " + tryCount);
    }

    /**
     * The main method to start the Hi-Lo game.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Play the game once and check if the user wants to play again
        do {
            HiLoGame(scanner);
            System.out.println("Do you want to play again? (y/n)");
        } while (scanner.next().equalsIgnoreCase("y"));

        // Close the Scanner object to release system resources
        scanner.close();
    }
}

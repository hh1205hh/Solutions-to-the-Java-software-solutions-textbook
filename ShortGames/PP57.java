/*
Write a program that plays the Rock-Paper-Scissors game against the computer.
When played between two people, each person picks one of three options 
(usually shown by a hand gesture) at the same time, and a winner is determined.
In the game, Rock beats Scissors, Scissors beats Paper, and Paper beats Rock.
The program should randomly choose one of the three options (without revealing it)
then prompt for the user's selection. At that point the program revels both choices
and prints a statement indicating if the user won, the computer won, or if it was a tie.
Continue playing until the user choose to stop, then print the number of user wins, losses, and ties.
*/

package ShortGames;

import java.util.*;

/**
 * This class implements a Rock-Paper-Scissors game where the user plays against the computer.
 * Rules: Rock beats Scissors, Scissors beats Paper, and Paper beats Rock.
 */
public class PP57 {
    /**
     * Main method to start the Rock-Paper-Scissors game.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Play the game once and checking if the user wants to play again
        do {
            rockPaperScissorsGame(scanner);
            System.out.println("Do you want to play again? (y/n)");
        } while (scanner.next().equalsIgnoreCase("y"));

        scanner.close();
    }

    /**
     * Generates a random choice for the computer.
     *
     * @return The random choice of the computer (1 for Rock, 2 for Paper, 3 for Scissors).
     */
    public static int computerChoice() {
        Random random = new Random();
        return random.nextInt(3) + 1;
    }

    /**
     * Displays instructions for the Rock-Paper-Scissors game.
     */
    public static void instructionsToRPSGame() {
        System.out.println("--------------------------------------------------\n" +
                "    WELCOME TO THE ROCK-PAPER-SCISSORS GAME!\n" +
                "--------------------------------------------------\n" +
                "                 INSTRUCTIONS: \n" +
                "You are going to play Rock-Paper-Scissors game. \n" +
                "In this game, you need to choose one of the three options: \n" +
                "   1. Rock \n   2. Paper \n   3. Scissors\n" +
                "The rules are very simple, " +
                "In the game, Rock beats Scissors, Scissors beats Paper, and Paper beats Rock. \n");
    }

    /**
     * Implements the Rock-Paper-Scissors game.
     *
     * @param scanner Scanner object to read user input.
     */
    public static void rockPaperScissorsGame(Scanner scanner) {
        final int SENTINEL = -1;
        final int SCISSORS = 3;
        final int PAPER = 2;
        final int ROCK = 1;
        int userWins = 0;
        int userLosses = 0;
        int userTies = 0;

        instructionsToRPSGame();

        while (true) {
            System.out.println("Enter a choice (1 - Rock, 2 - Paper, 3 - Scissors, -1 to exit): ");

            int userChoice = scanner.nextInt();
            int computerChoice = computerChoice();

            // Performs comparisons between user and computer choices
            if (userChoice == ROCK) {
                if (computerChoice == SCISSORS) {
                    System.out.println("You chose: Rock \nComputer chose: Scissors. ");
                    System.out.println("You won in this round. ");
                    userWins++;
                } else if (computerChoice == PAPER) {
                    System.out.println("You chose: Rock \nComputer chose: Paper. ");
                    System.out.println("Computer won in this round. ");
                    userLosses++;
                } else {
                    System.out.println("You chose: Rock \nComputer chose: Rock. ");
                    System.out.println("Both of you chose ROCK");
                    userTies++;
                }
            } else if (userChoice == PAPER) {
                if (computerChoice == SCISSORS) {
                    System.out.println("You chose: Paper \nComputer chose: Scissors. ");
                    System.out.println("Computer won in this round. ");
                    userLosses++;
                } else if (computerChoice == PAPER) {
                    System.out.println("You chose: Paper \nComputer chose: Paper. ");
                    System.out.println("Both of you chose a PAPER. ");
                    userTies++;
                } else {
                    System.out.println("You chose: Paper \nComputer chose: Rock. ");
                    System.out.println("You won in this round. ");
                    userWins++;
                }
            } else if (userChoice == SCISSORS) {
                if (computerChoice == SCISSORS) {
                    System.out.println("You chose: Scissors \nComputer chose: Scissors. ");
                    System.out.println("Both of you chose a SCISSORS. ");
                    userTies++;
                } else if (computerChoice == PAPER) {
                    System.out.println("You chose: Scissors \nComputer chose: Paper. ");
                    System.out.println("You won in this round. ");
                    userWins++;
                } else {
                    System.out.println("You chose: Scissors \nComputer chose: Rock. ");
                    System.out.println("Computer won in this round. ");
                    userLosses++;
                }
            } else if (userChoice == SENTINEL) {
                System.out.println("Thank you for playing. \n");
                break;
            }
        }

        // Prints the results of the game
        System.out.println("Number of losses: " + userLosses);
        System.out.println("Number of wins: " + userWins);
        System.out.println("Number of ties: " + userTies);
    }
}

package Dice;

/*
Using the PairOfDice class, write a program that rolls pair of dice 1000 times (inclusive),
counting the number of box cars (two sixes) that occur and their sum.
 */

public class RollingDice2 {
    public static void main(String[] args) {
        int sumBoxCars = 0;
        int twoSixesOccurred = 0;
        final int BOX_CARS = 12;

        // Rolls 1000 times PairOfDice objects, if both of the dices are 6 the variables increment gradually
        for (int i = 1; i <= 1000; i++) {
            PairOfDice pairDice = new PairOfDice(new Dice(), new Dice());
            if (pairDice.currentSum() == 12) {
                sumBoxCars += BOX_CARS; 
                twoSixesOccurred++;
            }
        }
        //Prints messages accordingly
        System.out.println("Sum of two sixes occurred: " + twoSixesOccurred);
        System.out.println("Their sum: " + sumBoxCars);

        // Dice dice = new Dice();
        // dice.setFaceValue(-1);
    }
}


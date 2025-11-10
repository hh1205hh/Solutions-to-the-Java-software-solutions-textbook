package Coins;

/*
Using the CoinFlip class defined, write a program called countFlips whose main method
flips a coin 1000 times and counts how many times each side comes up. Print the results.
*/

public class countFlips {
    public static void main(String[] args) {
        int countHeads = 0;
        int countTails = 0;

        // Rolls 1000 times the coin
        for (int i = 1; i <= 1000; i++) {
            CoinFlip Coin = new CoinFlip();
            Coin.flipCoin();

            if (Coin.isHead()) {
                countHeads++;
            } else {
                countTails++;
            }
        } 

        System.out.println("Heads counted: " + countHeads);
        System.out.println("Tails counted: " + countTails);

        // Find the largest between heads count and tails count
        String maxCount = countHeads > countTails ? "Heads count" : "Tails count";

        System.out.println("The max between: " + maxCount);
        System.out.println("Difference between = " + (int)Math.abs(countHeads - countTails));
    }
}

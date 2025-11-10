package Coins;

public class MonetaryMain {
    public static void main(String[] args) {
        int sumValues = 0;
        // Create an array of MonetaryCoin limited to 100 objects 
        MonetaryCoin[] monetaryCoins = new MonetaryCoin[100];
        // Instantiates MonetaryCoin objects and flipping them 
        for (int i = 0; i < monetaryCoins.length; i++) {
            monetaryCoins[i] = new MonetaryCoin();
        }
        //Passes on the array and prints if the value is HEADS or TAILS
        for (MonetaryCoin coin : monetaryCoins) {
            System.out.print(coin + " (");
            System.out.println(coin.headOrTails() + ")");
            sumValues += coin.getValue();
        }

        System.out.println("The sum of the coins flipped on heads: " + sumValues);
    } 
}

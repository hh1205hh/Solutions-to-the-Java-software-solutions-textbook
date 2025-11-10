package Coins;

/**
 * The CoinFlip class represents a coin that can be flipped to show heads or tails.
 */
public class CoinFlip { 
    private final int HEADS = 0;
    protected int faceCoin;

    /**
     * Constructs a CoinFlip object and flips the coin.
     */
    public CoinFlip() {
        flipCoin();
    }

    /**
     * Flips the coin, setting its face to 0 (heads) or 1 (tails).
     */
    public void flipCoin() {
        faceCoin = (int) (Math.random() * 2);
    }

    /**
     * Returns the current face of the coin as a string representation.
     * @return "HEADS" if the face is 0, "TAILS" otherwise.
     */
    public String headOrTails() {
        if (faceCoin == HEADS)
            return "HEADS";
        else
            return "TAILS";
    }

    /**
     * Checks if the current face of the coin is heads.
     * @return true if the face is heads, false otherwise.
     */
    public boolean isHead() {
        return (faceCoin == HEADS);
    }

    /**
     * Returns a string representation of the current face of the coin.
     * @return "HEADS" if the face is 0, "TAILS" otherwise.
     */
    @Override
    public String toString() {
        if (faceCoin == HEADS)
            return "HEADS";
        else
            return "TAILS";
    }
}

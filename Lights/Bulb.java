package Lights;

/**
 * Represents a light bulb.
 */
public class Bulb {
    private final boolean MODE;

    /**
     * Constructs a light bulb with the specified mode.
     * @param mode The mode of the bulb (true for on, false for off).
     */
    public Bulb(boolean mode) {
        this.MODE = mode;
    }

    /**
     * Prints whether the bulb is on or off.
     */
    public void isOnOrOff() {
        if (MODE) {
            System.out.println("Bulb is on.");
        } else {
            System.out.println("Bulb is off.");
        }
    }
}

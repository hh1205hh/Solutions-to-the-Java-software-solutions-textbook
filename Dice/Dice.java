/*
Set the setFaceValue method that it does nothing if the parameter is outside
of the valid range of values.
*/

package Dice;

/**
 * Represents a six-sided dice.
 */
public class Dice {
    private final int MAX = 6;
    private int faceValue;

    /**
     * Constructs a dice with initial face value of 1.
     */
    public Dice() {
        faceValue = 1;
    }

    /**
     * Rolls the dice and returns the face value.
     * @return The face value after rolling.
     */
    public int roll() {
        this.faceValue = (int)(Math.random() * MAX) + 1;
        return faceValue; 
    }

    /**
     * Sets the face value of the dice.
     * @param newFaceValue The new face value to set.
     */
    public void setFaceValue(int newFaceValue) {
        if (newFaceValue > MAX || newFaceValue <= 0) {
            System.err.println("Error. Cannot assign number greater than 6 or less than 0 on a cube. ");
        } else {
            this.faceValue = newFaceValue;
        }
    }

    /**
     * Gets the current face value of the dice.
     * @return The current face value.
     */
    public int getFaceValue() {
        return this.faceValue;
    }

    /**
     * Returns the face value of the dice as a string.
     * @return The face value as a string.
     */
    @Override
    public String toString() {
        return Integer.toString(faceValue);
    }
}

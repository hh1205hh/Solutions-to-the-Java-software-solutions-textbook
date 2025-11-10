/*
using the Dice class, write a class called PairOfDice, composed of two Dice objects.
Include methods to get and set the individual dice values,
a method to roll the dice ,and a method that returns the current sum pf the two Dice values.
Create a driver class called RollingDice2 to instantiates and use a PairOfDice object.
 */

package Dice;

 /**
  * Represents a pair of dice.
  */
 public class PairOfDice {
     private Dice dice1, dice2;
 
     /**
      * Constructs a pair of dice with two given dice objects.
      * Rolls both dice upon construction.
      * @param dice1 The first dice.
      * @param dice2 The second dice.
      */
     public PairOfDice(Dice dice1, Dice dice2) {
         this.dice1 = dice1;
         this.dice2 = dice2;
         dice1.roll();
         dice2.roll();
     }
 
     /**
      * Sets the pair of dice with new dice objects.
      * @param newDice1 The new first dice.
      * @param newDice2 The new second dice.
      */
     public void setDices(Dice newDice1, Dice newDice2) {
         this.dice1 = newDice1;
         this.dice2 = newDice2;
     }
 
     /**
      * Gets the face value of the first dice.
      * @return The face value of the first dice.
      */
     public int getDice1() {
         return this.dice1.getFaceValue();
     }
 
     /**
      * Gets the face value of the second dice.
      * @return The face value of the second dice.
      */
     public int getDice2() {
         return this.dice2.getFaceValue();
     }
 
     /**
      * Calculates and returns the current sum of the face values of the pair of dice.
      * @return The sum of the face values.
      */
     public int currentSum() {
         return this.dice1.getFaceValue() + this.dice2.getFaceValue();
     }
 
     /**
      * Returns a string representation of the pair of dice.
      * @return A string containing the face value of each dice.
      */
     @Override
     public String toString() {
         return "Dice 1 = " + this.dice1 + System.lineSeparator() + 
                "Dice 2 = " + this.dice2 + System.lineSeparator();
     }
 }
 
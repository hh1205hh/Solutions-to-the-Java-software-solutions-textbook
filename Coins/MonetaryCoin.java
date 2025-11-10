/*
Write a class called MonetaryCoin that is derived from the CoinFlip class.
Store an integer in the MonetaryCoin that represents its value and add a method that 
returns its value. Create a main driver class to instantiate and compute the
sum of several MonetaryCoin objects.
Demonstrate that a monetary coin inherits its parent's ability to be flipped.
 */

package Coins;

 /**
  * The MonetaryCoin class represents a coin with a monetary value derived from the CoinFlip class.
  */
 public class MonetaryCoin extends CoinFlip {
     private int value;
 
     /**
      * Constructs a MonetaryCoin object and sets its value by flipping the coin.
      */
     public MonetaryCoin() {
         super();
         value = super.faceCoin;
     }
 
     /**
      * Gets the value of the monetary coin.
      * @return The value of the monetary coin.
      */
     public int getValue() {
         return faceCoin;
     }
 
     /**
      * Returns a string representation of the current face of the coin with its value.
      * @return A string representing the current face of the coin and its value.
      */
     @Override
     public String toString() {
         return "Current face coin: " + value;
     }
 }
 
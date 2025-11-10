/*
Write a class called Box that contains instance data that represents the height, width, and depth of the box.
Also include a boolean variable called isFull as instance data that represents whether the box is full or not. 
Define the Box constructor to accept and initialize the height, width, and depth of the box.
Each newly created box is empty (The constructor should initialize isFull to false).
Include getter and setter methods for all instance data.
Include a toString method that returns a one-line description of the box.
Create a driver class called BoxTest, whose main method instantiates and updates several Box objects.
 */

package Box;

/**
* The Box class represents a box with instance data for its height, width, depth,
* and a boolean variable indicating whether the box is full or not. It includes
* constructors, setter and getter methods for all instance data, and a toString
* method to provide a one-line description of the box.
*/
public class Box {
    private double height;
    private double width;
    private double depth;
    private boolean isFull;
 
    /**
    * Constructs a Box object with the given height, width, depth, and fullness status.
    * @param height The height of the box.
    * @param width The width of the box.
    * @param depth The depth of the box.
    * @param isFull Whether the box is full or not.
    */
    public Box(double height, double width, double depth, boolean isFull) {
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.isFull = isFull;
    }
 
    /**
    * Sets the height of the box.
    * @param newHeight The new height of the box.
    */
    public void setHeight(double newHeight) {
        this.height = newHeight;
    }
 
    /**
    * Sets the width of the box.
    * @param newWidth The new width of the box.
    */
    public void setWidth(double newWidth) {
        this.width = newWidth;
    }
 
     /**
      * Sets the depth of the box.
      * @param newDepth The new depth of the box.
      */
     public void setDepth(double newDepth) {
         this.depth = newDepth;
     }
 
     /**
      * Sets the fullness status of the box.
      * @param newIsFull The new fullness status of the box.
      */
     public void setIsFull(boolean newIsFull) {
         this.isFull = newIsFull;
     }
 
     /**
      * Gets the height of the box.
      * @return The height of the box.
      */
     public double getHeight() {
         return this.height;
     }
 
     /**
      * Gets the width of the box.
      * @return The width of the box.
      */
     public double getWidth() {
         return this.width;
     }
 
     /**
      * Gets the depth of the box.
      * @return The depth of the box.
      */
     public double getDepth() {
         return this.depth;
     }
 
     /**
      * Gets the fullness status of the box.
      * @return Whether the box is full or not.
      */
     public boolean isFull() {
         return this.isFull;
     }
 
     /**
      * Returns a one-line description of the box including its height, width,
      * depth, and fullness status.
      * @return A one-line description of the box.
      */
     @Override
     public String toString() {
         return "Height: " + this.height + ", Width: " + this.width +
                ", Depth: " + this.depth + ", Full: " + this.isFull;
     }
 }
 
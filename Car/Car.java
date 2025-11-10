/*
Write a class called Car that contains instance data that represents the make, model, and year of the car.
Define the Car constructor to initialize these values.
Include getter and setter methods for all instance data, and a toString method that returns 
a one-line description of the car.
Add a method called isAntique that return a boolean indicating if the car is antique  
(if it is more than 45 years old).
Create a driver class called CarTest, whose main method instantiate and updates several car objects
 */

package Car;

import java.time.Year;

/**
 * The Car class represents a car with instance data for its make, model, and year of manufacture.
 * It includes constructors, setter and getter methods for all instance data, and methods to determine
 * if the car is an antique and to provide a one-line description of the car.
 */
 public class Car {
     private String makerName;
     private String modelName;
     private int yearMade;
 
     /**
      * Constructs a Car object with the given make, model, and year of manufacture.
      * @param makerName The make of the car.
      * @param modelName The model of the car.
      * @param yearMade The year of manufacture of the car.
      */
     public Car(String makerName, String modelName, int yearMade) {
         this.makerName = makerName;
         this.modelName = modelName;
         this.yearMade = yearMade;
     }
 
     /**
      * Sets the make of the car.
      * @param makerName The new make of the car.
      */
     public void setMakerName(String makerName) {
         this.makerName = makerName;
     }
 
     /**
      * Gets the make of the car.
      * @return The make of the car.
      */
     public String getMakerName() {
         return makerName;
     }
 
     /**
      * Sets the model of the car.
      * @param modelName The new model of the car.
      */
     public void setModelName(String modelName) {
         this.modelName = modelName;
     }
 
     /**
      * Gets the model of the car.
      * @return The model of the car.
      */
     public String getModelName() {
         return modelName;
     }
 
     /**
      * Sets the year of manufacture of the car.
      * @param yearMade The new year of manufacture of the car.
      */
     public void setYearMade(int yearMade) {
         this.yearMade = yearMade;
     }
 
     /**
      * Gets the year of manufacture of the car.
      * @return The year of manufacture of the car.
      */
     public int getYearMade() {
         return yearMade;
     }
 
     /**
      * Returns a one-line description of the car including its make, model, year, and whether it's an antique.
      * @return A one-line description of the car.
      */
     @Override
     public String toString() {
         return "Maker name: " + makerName + System.lineSeparator() +
                "Model Name: " + modelName + System.lineSeparator() +
                "Year Made: " + yearMade + System.lineSeparator() +
                "Is antique: " + isAntique() + "\n";
     }
 
     /**
      * Checks if the car is an antique (more than 45 years old).
      * @return true if the car is an antique, false otherwise.
      */
     public boolean isAntique() {
         int currentYear = Year.now().getValue();
         return (currentYear - yearMade) > 45;
     }
 }
 
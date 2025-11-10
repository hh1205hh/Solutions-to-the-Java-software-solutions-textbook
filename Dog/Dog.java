/*
Write a class called Dog that contain instance data that represents the dog's name and age.
Define the dog constructor to accept and initialize instance data.
Include getter and setter methods for the name and age.
Include a method to compute and return the age of the dog in "person years" 
(seven times the dog's age).
Include a toString method that returns a one-line description on the dog.
Create a driver class called Kennel, whose main method instantiates and updates several Dog objects
*/

package Dog;

/**
 * Represents a dog with a name and age.
 */
public class Dog {
    private String name;
    private double age;

    /**
     * Constructs a dog with the given name and age.
     * @param name The name of the dog.
     * @param age The age of the dog.
     */
    public Dog(String name, double age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Sets the age of the dog.
     * @param newAge The new age of the dog.
     */
    public void setAge(double newAge) {
        this.age = newAge;
    }

    /**
     * Sets the name of the dog.
     * @param newName The new name of the dog.
     */
    public void setName(String newName) {
        this.name = newName;
    }

    /**
     * Gets the age of the dog.
     * @return The age of the dog.
     */
    public double getAge() {
        return this.age;
    }

    /**
     * Gets the name of the dog.
     * @return The name of the dog.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Calculates and returns the age of the dog in "person years".
     * @return The age of the dog in person years.
     */
    public double calculateAgeINPersonYears() {
        return this.age * 7;
    }

    /**
     * Returns a string representation of the dog.
     * @return A string containing the name and age of the dog.
     */
    @Override
    public String toString() {
        return "Name of the dog: " + this.name + System.lineSeparator() +
                "Age of the dog: " + this.age;
    }
}

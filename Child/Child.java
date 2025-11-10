/* Suppose you have a class called Child with an instance data value called age.
Write a getter method and a setter method doe age.
*/

package Child;

/**
 * The Child class represents a child with an instance data value called age.
 */
public class Child {
    private double age;
    
    /**
     * Constructs a Child object with the given age.
     * @param age The age of the child.
     */
    public Child(double age) {
        this.age = age;
    }
    
    /**
     * Gets the age of the child.
     * @return The age of the child.
     */
    public double getAge() {
        return this.age;
    }
    
    /**
     * Sets the age of the child.
     * @param newAge The new age of the child.
     */
    public void setAge(double newAge) {
        this.age = newAge;
    }
}

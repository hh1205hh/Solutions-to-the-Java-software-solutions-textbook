/*
Write a class called Sphere that contains instance data that represents the sphere's diameter.
Define the Sphere constructor to accept and initialize the diameter, and include getter and
setter methods for the diameter. Include methods that calculate and return the volume
amd surface area of the sphere (See PP36 for the formulas).
Include a toString method that returns a one-line description of the sphere.
Create a driver class called MultiSphere , whose main method instantiates and
updates several Sphere objects  
*/

package Sphere;

/**
 * The Sphere class represents a sphere and provides methods to calculate its volume and surface area.
 */
public class Sphere {
    private double diameter;
    private double volume;
    private double surfaceArea;

    /**
     * Constructs a Sphere object with the specified diameter.
     *
     * @param diameter the diameter of the sphere
     */
    public Sphere(double diameter) {
        this.diameter = diameter;
        calculateVolumeSphere();
        calculateAreaSphere();
    }

    /**
     * Sets the diameter of the sphere.
     *
     * @param newDiameter the new diameter to set
     */
    public void setDiameter(double newDiameter) {
        this.diameter = newDiameter;
    }

    /**
     * Gets the diameter of the sphere.
     *
     * @return the diameter of the sphere
     */
    public double getDiameter() {
        return this.diameter;
    }

    /**
     * Calculates the volume of the sphere.
     */
    public void calculateVolumeSphere() {
        double radius = diameter / 2;
        this.volume = (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }

    /**
     * Calculates the surface area of the sphere.
     */
    public void calculateAreaSphere() {
        this.surfaceArea = 4 * Math.PI * Math.pow(this.diameter, 2);
    }

    /**
     * Gets the volume of the sphere.
     *
     * @return the volume of the sphere
     */
    public double getVolume() {
        return this.volume;
    }

    /**
     * Gets the surface area of the sphere.
     *
     * @return the surface area of the sphere
     */
    public double getArea() {
        return this.surfaceArea;
    }

    /**
     * Returns a string representation of the sphere.
     *
     * @return a string representation of the sphere
     */
    @Override
    public String toString() {
        return "Sphere with diameter: " + diameter + System.lineSeparator() +
                "Volume: " + volume + System.lineSeparator() +
                "Area: " + surfaceArea + System.lineSeparator();
    }
}

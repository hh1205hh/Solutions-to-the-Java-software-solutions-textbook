/*
Write a program that generates a random integer value (r) and height for a cylinder 
in the range 1 to 20, inclusive, and then computes the volume and surface area of the cylinder.
volume = pi * (r²) * h
Surface area = 2 * pi * r * h 
*/

package Random;

import java.util.Random;

public class PP39 {
    public static void main(String[] args) {
        final double PI = Math.PI;

        Random rand = new Random();

        // Generates random radius & height to the cylinder
        int radius = rand.nextInt(20) + 1;
        int height = rand.nextInt(20) + 1;

        // Calculating volume & surface area of the cylinder
        double cylinderVolume = PI * Math.pow(radius, 2) * height;
        double cylinderSurfaceArea = 2 * PI * radius * height;

        System.out.println("Random generated radius = " + radius);
        System.out.println("Random generated height = " + height);
        System.out.printf("The volume of the cylinder: %.3f %nThe surface area of the cylinder: %.3f", cylinderVolume, cylinderSurfaceArea);
    }
}

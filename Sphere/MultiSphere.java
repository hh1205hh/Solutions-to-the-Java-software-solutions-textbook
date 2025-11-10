package Sphere;

import java.util.Random;

/**
 * The MultiSphere class demonstrates the creation and manipulation of multiple Sphere objects.
 */
public class MultiSphere {
        public static void main(String[] args){
        Random rand = new Random();

        Sphere[] spheres = {new Sphere(10), 
                           new Sphere(15.5), 
                           new Sphere(20), 
                           new Sphere(52.5)};

        
        for (Sphere sphere : spheres) {
            System.out.println("Current diameter: " + sphere.getDiameter());
            System.out.println(sphere.toString());

            sphere.setDiameter(rand.nextDouble(100));
            System.out.println("After update: " + sphere.getDiameter());
            
            System.out.println(sphere.toString());
        }
    }
}

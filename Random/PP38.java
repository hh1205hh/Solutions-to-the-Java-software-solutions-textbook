/* 
Write a program that generates a random number in the range 20 to 40,
inclusive, and displays the sine, cosine, and tangent of that number.
*/

package Random;

import java.util.Random;

public class PP38 {
    public static void main(String[] args ){
        Random rand = new Random();

        // Create random number in the range 20 to 40
        int randomNumber = rand.nextInt(21) + 20;

        // Convert random number to radius
        double randomRadius = Math.toRadians(randomNumber);

        // Finding the sin, cos, tan to this random number
        double sineRandomNumber = Math.sin(randomRadius);
        double cosineRandomNumber = Math.cos(randomRadius);
        double tangentRandomNumber = Math.tan(randomRadius);

        System.out.printf("Random number: %d %n", randomNumber);
        System.out.printf("Sine = %.3f %nCosine = %.3f %nTangent = %.3f", sineRandomNumber, cosineRandomNumber, tangentRandomNumber);
    }
}

package Exercises;

import java.awt.Color;
import java.util.Random;

public class exercise45_49 {
    public static void main(String[] args) {
        // exercise41 test = new exercise41();
    }

    // Write a method called Lyrics that prints the lyrics of a song when invoked.
    //The method should accept no parameters and return no value
    public void Lyrics() {
        String lyrics;
        String songName;

        songName = "Name";
        lyrics = "Trying my best";
        System.out.printf("Song name: %s %nLyrics of the song: %s", songName, lyrics);
    }

    // Write a method called cube that accept on integer parameter and returns that 
    // value raised to the third power.
    public double cube(double number) {
        // Calculating the number in the third power
        double result = Math.pow(number, 3);
        return result;
    }

    // Write a method called random100 that returns a random integer 
    // in the range of 1 to 100 (inclusive)
    public int random100() {
        Random rand = new Random();

        // Create random number in the range 1 to 100 and return it
        int randomNUmber = rand.nextInt(101);
        return randomNUmber;
    }

    // Write a method called randomRange that accept two integer parameters representing a range.
    // The method should return a random integer in the specified range (inclusive).
    // Assume that the first parameter is greater than the second.
    public int randomRange(int firstNum, int secondNum) {
        Random rand =  new Random();
        int randomNum;

        if (secondNum > firstNum) {
            randomNum = rand.nextInt(secondNum  - firstNum + 1) + firstNum;
        } else {
            randomNum  = rand.nextInt(firstNum - secondNum + 1) + secondNum;
        }
        return randomNum;
        }

        // Write a method called randomColor that creates and returns
        // a Color object that represents a random color.
        // Recall that a Color object can be defined by three integer values between 0 and 255, 
        // representing the contributions of red, green, and blue (its RGB values).
        public static Color RandomColor() {
            Random rand = new Random();

            int red = rand.nextInt(256);
            int green = rand.nextInt(256);
            int blue = rand.nextInt(256);

            System.out.println("Red: " + red);
            System.out.println("Green: " +green);
            System.out.println("Blue: " + blue);

            Color randomColor = new Color(red, green, blue);
            System.out.println("Random color: " + randomColor);

            return randomColor;
        }
}
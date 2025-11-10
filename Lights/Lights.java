/* Write a class called Bulb that represents a light bulb that can be turned on and off
Create a driver class called Lights whose main method instantiates and turns on some Bulb objects
*/

package Lights;

public class Lights {
    public static void main(String[] args) {

        Bulb[] bulbs = {new Bulb(false), 
                        new Bulb(true),
                        new Bulb(true),
                        new Bulb(false),
                        new Bulb(true) };

        for (Bulb bulb : bulbs) {
            bulb.isOnOrOff();
        }
    }   
}

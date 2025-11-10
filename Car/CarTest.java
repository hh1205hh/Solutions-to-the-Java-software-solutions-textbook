package Car;

/**
 * The CarTest class is a driver class used to test the functionality of the Car class.
 * It instantiates several Car objects with random year of manufacture and prints their details.
 */
import java.util.Random;

public class CarTest {
    public static void main(String[] args) {
        Random random = new Random();

        Car[] cars = {new Car("Mercedes", "Chinese", random.nextInt(80) + 1950), 
                      new Car("Ford", "Israel", random.nextInt(80) + 1950), 
                      new Car("Toyota", "Chinese", random.nextInt(80) + 1950)};

        int countObjects = 0;

        for (Car car : cars) {
            countObjects++;
            System.out.println(car);
        }

        System.out.println("Count of car objects have created: " + countObjects);
    }
}

package Dog;

public class Kennel {
    public static void main(String[] args) {
        Dog[] dogs = {
            new Dog("Rex", 6),
            new Dog("Buddy", 4),
            new Dog("Max", 3.6),
            new Dog("Bailey", 8),
            new Dog("Charlie", 5.5)};

            for (Dog dog : dogs) {
                System.out.println(dog);
                System.out.println("Dog's years as person's years: " + dog.calculateAgeINPersonYears() + "\n");
            }
    }
}

package Box;

/**
 * The BoxTest class is a driver class that instantiates and updates several Box objects.
 */
public class BoxTest {
    public static void main(String[] args) {
        Box[] boxes =  {new Box(10, 12.5, 17, false),
                        new Box(5, 16.5, 18.9, true),
                        new Box(10.4, 15, 30, false)};

        int countObjects = 0;

        for (Box box : boxes) {
            System.out.println(box);
            countObjects++;
        }
        System.out.println("Number of box objects have created: " + countObjects);
     }
}

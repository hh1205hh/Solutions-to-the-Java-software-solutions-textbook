package GUI.DinerMeal;

import javax.swing.JFrame;

public class DinerMain {
        public static void main(String[] args) {

        Diner[] diners = {
            new Diner("Alice", "female", 50, 50),
            new Diner("Bob", "male", 100, 100),
            new Diner("Charlie", "male", 150, 150),
            new Diner("Diana", "female", 200, 200)
        };

        // Set the frame to display the diners
        JFrame frame = new JFrame("Party dinner");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Display the frame with the provided data
        SeatingChart chart = new SeatingChart(diners);
        frame.add(chart);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}

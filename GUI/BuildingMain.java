package GUI;

import java.awt.FlowLayout;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BuildingMain {
    /**
     * The main method creates a JFrame and adds buildings to represent a skyline.
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Skyline");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel skyline = new JPanel(new FlowLayout());
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int width = random.nextInt(200) + 100;
            int height = random.nextInt(300) + 200;
            Building building = new Building(width, height);
            skyline.add(building);
        }

        frame.add(skyline);
        frame.pack();
        frame.setVisible(true);
    }
}

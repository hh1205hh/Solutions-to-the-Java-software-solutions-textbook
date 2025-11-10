/*
Write a class called Building that represents a graphical depiction of a building.
Allow the parameters to the constructor to specify the building's width and height.
Each building should be colored black and should contain a few random windows of yellow.
Create a program that draws a random skyline(קו רקיע) of building
*/

package GUI;

import java.awt.*;
import javax.swing.*;
import java.util.Random;

/**
 * Represents a building with randomly generated colors and windows.
 */
public class Building extends JPanel {
    private int width;
    private int height;

    /**
     * Constructs a building with the specified width and height.
     * @param width The width of the building.
     * @param height The height of the building.
     */
    public Building(int width, int height) {
        this.width = width;
        this.height = height;
        setPreferredSize(new Dimension(this.width, this.height));
    }

    /**
     * Generates a random color.
     * @return A randomly generated Color object.
     */
    private Color generateRandomColor() {
        Random rand = new Random();
        int red = rand.nextInt(256);
        int green = rand.nextInt(256);
        int blue = rand.nextInt(256);
        return new Color(red, green, blue);
    }

    /**
     * Overrides the paintComponent method to draw the building.
     * @param g The Graphics object used for drawing.
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(generateRandomColor());
        g.fillRect(0, 0, this.width, this.height);

        Random rand = new Random();
        g.setColor(generateRandomColor());

        for (int i = 0; i != 4; i++) {
            int windowWidth = rand.nextInt(50) + 20;
            int windowHeight = rand.nextInt(50) + 20;
            int x = rand.nextInt(this.width - windowWidth);
            int y = rand.nextInt(this.height - windowHeight);
            g.fillRect(x, y, windowWidth, windowHeight);
        }
    }
}

/*
Write a program that displays a graphical seating chart for a dinner party.
Create a class called Diner (as in one who dines) 
that stores the person's name, gender, and location at the dinner table.
A diner is graphically represented as a circle, 
color-coded by gender, with the person's name printed in the circle.
*/

package GUI.DinerMeal;

import java.awt.*;

/**
 * Represents a diner with a name, gender, and position.
 */
public class Diner {
    private String name;
    private String gender;
    private int x, y;

    /**
     * Constructs a diner with the specified name, gender, and position.
     * @param name The name of the diner.
     * @param gender The gender of the diner (male or female).
     * @param x The x-coordinate of the diner's position.
     * @param y The y-coordinate of the diner's position.
     */
    public Diner(String name, String gender, int x, int y) {
        this.name = name;
        this.gender = gender;
        this.x = x;
        this.y = y;
    }

    /**
     * Draws the diner on the graphics context.
     * If gender is male, the diner is drawn in blue color; otherwise, it is drawn in pink.
     * @param g The graphics context.
     */
    public void draw(Graphics g) {
        if (gender.equalsIgnoreCase("male")) {
            g.setColor(Color.BLUE);
        } else if (gender.equalsIgnoreCase("female")) {
            g.setColor(Color.PINK);
        } else {
            g.setColor(Color.GRAY);
        }

        // Draw the circle representing the diner
        g.fillOval(x, y, 50, 50);
        g.setColor(Color.BLACK);
        g.drawString(name, x + 5, y + 17);
    }
}

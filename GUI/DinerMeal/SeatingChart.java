package GUI.DinerMeal;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * Represents a seating chart displaying diners at their positions.
 */
public class SeatingChart extends JPanel {
    private Diner[] diners;

    /**
     * Constructs a seating chart with the specified list of diners.
     * @param diners The array of diners to be displayed.
     */
    public SeatingChart(Diner[] diners) {
        this.diners = diners;
    }

    /**
     * Paints the seating chart by drawing each diner.
     * @param g The graphics context.
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Diner diner : diners) {
            diner.draw(g);
        }
    }
}


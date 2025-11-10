package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Represents a panel containing a box of crayons to be displayed in a graphical user interface.
 */
class Crayon {
    private Color color;
    private int length;

    /**
     * Constructs a crayon with the specified color and length.
     * @param color The color of the crayon.
     * @param length The length of the crayon.
     */
    public Crayon(Color color, int length) {
        this.color = color;
        this.length = length;
    }

    /**
     * Gets the color of the crayon.
     * @return The color of the crayon.
     */
    public Color getColor() {
        return color;
    }

    /**
     * Gets the length of the crayon.
     * @return The length of the crayon.
     */
    public int getLength() {
        return length;
    }
}

/**
 * Represents a panel containing a box of crayons.
 */
public class CrayonBox extends JPanel {
    private static final int BOX_WIDTH = 300;
    private static final int BOX_HEIGHT = 100;
    private static final int CRAYON_WIDTH = 30;
    private static final int CRAYON_HEIGHT = 80;

    private Crayon[] crayons;

    /**
     * Constructs a CrayonBox panel with default crayons.
     */
    public CrayonBox() {
        crayons = new Crayon[]{
                new Crayon(Color.RED, 70),
                new Crayon(Color.BLUE, 60),
                new Crayon(Color.GREEN, 50),
                new Crayon(Color.YELLOW, 40),
                new Crayon(Color.ORANGE, 30)
        };

        setPreferredSize(new Dimension(BOX_WIDTH, BOX_HEIGHT));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x = 20; // Initial x-coordinate for the first crayon

        for (Crayon crayon : crayons) {
            g.setColor(crayon.getColor());
            g.fillRect(x, 10, CRAYON_WIDTH, CRAYON_HEIGHT);
            g.setColor(Color.BLACK);
            g.drawRect(x, 10, CRAYON_WIDTH, CRAYON_HEIGHT);
            x += CRAYON_WIDTH + 10; // Move x-coordinate for the next crayon
        }
    }
}

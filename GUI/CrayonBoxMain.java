package GUI;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class CrayonBoxMain {
        public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Crayon Box");
            CrayonBox crayonBox = new CrayonBox();
            frame.add(crayonBox);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}

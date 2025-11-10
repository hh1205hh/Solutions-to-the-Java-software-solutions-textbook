package GUI.PushButton;

import java.awt.event.*;
import javax.swing.*;
public class PushMain {
    public static void main(String[] args) {

        // Create frame for display the screen
        JFrame frame = new JFrame("Push counter");
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        Push pushPanel = new Push();
        frame.getContentPane().add(pushPanel);

        frame.pack();
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() { // Add window listener for the frame
            @Override
            public void windowClosing(WindowEvent e) { // Define behavior when window is closing
                System.out.println("Count: " + pushPanel.counter.getCount()); // Print count before closing
                frame.dispose();
            }
        });
    }  
}

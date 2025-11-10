/*
Write a class called Counter that represents a simply tally counter (מונה מספרים),
which might be used to count people as they enter a room.
The counter class should contain a single integer as instance data,
representing the count. Write a constructor to initialize the count to zero.
Write a method called Click that increment the count and another method called 
getCount that returns the current count.
Include a method called reset that resets the counter to zero.
Finally, create a driver class called CounterTest that creates two
Counter objects and tests their methods
*/

package GUI.PushButton;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Push extends JPanel {
    private int count;
    private JButton push;
    private JLabel label;
    Counter counter;

    public Push() {
        count = 0;
        counter = new Counter();

        // Display text to push until it pushed
        push = new JButton("Push me!");
        push.addActionListener(new ButtonListener());

        // Display how many pushes the user did
        label = new JLabel("Pushes: " + count);

        // Add the text to push and the current pushes
        add(push);
        add(label);

        // Define size & color of the frame
        setPreferredSize(new Dimension(300, 50));
        setBackground(Color.cyan);
    }

    // Listener wait from push form the user, when it happens Count increase in 1 
    private class ButtonListener implements ActionListener {
        
        public void actionPerformed(ActionEvent event) {
            counter.Click();
            label.setText("Pushes: " + counter.getCount());
        }
    }
} 

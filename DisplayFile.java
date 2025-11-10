import java.io.*;
import java.util.Scanner;
import javax.swing.*;

public class DisplayFile {
    public static void main(String[] args) throws FileNotFoundException {
        // Create a frame to display the information
        JFrame frame = new JFrame("Display file:");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // set the size of the text area 
        JTextArea ta = new JTextArea(30, 80);
        JFileChooser fileChooser = new JFileChooser();

        int status = fileChooser.showOpenDialog(null);

        // Display the message when no file has been chosen
        if (status != JFileChooser.APPROVE_OPTION) {
            ta.setText("No file chosen.");
        } else {
            // Get the file that contains the details
            File file = fileChooser.getSelectedFile();
            Scanner scanner = new Scanner(file);

            // Add that information into the text area 
            StringBuilder information = new StringBuilder();
            while (scanner.hasNextLine()) {
                information.append(scanner.nextLine()).append("\n");
            }

            ta.setText(information.toString());
            scanner.close();
        }
        
        frame.getContentPane().add(new JScrollPane(ta)); // Add JScrollPane to support large files
        frame.pack();
        frame.setVisible(true);
    }
}
 
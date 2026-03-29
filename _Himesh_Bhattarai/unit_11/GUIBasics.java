// Unit 11: GUI - Swing Components Basic
// Concept: Create graphical user interface with buttons, labels, text fields

import javax.swing.*;
import java.awt.*;;

public class GUIBasics extends JFrame {

    // Constructor to setup GUI
    public GUIBasics() {
        // Set title
        setTitle("Java GUI Application");

        // Set default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set size of window
        setSize(400, 300);

        // Create a panel (container for components)
        JPanel panel = new JPanel();

        // Add label
        JLabel label = new JLabel("Welcome to Java GUI!");
        label.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(label);

        // Add text field
        JTextField textField = new JTextField("Enter your name", 15);
        panel.add(textField);

        // Add button
        JButton button = new JButton("Click Me!");
        button.setFont(new Font("Arial", Font.PLAIN, 14));
        panel.add(button);

        // Add combo box
        JComboBox<String> comboBox = new JComboBox<String>();
        comboBox.addItem("Option 1");
        comboBox.addItem("Option 2");
        comboBox.addItem("Option 3");
        panel.add(comboBox);

        // Add panel to frame
        add(panel);

        // Make window visible
        setVisible(true);
    }

    public static void main(String[] args) {
        System.out.println(" GUI BASICS ");
        System.out.println("Creating Swing GUI window...");
        System.out.println("Components: Label, TextField, Button, ComboBox");
        System.out.println("Close the window to exit.\n");

        // Create GUI window
        new GUIBasics();
    }
}

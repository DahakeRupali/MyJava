package Frame;

import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class HelloworldSwings {
    public static void main(String[] args) {
        // Create a new frame (window)
        JFrame frame = new JFrame("Hello World Swing Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400); // Width: 300, Height: 200
        frame.setLocation(100, 150); // x, y from top-left of screen
        frame.setLayout(new FlowLayout()); // or BorderLayout, GridLayout, etc.
        frame.setResizable(true); // Prevent window resizing

        // Create a label with text
        JLabel label = new JLabel("Hello, World!", SwingConstants.CENTER);
        
        // method 1
        frame.add(label);

        // Add the label to the frame method 2
        //frame.getContentPane().add(label);

        // Make the frame visible
        frame.setVisible(true);
    }
}

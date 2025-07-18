package Frame;

import java.awt.Color;

import javax.swing.*;



import java.awt.*;
import javax.swing.*;

public class DemoFrame {
    public static void main(String[] args) {

        JFrame frame = new JFrame("My First Frame");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Set layout so multiple components can be added
        frame.setLayout(new FlowLayout());

        // Set background color of the frame's content area
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);

        // Label with color
        JLabel label = new JLabel("Hello, Welcome to My Colorful Frame!");
        label.setForeground(Color.BLUE);
        frame.add(label);

        // Button with color
        JButton button = new JButton("Click Me");
        button.setBackground(Color.GREEN);
        button.setForeground(Color.WHITE);
        frame.add(button);

        // Text field
        JTextField textField = new JTextField(20);
        frame.add(textField);

        frame.setVisible(true);
    }
}

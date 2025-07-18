package Frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Form");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Enter name:");
        JTextField textField = new JTextField(15);
        JButton button = new JButton("Say Hello");

        button.addActionListener(e -> {
            String name = textField.getText();
            JOptionPane.showMessageDialog(frame, "Hello " + name + "!");
        });

        frame.add(label);
        frame.add(textField);
        frame.add(button);
        frame.setVisible(true);
    }
}

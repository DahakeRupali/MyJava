package Frame;

import javax.swing.*;
import java.awt.event.*;

public class SimpleUnitConverter {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Simple Unit Converter");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Input label and field
        JLabel inputLabel = new JLabel("Value:");
        inputLabel.setBounds(20, 20, 50, 25);
        frame.add(inputLabel);

        JTextField inputField = new JTextField();
        inputField.setBounds(80, 20, 150, 25);
        frame.add(inputField);

        // Combo boxes for units
        String[] units = {"Meter", "Kilometer"};
        JComboBox<String> fromUnit = new JComboBox<>(units);
        fromUnit.setBounds(20, 60, 100, 25);
        frame.add(fromUnit);

        JComboBox<String> toUnit = new JComboBox<>(units);
        toUnit.setBounds(130, 60, 100, 25);
        frame.add(toUnit);

        // Convert button
        JButton convertButton = new JButton("Convert");
        convertButton.setBounds(80, 100, 100, 30);
        frame.add(convertButton);

        // Result label
        JLabel resultLabel = new JLabel("Result: ");
        resultLabel.setBounds(20, 140, 250, 25);
        frame.add(resultLabel);

        // Button action
        convertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double input = Double.parseDouble(inputField.getText());
                    String from = (String) fromUnit.getSelectedItem();
                    String to = (String) toUnit.getSelectedItem();
                    double result = 0;

                    if (from.equals("Meter") && to.equals("Kilometer")) {
                        result = input / 1000;
                    } else if (from.equals("Kilometer") && to.equals("Meter")) {
                        result = input * 1000;
                    } else {
                        result = input; // same units
                    }

                    resultLabel.setText("Result: " + result);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid number input");
                }
            }
        });

        frame.setVisible(true);
    }
}

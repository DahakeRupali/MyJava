package Frame;

import javax.swing.*;
import java.awt.event.*;

public class CheckboxDemo{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Demo Class Selection");
        frame.setSize(350, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Radio buttons for class time
        JRadioButton r1 = new JRadioButton("10:00 AM");
        r1.setBounds(50, 30, 100, 30);
        JRadioButton r2 = new JRadioButton("2:00 PM");
        r2.setBounds(50, 60, 100, 30);
        JRadioButton r3 = new JRadioButton("5:00 PM");
        r3.setBounds(50, 90, 100, 30);

       ButtonGroup timeGroup = new ButtonGroup();
       timeGroup.add(r1);
       timeGroup.add(r2);
        timeGroup.add(r3);

        // Checkbox for reminder
        JCheckBox reminderCheck = new JCheckBox("Send me a reminder");
        reminderCheck.setBounds(50, 120, 200, 30);

        // Confirm button
        JButton confirmBtn = new JButton("Confirm");
        confirmBtn.setBounds(100, 160, 100, 30);

        // Result label
        JLabel resultLabel = new JLabel("");
        resultLabel.setBounds(50, 200, 250, 30);

        // Action on confirm
        confirmBtn.addActionListener(e -> {
            String selectedTime = null;
            if (r1.isSelected()) selectedTime = "10:00 AM";
            else if (r2.isSelected()) selectedTime = "2:00 PM";
            else if (r3.isSelected()) selectedTime = "5:00 PM";

            if (selectedTime == null) {
                resultLabel.setText("Please select a class time.");
            } else {
                String message = "Selected: " + selectedTime;
                if (reminderCheck.isSelected()) {
                    message += "(Reminder set)";
                }
                resultLabel.setText(message);
            }
        });

        // Add components
        frame.add(r1);
        frame.add(r2);
        frame.add(r3);
        frame.add(reminderCheck);
        frame.add(confirmBtn);
        frame.add(resultLabel);

        frame.setVisible(true);
    }
}

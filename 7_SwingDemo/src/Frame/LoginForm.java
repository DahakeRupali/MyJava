package Frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginForm {
    public static void main(String[] args) {
        // Create a new frame
        JFrame frame = new JFrame("Login Form");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Using absolute positioning

        // Username label and text field
        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 30, 80, 25);
        frame.add(userLabel);

        JTextField userText = new JTextField();
        userText.setBounds(140, 30, 150, 25);
        frame.add(userText);

        // Password label and password field
        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(50, 70, 80, 25);
        frame.add(passLabel);

        JPasswordField passText = new JPasswordField();
        passText.setBounds(140, 70, 150, 25);
        frame.add(passText);

        // Login button
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(140, 110, 80, 25);
        loginButton.setBackground(Color.MAGENTA);
        loginButton.setFocusPainted(false);
        frame.add(loginButton);

        // Action listener for button
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText();
                String password = new String(passText.getPassword());

                // Dummy check (username: admin, password: admin123)
                if (username.equals("admin") && password.equals("admin123")) {
                    JOptionPane.showMessageDialog(frame, "Login successful!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid username or password.");
                }
            }
        });

        // Show frame
        frame.setVisible(true);
    }
}

package Frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MiniSwingDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mini Demo");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Menu bar and item
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem helloItem = new JMenuItem("Say Hello");
        fileMenu.add(helloItem);
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);

        // Toggle Button
        JToggleButton toggle = new JToggleButton("OFF");
        toggle.addItemListener(e -> {
            toggle.setText(toggle.isSelected() ? "ON" : "OFF");
        });

        // Progress Bar
        JProgressBar progressBar = new JProgressBar(0, 100);
        progressBar.setValue(70); // Set 50% filled
        progressBar.setStringPainted(true);

        // Menu item action
        helloItem.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Hello from Menu!"));

        // Layout
        frame.setLayout(new FlowLayout());
        frame.add(toggle);
        frame.add(progressBar);
        frame.setVisible(true);
    }
}


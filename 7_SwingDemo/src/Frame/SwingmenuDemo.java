package Frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingmenuDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Download Simulator");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Menu with Exit
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(e -> System.exit(0));
        menu.add(exitItem);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        // ToggleButton to start/stop download
        JToggleButton toggle = new JToggleButton("Start Download");

        // Progress bar
        JProgressBar progressBar = new JProgressBar(0, 100);
        progressBar.setValue(0);
        progressBar.setStringPainted(true);

        // Toggle action
        toggle.addActionListener(e -> {
            if (toggle.isSelected()) {
                toggle.setText("Downloading...");
                new Timer(50, new ActionListener() {
                    int progress = 0;
                    public void actionPerformed(ActionEvent evt) {
                        if (progress < 100 && toggle.isSelected()) {
                            progress++;
                            progressBar.setValue(progress);
                        } else {
                            ((Timer) evt.getSource()).stop();
                            toggle.setSelected(false);
                            toggle.setText("Start Download");
                        }
                    }
                }).start();
            } else {
                toggle.setText("Start Download");
            }
        });

        // Layout
        frame.setLayout(new FlowLayout());
        frame.add(toggle);
        frame.add(progressBar);
        frame.setVisible(true);
    }
}


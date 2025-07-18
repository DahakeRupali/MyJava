package Frame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.PublicKey;

public class calculator {
    private static final String Public = null;

	public static void main(String[] args) {
    
        // Create a frame
        JFrame frame = new JFrame("Calculator");
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Create text field
        JTextField textField = new JTextField();
        textField.setEditable(false);
        frame.add(textField, BorderLayout.NORTH);

        // Create button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));
        
        // Define buttons
        String[] buttons = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", "C", "=", "+"};
        JButton[] buttonArray = new JButton[buttons.length];
        
        // Add buttons to panel
        for (int i = 0; i < buttons.length; i++) {
            buttonArray[i] = new JButton(buttons[i]);
            buttonPanel.add(buttonArray[i]);
        }
        
        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.setVisible(true);

        // Event Handling
        ActionListener buttonListener = new ActionListener() {
            private String operator = "";
            private double num1 = 0;
            private boolean isNewInput = true;

            @Override
            public void actionPerformed(ActionEvent e) {
                String command = e.getActionCommand();
                if (command.matches("[0-9]") || command.equals(".")) {
                    if (isNewInput) {
                        textField.setText(command);
                        isNewInput = false;
                    } else {
                        textField.setText(textField.getText() + command);
                    }
                } else if (command.matches("[+\\-*/]")) { // Fixed escape sequence
                    num1 = Double.parseDouble(textField.getText());
                    operator = command;
                    isNewInput = true;
                } else if (command.equals("=")) {
                    double num2 = Double.parseDouble(textField.getText());
                    double result = 0;
                    switch (operator) {
                        case "+": result = num1 + num2; break;
                        case "-": result = num1 - num2; break;
                        case "*": result = num1 * num2; break;
                        case "/": result = num2 != 0 ? num1 / num2 : Double.NaN; break;
                    }
                    textField.setText(String.valueOf(result));
                    isNewInput = true;
                } else if (command.equals("C")) {
                    textField.setText("");
                    num1 = 0;
                    operator = "";
                    isNewInput = true;
                }
            }
        };
        
        // Add event listener to buttons
        for (JButton button : buttonArray) {
            button.addActionListener(buttonListener);
        }
    }
}

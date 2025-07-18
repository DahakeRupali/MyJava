package Frame;

import java.awt.FlowLayout;

import javax.swing.*;

public class Frame_textboxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a new frame
        JFrame frame = new JFrame("Text Box Example");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());
        
        // Create Lable
        JLabel label= new JLabel("Enter Name: ");
        frame.add(label);

        // Create a text field
        JTextField textField = new JTextField(20);
        
        // Add the text field to the frame
        frame.add(textField);
        
        // Create Lable 2
        JLabel mob= new JLabel("Enter Mobile: ");
        frame.add(mob);

        // Create a text field
        JTextField textField1= new JTextField(20);
        
        // Add the text field to the frame
        frame.add(textField1);
        
        
        // Add button
        JButton b1=new JButton(" OK");
        frame.add(b1);
      
        
        // Make the frame visible
        frame.setVisible(true);

	}

}

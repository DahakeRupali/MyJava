package Frame;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Frame_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a new frame
        JFrame frame = new JFrame("Calculaor");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
       // frame.setLayout(new BorderLayout());
        
              
        JPanel buttonpanel=new JPanel();
        buttonpanel.setLayout(new GridLayout(4,4));
        JButton b0= new JButton("0");buttonpanel.add(b0);
        JButton b1= new JButton("1"); buttonpanel.add(b1);
        JButton b2= new JButton("2");buttonpanel.add(b2);
        JButton b3= new JButton("3");buttonpanel.add(b3);
        JButton b4= new JButton("4");buttonpanel.add(b4);
        JButton b5= new JButton("5");buttonpanel.add(b5);
        JButton b6= new JButton("6");buttonpanel.add(b6);
        JButton b7= new JButton("7");buttonpanel.add(b7);
        JButton b8= new JButton("8");buttonpanel.add(b8);
        JButton b9= new JButton("9");buttonpanel.add(b9);
        JButton b10= new JButton("+");buttonpanel.add(b10);
        JButton b11= new JButton("-");buttonpanel.add(b11);
        JButton b12= new JButton("*");buttonpanel.add(b12);
        JButton b13= new JButton("/");buttonpanel.add(b13);
        JButton b14= new JButton("C");buttonpanel.add(b14);
        JButton b15= new JButton("=");buttonpanel.add(b15);
        
        // Create a text field
        JTextField textField = new JTextField();
        textField.setEditable(false);
        frame.add(textField, BorderLayout.NORTH); // Add text field to frame  
                 
        // Make the frame visible
        frame.add(buttonpanel);
        frame.setVisible(true);
        
        // // Event Handling
        addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) 
            {
            	 String input = e.getActionCommand();
            	 if (input.matches("[0-9]")) 
            	 {
                     
                         textField.setText(input);
                         
                     }
             
            }
        });
      
	}

	private static void addActionListener(ActionListener actionListener) {
		// TODO Auto-generated method stub
		
	}

}

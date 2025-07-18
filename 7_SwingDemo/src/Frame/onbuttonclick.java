package Frame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class onbuttonclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame=new JFrame("Button Event");
		frame.setSize(500,500);
		
		JButton button =new JButton("Click");
		button.setBackground(Color.PINK);
		frame.add(button);
				//Add action listener to button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Display button label
                JOptionPane.showMessageDialog(button, "Thank You", e.getActionCommand(), 3, null);;
            }
        });
		
      frame.setVisible(true);
	}
	

}

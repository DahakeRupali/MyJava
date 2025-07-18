package Frame;

import javax.swing.table.DefaultTableModel;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class BillToDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create Frame
		JFrame frame=new JFrame("Bill Entry Form");
		frame.setSize(500, 550);
		
		 // Define Table Column Headers
        String[] col = {"Bill_Id", "Bill Date", "Customer Name"};
        DefaultTableModel tableModel = new DefaultTableModel(col, 0);
        JTable table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.CENTER);
		
		// Input Fields Panel
        JPanel inputPanel = new JPanel(new GridLayout(3, 2));
        JLabel lblId = new JLabel("Bill ID:");
        JTextField txtId = new JTextField();
        JLabel lblDate = new JLabel("Bill Date:");
        JTextField txtDate = new JTextField();
        JLabel lblName = new JLabel("Customer Name:");
        JTextField txtName = new JTextField();
        
        inputPanel.add(lblId);
        inputPanel.add(txtId);
        inputPanel.add(lblDate);
        inputPanel.add(txtDate);
        inputPanel.add(lblName);
        inputPanel.add(txtName);
        frame.add(inputPanel, BorderLayout.NORTH);
		
				     
        // Create "Add Record" Button
        JButton addButton = new JButton("Add Record");
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        frame.add(buttonPanel, BorderLayout.SOUTH); // Add button at the bottom
        
        
        frame.setVisible(true);
        
        // Add Button Click Event
        addButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String billId = txtId.getText();
                String billDate = txtDate.getText();
                String customerName = txtName.getText();
				System.err.println(" Record Entered");
				
				// Add to Table
                tableModel.addRow(new Object[]{billId, billDate, customerName});
				
				
			}
		});
        
	}

}

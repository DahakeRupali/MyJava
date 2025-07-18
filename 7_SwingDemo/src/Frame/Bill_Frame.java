package Frame;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.sql.Date;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Bill_Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame= new JFrame(" BillForamt");
		frame.setSize(500,500);

		//String[] col= {"Bill_Id", "Bill Date","Customer Id"};
		//Object[][] row= {{"101", "21 March","Suraj"},{"120","23 AMrch","SEEMA"}};
		String[] columns = {"Bill Id", "Customer Name", "Bill Date"};
		
		DefaultTableModel tableModel = new DefaultTableModel(columns, 0);
		JTable table= new JTable(tableModel);
	
		// Add table inside a JScrollPane
        JScrollPane scrollPane = new JScrollPane(table);

        // Add ScrollPane to Frame
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setVisible(true);
        
        String dbPath = "C:/Users/91996/OneDrive/Documents/MyDB.accdb"; // Change this to your actual path
        String url = "jdbc:ucanaccess://" + dbPath;
        
      //Create Connection
        
        // Connection and statement initialization
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        
        try {
            //Step 1:  Connect to the Access database---is used to establish a session with the database.
            conn = DriverManager.getConnection(url);
          
            System.out.println(" Connection Successful");
            
          //Step 2 -is used to send SQL queries to the database.
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM Bill");
             System.out.println("Data Retrived");
             
          // Process the result set
             while (rs.next()) {
                 // Assuming Bill table has 'id' and 'name' columns
                 int id = rs.getInt("id");
                 String name = rs.getString("CustomerName");
                 Date dt=rs.getDate("BillDate");
                 tableModel.addRow(new Object[]{id,name,dt});
                 System.out.println("BILL_ID: " + id + ",Customer Name: " + name +"Bill Date"+ dt);
             }
			
            
        }      
             catch (SQLException e) 
             {
                 e.printStackTrace();
             }
             finally
             {
                 // Close resources
                 try {
                     if (rs != null) rs.close();
                     if (stmt != null) stmt.close();
                     if (conn != null) conn.close();
                 } catch (SQLException e) {
                     e.printStackTrace();
                 }
	}

}}
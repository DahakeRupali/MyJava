package s;

import java.sql.*;

public class CRUD_Operations {
	
	
	public static void main(String[] args) {
		
		String dpath="C:/Users/91996/OneDrive/Documents/MyDB.accdb";
		String url="jdbc:ucanaccess://" +dpath;
		
		//Create Connection
		try {
			Connection con= DriverManager.getConnection(url);
			
			System.out.println("Connection Done ");
			Statement st= con.createStatement();
			
			
						
			//Insert Record in Table
			 String inQuery = "INSERT INTO Stud (ID, Name) VALUES (121, 'John Doe')";
	            int insertResult = st.executeUpdate(inQuery);
	            System.out.println("Rows inserted: " + insertResult);
	            
	            // --- Update Operation ---
	            String updateQuery = "UPDATE Stud SET Name = 'Jane KONNS' WHERE ID = 1";
	            int updateResult = st.executeUpdate(updateQuery);
	            System.out.println("Rows updated: " + updateResult);

	            // --- Delete Operation ---
	            String deleteQuery = "DELETE FROM Stud WHERE ID = 2";
	            int deleteResult = st.executeUpdate(deleteQuery);
	            System.out.println("Rows deleted: " + deleteResult);
	            
	            
	            
	            ResultSet rs=st.executeQuery("Select *from Stud");
		            
	            
	            while (rs.next()) {
	                 // Assuming 'stud' table has 'id' and 'name' columns
	                 int id = rs.getInt("id");
	                 String name = rs.getString("name");
	                 
	                 System.out.println("ID: " + id + ", Name: " + name);
	             }
	         
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}}


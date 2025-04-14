package s;
import java.sql.*;

public class JDBC {
    public static void main(String[] args) {
        // Database file location
    	
    	// Go to Database Rightclick on DB copy  
    //	jdbc:mysql:// for MySQL
    	//	jdbc:oracle:thin:// for Oracle
    		//jdbc:ucanaccess:// for Microsoft Access via UCanAccess
    	
    	
        String dbPath = "C:/Users/91996/OneDrive/Documents/MyDB.accdb"; // Change this to your actual path
        String url = "jdbc:ucanaccess://" + dbPath;

//        // SQL query to fetch data from the "stud" table
//        String query = "SELECT * FROM stud";

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
            rs = stmt.executeQuery("SELECT * FROM Stud");
             System.out.println("Data Retrived");
             
          // Process the result set
             while (rs.next()) {
                 // Assuming 'stud' table has 'id' and 'name' columns
                 int id = rs.getInt("id");
                 String name = rs.getString("name");
                 
                 System.out.println("ID: " + id + ", Name: " + name);
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
    }
}

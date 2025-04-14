import java.util.Scanner;

public class Demo_EXceHandling {
    public static void main(String[] args) {
        String str; // Null reference
        
        System.out.println("Enter String");
    	Scanner sc= new Scanner(System.in);
    	
    	str=sc.next();
    	if ("null".equalsIgnoreCase(str)) {
            str = null;
        }

    	 try {
             if (str == null) 
             {
                 System.out.println("String Length: " + str.length());
             } 
         } 
        
        catch (NullPointerException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        } 
        
        finally {
            System.out.println("Execution completed.");
        }
    }
}


public class demo_Excep {
    public static void main(String[] args) {
        try {
            // Attempt to divide by zero
            int num1 = 45454654610;
            int num2 = 1230;
            int result = num1 + num2; // This will cause an exception
            System.out.println("Result: " + result);
            
        } catch (ArithmeticException e) {
            // Handling division by zero
            System.out.println("Error: Cannot divide by zero!......."+ e.getMessage());
        } 
        finally 
        {
            // This block always executes
            System.out.println("Execution completed.");
        }
    }
}

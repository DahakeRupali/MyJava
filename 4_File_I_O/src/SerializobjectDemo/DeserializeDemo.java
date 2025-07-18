package SerializobjectDemo;

import java.io.*;

public class DeserializeDemo {
    public static void main(String[] args) {
        try {
            // Step 1: Create file input stream for employee.ser
            FileInputStream fileIn = new FileInputStream("employee.ser");

            // Step 2: Create object input stream to read the object
            ObjectInputStream objIn = new ObjectInputStream(fileIn);

            // Step 3: Read the object and cast it back to Employee
            Employee emp = (Employee) objIn.readObject();

            // Step 4: Use the object
            System.out.println("Deserialized Object:");
            System.out.println("Employee ID: " + emp.empId);
            System.out.println("Name: " + emp.name);

            // Step 5: Close streams
            objIn.close();
            fileIn.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


package SerializobjectDemo;

import java.io.*;

public class SerializeDemo {
    public static void main(String[] args) {
        Employee emp = new Employee(1, "Rups");

        try {
            FileOutputStream fileOut = new FileOutputStream("F://FileProgram//employee.ser");
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);

            objOut.writeObject(emp);
            objOut.close();
            fileOut.close();

            System.out.println("Object serialized to employee.ser");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


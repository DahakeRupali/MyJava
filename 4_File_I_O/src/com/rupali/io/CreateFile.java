package com.rupali.io;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        // Specify the file path where you want to create the file
        File file = new File("F://FileProgram//example.txt");
   
        

        try {
            // Create the file if it doesn't exist
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
            
         //STEP-2 Create a FileWriter to write data to the file
            FileWriter writer = new FileWriter(file);

            // Writing text to the file
            writer.write("Hello, this is a test message.");
            writer.write("\nThis is the second line of the file.");
            
            // Close the FileWriter to ensure data is written and resources are released
            writer.close();
            System.out.println("Data written to the file successfully.");
            
            

            // Step 3: Reading from the file using FileReader and BufferedReader
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;

            System.out.println("\nReading from the file:");
            // Read and print each line from the file
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            // Close the reader
            bufferedReader.close();
            
            
        } catch (IOException e) {
            // Handle any IO exceptions
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

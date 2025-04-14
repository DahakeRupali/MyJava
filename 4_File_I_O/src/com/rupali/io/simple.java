package com.rupali.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class simple {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            // Input file (make sure it exists)
            fis = new FileInputStream("F://FileProgram//Source.txt");

            // Output file (will be created if it doesn't exist)
            fos = new FileOutputStream("F://FileProgram//Destination.txt");

            int byteData;

            // Read one byte at a time and write it
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.out.println("Error during file operation: " + e.getMessage());
        } finally {
            // Always close streams
            try {
                if (fis != null) fis.close();
                if (fos != null) fos.close();
            } catch (IOException e) {
                System.out.println("Error closing files: " + e.getMessage());
            }
        }
    }
}

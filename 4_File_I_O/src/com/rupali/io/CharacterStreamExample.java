package com.rupali.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamExample {
    public static void main(String[] args) {
        FileReader reader = null;
        FileWriter writer = null;

        try {
            // Reading from a text file
            reader = new FileReader("F://FileProgram//input.csv");

            // Writing to another text file
            writer = new FileWriter("F://FileProgram//output.csv");

            int ch;

            // Read character by character and write it to the new file
            while ((ch = reader.read()) != -1) {
                writer.write(ch);
            }

            System.out.println("File copied using character streams successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (reader != null) reader.close();
                if (writer != null) writer.close();
            } catch (IOException e) {
                System.out.println("Error closing the file: " + e.getMessage());
            }
        }
    }
}

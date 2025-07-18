
package com.rupali.io;

import java.io.RandomAccessFile;
import java.io.IOException;

public class RandomAccessFileDemo {
    public static void main(String[] args) {
        try {
            // Create or open a file named demo.txt in read-write mode ("rw")
            RandomAccessFile raf = new RandomAccessFile("F://FileProgram//RAF.txt", "rw");

            //  Write data to the file
            // Write a UTF-encoded string (takes extra 2 bytes for length)
            raf.writeUTF("Hello, Rups!");

            // Write an integer
            raf.writeInt(2025);

            // Write a double value
           raf.writeDouble(99.99);

            System.out.println("Data written to RAF.txt");

            //  Move the file pointer back to the beginning
            raf.seek(0);  // now ready to read from the start

            //  Read the data in the same order it was written
            String message = raf.readUTF();  // reads string
            int year = raf.readInt();        // reads integer
            double score = raf.readDouble(); // reads double

            //  Print the read values
            System.out.println("\nReading from file:");
            System.out.println("Message: " + message);
            System.out.println("Year: " + year);
            System.out.println("Score: " + score);

            //  Always close the file to free resources
            raf.close();

        } catch (IOException e) {
            e.printStackTrace(); // Handle any I/O error
        }
    }
}


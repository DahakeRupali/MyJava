package com.rupali.io;



import java.io.RandomAccessFile;
import java.io.IOException;

public class RandomAccessSeekExample {
    public static void main(String[] args) {
        try {
            // Open the file in read-write mode
            RandomAccessFile raf = new RandomAccessFile("F://FileProgram//RAF.txt", "rw");

            // --- Write data to the file ---
            raf.writeUTF("Hello, Rups!");  // UTF String (2 bytes for length + 12 bytes for content = 14 bytes)
            raf.writeInt(2025);            // 4 bytes
            raf.writeDouble(99.99);        // 8 bytes

            System.out.println("Data written to RAF.txt");

            // --- Randomly access only the integer value (position 14) ---
            raf.seek(18);  // Jump directly to the position of the int (after UTF string)
            Double year = raf.readDouble(); // Read int
            
            raf.seek(14);  // Jump directly to the position of the int (after UTF string)
           int yr = raf.readInt(); // Re

            System.out.println("\nReading only integer using seek(14):");
            System.out.println("Year: " + yr);
            System.out.println("Year: " + year);

            raf.close();  // Always close the file

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


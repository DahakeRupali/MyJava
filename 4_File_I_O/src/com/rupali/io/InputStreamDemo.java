package com.rupali.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamDemo {
    public static void main(String[] args) {
        try {
            // Create InputStream from a file
        	//FileInputStream is a concrete subclass of InputStream.
            InputStream input = new FileInputStream("F://FileProgram//sample.txt");

            // 1. int read(): Read one byte
            int singleByte = input.read();
            System.out.println("First byte read: " + singleByte + " (char: " + (char)singleByte + ")");

            // 2. int read(byte[] buffer): Read multiple bytes into buffer
            byte[] buffer = new byte[10];
            int bytesRead = input.read(buffer);
            System.out.println("\nBytes read into buffer: " + bytesRead);
            System.out.println("Data: " + new String(buffer, 0, bytesRead));

            // 3. int read(byte[] buffer, int offset, int length)
            byte[] moreData = new byte[20];
            int bytesRead2 = input.read(moreData, 5, 10); // start storing at offset 5
            System.out.println("\nBytes read into buffer with offset: " + bytesRead2);
            System.out.println("Data (with offset): " + new String(moreData, 5, bytesRead2));

            // 4. int available(): Number of remaining bytes that can be read
            int availableBytes = input.available();
            System.out.println("\nAvailable bytes: " + availableBytes);
            
          
            
            
                
            
            // 6. close(): Close the input stream
            input.close();
            System.out.println("\nInputStream closed.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


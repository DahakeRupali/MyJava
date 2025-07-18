package com.rupali.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamDemo {
    public static void main(String[] args) {
        try {
            // Create an OutputStream connected to a file
            OutputStream output = new FileOutputStream("F://FileProgram//output.txt");

            // 1. write(int b): Write a single byte
            output.write('H');  // writes ASCII value of 'H'

            // 2. write(byte[] b): Write a full byte array
            byte[] message1 = "ello World\n".getBytes();
            output.write(message1);

            // 3. write(byte[] b, int offset, int length): Write part of an array
            byte[] message2 = "WelcomeToJava  and SQL Session ".getBytes();  // 13 bytes
            output.write(message2, 0, 27);  // Writes "Welcome"

            // 4. flush(): Forces any buffered data to be written
            output.flush();
            System.out.println("Data written and flushed successfully.");

            // 5. close(): Always close the stream when done
            output.close();
            System.out.println("OutputStream closed.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


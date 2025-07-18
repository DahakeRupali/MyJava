package com.rupali.io;

import java.io.*;        // For FileReader, BufferedReader, FileWriter, etc.
import java.util.Scanner; // For Scanner class

public class FileReadWriteDemo {
    public static void main(String[] args) {
        try {
            // ========== Writing to File ==========

            // a. Using FileWriter (Character Stream)
            // Specialization: Writes characters directly to a file. Suitable for simple writing tasks.
            FileWriter fw = new FileWriter("F://FileProgram//FRwDemo.txt");
            fw.write("Hello from FileWriter!\n");
            fw.close();

            // b. Using BufferedWriter (Character Stream with Buffering)
            // Specialization: Wraps around FileWriter for efficient writing by reducing I/O calls.
            BufferedWriter bw = new BufferedWriter(new FileWriter("F://FileProgram//FRwDemo.txt", true)); // 'true' for appending
            bw.write("Hello from BufferedWriter!\n");
            bw.close();

            // c. Using PrintWriter (High-level Writer with Formatting)
            // Specialization: Offers println, printf, etc. methods for formatted writing.
            PrintWriter pw = new PrintWriter(new FileWriter("sample.txt", true));
            pw.println("Hello from PrintWriter!");
            pw.close();

            System.out.println("Writing completed.");

            // ========== Reading from File ==========

            System.out.println("\nReading using FileReader:");
            // a. Using FileReader (Character Stream)
            // Specialization: Reads character by character from a file.
            FileReader fr = new FileReader("sample.txt");
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
            fr.close();

            System.out.println("\n Reading using BufferedReader:");
            // b. Using BufferedReader (Efficient Character Stream Reader)
            // Specialization: Reads text line-by-line using buffering for better performance.
            BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

            System.out.println(" Reading using Scanner:");
            // c. Using Scanner (Token/Line Based Reader)
            // Specialization: Easy parsing of input — supports nextInt, nextLine, etc.
            Scanner scanner = new Scanner(new File("sample.txt"));
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

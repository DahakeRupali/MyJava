package com.rupali.io;
import java.io.File;
import java.io.IOException;

public class FileConstructorsDemo {
    public static void main(String[] args) throws IOException {
        // 1. Single string path
        File file1 = new File("F://FileProgram//demo1.txt");
        
        file1.createNewFile();

        // 2. Parent + Child as strings
       File file2 = new File("F://FileProgram", "demo2.txt");

        // 3. Parent as File object + Child as string
        File parentDir = new File("F://FileProgram");
        File file3 = new File(parentDir, "demo3.txt");

        System.out.println("File 1 Path: " + file1.getPath());
       // System.out.println("File 2 Path: " + file2.getPath());
        //System.out.println("File 3 Path: " + file3.getPath());
    }
}


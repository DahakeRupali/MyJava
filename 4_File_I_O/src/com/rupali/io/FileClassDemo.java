package com.rupali.io;

import java.io.File;
import java.io.IOException;

public class FileClassDemo {
    public static void main(String[] args) {
        try {
            // Create a File object for a file
            File file = new File("F://FileProgram//demo.txt");

            // Check if file exists
            
            if (!file.exists()) {
                // Create new file if it doesn't exist
                if (file.createNewFile()) {
                    System.out.println("File created: " + file.getName());
                }
            } 
                else {
                System.out.println("File already exists.");
            }

            // Get file name
            System.out.println("File Name: " + file.getName());
            
            //File Info
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Readable: " + file.canRead());

            // Get file length (in bytes)
            System.out.println("File Size: " + file.length() + " bytes");

            // Check if it's a directory
            System.out.println("Is Directory? " + file.isDirectory());

            // Delete the file
            // Uncomment the line below to test deletion
            // if (file.delete()) {
            //     System.out.println("File deleted successfully.");
            // }

            // Create a directory
            File dir = new File("f://FileProgram//testFolder");
            
            
            if (!dir.exists()) {
                if (dir.mkdir()) {
                	 
                    System.out.println("Directory created: " + dir.getName());
                }
            } else {
                System.out.println("Directory already exists.");
                System.out.println("File List" + dir.listFiles());
            }

        } 
        

        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
       
    }
    
}

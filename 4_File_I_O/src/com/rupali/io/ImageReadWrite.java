package com.rupali.io;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class ImageReadWrite {
    public static void main(String[] args) {
        try {
            // Read the image from a file
            File inputFile = new File("F://FileProgram//BG11.jpg");
            BufferedImage image = ImageIO.read(inputFile);

            //Optional: Print image properties
            System.out.println("Image Read Successfully");
            System.out.println("Width: " + image.getWidth());
            System.out.println("Height: " + image.getHeight());

            //  Step 2: Write the image to another file
            File outputFile = new File("output.jpg");
            ImageIO.write(image, "jpg", outputFile);

            System.out.println("Image Written Successfully");

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}

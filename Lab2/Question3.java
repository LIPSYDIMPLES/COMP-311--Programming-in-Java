/*
*Praise Hombarume
*23018855
*
*/

import java.util.*;
import java.io.*;


public class Question3 {
    
    public static void main  (String args []){

        // Create a Scanner object to read from the file 
       try {
            Scanner file = new Scanner(new File("students.txt"));

            // Read each line from the file and process it
            while (file.hasNextLine()) {
                String line = file.nextLine();
                String[] parts = line.split(",");

            // Extract the name and score from the line
                String name = parts[0].trim();
                int score = Integer.parseInt(parts[1].trim());

                // Print the name and score
                System.out.println("Name: " + name + ", Score: " + score);
            }

            // Close the file scanner
            file.close();

            // Handle the case where the file is not found
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
} 
    


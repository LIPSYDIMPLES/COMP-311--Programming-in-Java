/*
 * Praise Hombarume
 * 23018855
 */

import java.io.*;
import java.util.*;

public class Question5 {
    public static void main(String[] args) {

        // Create a Scanner object to read from the file and a PrintWriter to write to the output file
        try (Scanner file = new Scanner(new File("students.txt"));
             PrintWriter output = new PrintWriter("grades.txt")) {

                // Read each line from the file, process it, and write the name, score, and grade to the output file
            while (file.hasNextLine()) {
                String[] parts = file.nextLine().split(",");
                String name = parts[0].trim();
                int score = Integer.parseInt(parts[1].trim());
                String grade;

                // Determine the grade based on the score
                if (score >= 80 && score <= 100) {
                    grade = "A";
                } else if (score >= 70 && score <= 79) {
                    grade = "B";
                } else if (score >= 60 && score <= 69) {
                    grade = "C";
                } else if (score >= 50 && score <= 59) {
                    grade = "D";
                } else {
                    grade = "F";
                }

                output.println(name + "," + score + "," + grade);
            }

            System.out.println("Grade report written to grades.txt.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
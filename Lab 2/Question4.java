/*
*Praise Hombarume
*23018855
*
*/


import java.io.*;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        
        try (PrintWriter output = new PrintWriter("results.txt")) {

            // Collect and save five student records.
            for (int student = 1; student <= 5; student++) {
                System.out.print("Enter student " + student + " name: ");
                String name = input.nextLine();

                System.out.print("Enter student " + student + " score: ");
                int score = Integer.parseInt(input.nextLine());

                // Store each record as Name,Score on its own line.
                output.println(name + "," + score);
            }

            System.out.println("The five student records were saved to results.txt.");
        } catch (FileNotFoundException e) {
            System.out.println("Could not create results.txt.");
        } finally {
            input.close();
        }
    }
    
}

/*
*Praise Hombarume
*23018855
*
*/

import java.util.*;
 
public class Question1 {
    public static void main(String[] args) {

        // Declaring a Scanner object to read user input
        Scanner console = new Scanner(System.in);

        // Prompt the user to enter a numeric score between 0 and 100
        System.out.print("Enter numeric score between 0 and 100: ");
        int score = console.nextInt();

        // Check the score and print the corresponding grade
           if (score < 0 || score > 100) {
            System.out.println("Invalid score. Please enter a score between 0 and 100.");
        } else if (score >= 80 && score <= 100) {
            System.out.println("Grade: A");
        } else if (score >= 70 && score <= 79) {
            System.out.println("Grade: B");
        } else if (score >= 60 && score <= 69) {
            System.out.println("Grade: C");
        } else if (score >= 50 && score <= 59) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        // Close the Scanner object
        console.close();
    }    
    

    
}
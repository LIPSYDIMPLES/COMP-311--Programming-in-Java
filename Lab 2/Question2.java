/*
*Praise Hombarume
*23018855
*
*/

import java.util.*;

public class Question2 {
    public static void main(String[] args) {

        // Declaring a Scanner object to read user input
        Scanner console = new Scanner(System.in);

        //Prompt user to enter their full name 
        System.out.print("Enter your full name: ");
        String name = console.nextLine();

        // Print the total number of characters in the user's name (including spaces)
        System.out.println("Total number of characters in your name: " + name.length());

        // Print name in uppercase
        System.out.println("Uppercase: " + name.toUpperCase());

        // Print name in lowercase
        System.out.println("Lowercase: " + name.toLowerCase());
        // Prompt user to enter a letter
        System.out.println("Enter a letter");
        String letter = console.nextLine();

        // Check if the user's name starts with the letter inputed  
        System.out.println("Name starts with letter: " + name.startsWith(letter));

        // Close the Scanner object
    console.close(); 

    }
    
}

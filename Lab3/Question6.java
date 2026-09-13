/*
*Praise Hombarume 
*23018855
*
* DO-WHILE LOOP
*Write a program called Question6.java that uses a do-while loop to repeatedly ask the user to enter a number, adding each one 
to a running total, and stops as soon as the user enters 0. Once the loop ends, print the final total.
 */

package Lab3;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        
        // Create a Scanner 
        Scanner console= new Scanner(System.in);
        
        // Declare a variable to store the number the user enters
        int number;
        
        //  Declare a variable to keep track of the running total
        int total = 0;
        
        //do-while loop to repeatedly ask for numbers
        do {
            //Prompt user to enter a number
            System.out.print("Enter a number (enter 0 to stop): ");
            
            //Read the number from the user
            number = console.nextInt();

            //Add the number to the running total
            total += number;  
            
            if (number != 0) {
                System.out.println("Added " + number + " to total. Current total: " + total);
            }
            
        // The loop repeats as long as user doesn't enter 0
        } while (number != 0);
        
        //Display the final total after loop ends
        System.out.println("\nYou entered 0. Loop ended.");
        System.out.println("Final Total: " + total);
        
        console.close();
    }
}

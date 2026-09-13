/*
*Praise Hombarume 
*23018855
*
* DO-WHILE LOOP
* Write a program called Question5.java that uses a do-while loop to keep asking the user to enter a number between 1 and 10 
(inclusive), only stopping once a valid number has been entered.
 */

package Lab3;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        
        Scanner console= new Scanner(System.in);
        
        // Declare a variable 
        int number;
        
        //Declare a variable to control whether the input is valid
        boolean validInput;
        
        do {
            //prompt user to enter a number between 1 and 10
            System.out.print("Enter a number between 1 and 10, including 1 and 10: ");
            
            //read user input
            number = console.nextInt();
            
            // Check if the number is within the valid range (1-10)
            // Set validInput to true only if number is between 1 and 10, and false if it is not
            if (number >= 1 && number <= 10) {
                validInput = true;
                System.out.println("Valid, You entered: " + number);
            } else {
                validInput = false;
                System.out.println("Invalid, Please enter a number between 1 and 10.");
            }
            
        // The loop repeats if validInput is false
        } while (!validInput);
    
        console.close();
    }
}

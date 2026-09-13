/*
*Praise Hombarume 
*23018855
*
* FOR LOOP
*Write a program called Question9.java that asks the user to enter a whole number, then uses a for loop to calculate and print its 
factorial.
 */

package Lab3;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        
        //Create a Scanner object to read user input
        Scanner console= new Scanner(System.in);
        
        //Declare a variable to store the number
        int number;
        
        //Prompt user to enter a whole number
        System.out.print("Enter a whole number: ");
        
        //Read the number from user
        number = console.nextInt();
        
        //Declare a variable to store the factorial result
        long factorial = 1;
        

        // Factorial only works with non-negative numbers
        if (number < 0) {
            System.out.println("Error: Factorial is not defined for negative numbers.");
        } else {
            
            // Loop from 1 to the number (inclusive)
            for (int i = 1; i <= number; i++) {
                
                //Multiply the current factorial by i 
                factorial *= i;  
            }
            
            System.out.println(number + "! = " + factorial);
        }
        
        console.close();
    }
}
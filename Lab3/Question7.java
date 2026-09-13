/*
*Praise Hombarume 
*23018855
*
* FOR LOOP
*Write a program called Question7.java that asks the user to enter a number, then uses a for loop to print that number's 
multiplication table from 1 to 12.
 */

package Lab3;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        
        //Create a Scanner object 
        Scanner scanner = new Scanner(System.in);
        
        //Prompt user to enter a number
        System.out.print("Enter a number: ");
        
        //Read the number from user
        int number = scanner.nextInt();
        
        //Display the multiplication table header
        System.out.println("\nMultiplication Table for " + number + ":");
        
        
        //for loop to print the multiplication table
        // Loop from 1 to 12 (inclusive)
        for (int i = 1; i <= 12; i++) {
            
            //Calculate the product
            int product = number * i;
            
            //Display the multiplication result
            System.out.println(number + " x " + i + " = " + product);
        }
        
        scanner.close();
    }
}

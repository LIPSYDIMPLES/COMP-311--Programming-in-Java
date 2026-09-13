/*
*Praise Hombarume 
*23018855
*
* FOR LOOP
*Write a program called Question8.java that asks the user to enter a word or sentence, then uses a for loop to count and print 
how many vowels (a, e, i, o, u) it contains.
 */

package Lab3;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        
        //Create a Scanner
        Scanner console= new Scanner(System.in);
        
        //Prompt user to enter a word or sentence
        System.out.print("Enter a word or sentence: ");
        
        //Read the entire line of input (including spaces)
        String text = console.nextLine();
        
        // This way we only need to check for lowercase vowels
        text = text.toLowerCase();
        
        //Declare a variable to count vowels
        int vowelCount = 0;
        
        // for loop to go through each character in the string
        for (int i = 0; i < text.length(); i++) {
            
            //Get the current character at position i
            char currentChar = text.charAt(i);
            
            // Step 8: Check if the current character is a vowel
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || 
                currentChar == 'o' || currentChar == 'u') {
                
                // increment the count
                vowelCount++;
            }
        }
        
        System.out.println("\nNumber of vowels: " + vowelCount);
        

        console.close();
    }
}
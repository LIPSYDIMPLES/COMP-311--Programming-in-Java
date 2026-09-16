/**
 * Praise Hombarume
 * 23018855
 * 
 * Question 5  —  Palindrome Check   [4 marks]
 * 
 * A palindrome is a word, phrase, or sequence of characters that reads the same forwards as it does backwards (ignoring case). 
For example, "madam", "level", and "racecar" are all palindromes, while "hello" is not. Write a program called Question5.java 
that asks the user to enter a word or phrase, then prints whether or not it is a palindrome.

*/

package Lab4;

import java.util.*;

public class Question5 {
    public static void main(String[] args) {
        
        //declaring a scanner
        Scanner console = new Scanner(System.in);

        //prompt user to enter a word or phrase
        System.out.println("Ether a word or a phrase:");
        String word = console.nextLine();

        //creates a reversed version of the word and stores it in reserved
        String reversed = new StringBuilder(word).reverse().toString();

        //checks if the original and reversed words are equal
        if (word.equals(reversed)) {
            System.out.println("It is a palidrome.");
        } else {

            System.out.println("It is not a palidrome.");
        }

        //close scanner
        console.close();
    }
    
}

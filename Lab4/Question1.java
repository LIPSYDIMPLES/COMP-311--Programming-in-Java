/**
 * 
 * Praise Hombarume
 * 23018855
 * 
 * Question 1  —  Reading Words into an Array   [4 marks]
 * Write a program called Question1.java that reads words from a file named names.txt and stores them in a String array with a 
capacity of 20.
 */

package Lab4;

import java.io.*;
import java.util.*;


public class Question1 {
    
    public static void main(String[] args) throws FileNotFoundException{
   
       // Create a String array with a capacity of 20
        String[] names = new String[20];

        // Create a Scanner object to read from the file names.txt
        Scanner console = new Scanner(new File("Lab4/names.txt"));

        //start storing names at position 0
        int index = 0;

        //continue reading as long as the array is not yet full 
        while(console.hasNextLine() && index < names.length){

            //reads the next word and stores it 
            names[index] = console.nextLine();

            //moves to the next array position
            index += 1;
        }

        //show how many names were stored
        System.out.println(index + "names stored." );

        //close the scanner ocject 
        console.close();

    }
   
}

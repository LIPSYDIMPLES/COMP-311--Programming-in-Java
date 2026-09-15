/**
 * Praise Hombarume
 * 23018855
 * 
 * Question 2  —  Writing an Array to a File   [4 marks]
 * Write a program called Question2.java that declares a double array of your choice, then uses a for loop to write every value in 
the array to a new file, one value per line.
 */


package Lab4;

import java.io.*;

public class Question2 {

    public static void main(String[] args) throws FileNotFoundException {
        
        // declaring and initialising  a double array
        double[] numbers = {2.1,8.2,5.3,3.4,6.5,1.6};
        
        //Openeign a file to write into
        PrintWriter console = new PrintWriter(new File("Lab4/double.txt"));
        
        //iterating through the numbers
        for(int i = 0; i < numbers.length; i++){

            //writing one value per line
            console.println(numbers[i]);

        }

        //close the file
        console.close();

    }
     

}

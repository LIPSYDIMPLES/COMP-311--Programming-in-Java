/**
 * Praie Hombarume
 * 23018855
 * 
 * Question 3  —  Sum, Smallest and Largest — Written to a File   [4 marks]
 * 
 * Write a program called Question3.java that declares an integer array, then uses a for loop to read through it and write the 
following to a new file: (a) the sum of all the numbers, (b) the smallest number, and (c) the largest number.
 */



package Lab4;

import java.io.*;


public class Question3 {
    public static void main(String[] args) throws FileNotFoundException {
      
        // declaring and initalizing the integer array
        int[] numbers = {10,653,3,0,85,41,};

        int sum = 0;

        //uses the first array value as the initial smallest and largest value
        int smallestNumber = numbers[0];
        int largestNumber = numbers[0];

        //goes through every value in the array
        for( int i = 0; i < numbers.length;i++){

            //adds the current value to sum
            sum += numbers[i];

        // checks if the current number is smaller    
        if(numbers[i] < smallestNumber){
            
            //saves the new smallest number
            smallestNumber = numbers[i];
        }
        
        //checks if the current number is larger
        if(numbers[i] > largestNumber){

            //saves the new largest number
            largestNumber = numbers[i];
        }

    }

    //opens a file to write into
        PrintWriter console = new PrintWriter(new File("Lab4/integers.txt"));

        //prints each results on a separate line
        console.println("Sum:" + sum);
        console.println("Smallest:" + smallestNumber);
        console.println("Largest:" + largestNumber);

        //close the file
        console.close();
    }
    
}

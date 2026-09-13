/* 
*Praise Hombarume
*23018855
*
*
*WHILE LOOP
* Write a program called Question2.java that asks the user to enter a positive whole number, then uses a while loop to calculate 
and print the sum of all whole numbers from 1 up to that number.
*/

package Lab3;

import java.util.*;

public class Question2{
    public static void main(String[] args){

        //creating a scanner
        Scanner console = new Scanner(System.in);

       // prompting the user to enter a positive whole number
        System.out.println("Enter a positive whole number:");
        int number = console.nextInt();
        
        //initializing the sum and count variables
        int sum = 0;
        int count = 1;

        while (count <= number){
            
            //add the current value of count to sum
            sum += count;

            //increment the count variable
            count += 1;
        }
            //print sum after the loop is done
            System.out.println("The sum of all the numbers from 1 to " + number + " is: " + sum);
            
            console.close();
    }
}

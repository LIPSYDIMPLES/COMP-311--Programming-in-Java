/*
*Praise Hombarume
*23018855
*
*
*WHILE LOOP
Write a program called Question1.java that uses a while loop to print a countdown from 10 down to 1, then prints "Liftoff!" once 
the loop finishes.
*/

package Lab3;

public class Question1 {
    public static void main(String[] args){
          
        //Declaring and initializing the variable 
        int count = 10;

        //WHILE loop
        while (count >=1){
            //Prints the current value of count
             System.out.println(count);

             //Decrementing the variable
             count -= 1;
        }

        //Print Liftoff when the loop is done
        System.out.println("Lifttoff");
    } 
}
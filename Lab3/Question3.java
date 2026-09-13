/*
*Praise Hombarume 
*23018855
*
*WHILE LOOP
* Write a program called Question3.java that uses a while loop to print all the even numbers between 1 and 50.
 */

package Lab3;

public class Question3 {
    public static void main(String[] args) {

        //intitialising the variable count
        int count = 1;

        while (count <= 50){

            // check if current value of count is even
            if (count %2 ==0){

                // print the curent vlauseif it is even
                System.out.println(count);

            }

            //increment value of count by 1
            count += 1;
        }



    }
    
}

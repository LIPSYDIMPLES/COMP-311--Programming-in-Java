/**
 * Praise Hombarume
 * 23018855
 * 
 * Question 4  —  Decimal to Binary   [4 marks]
 * 
 * Write a program called Question4.java that asks the user to enter a whole number, then prints that number's binary 
representation.
 */


package Lab4;

import java.util.*;


public class Question4 {
    public static void main(String[] args) {

        //declaring a scanner
        Scanner console = new Scanner(System.in);

        //prompt user to enter a whole umber
        System.out.println("Enter a whole number:");

        //reads the number entered and stores it
        int number = console.nextInt();

        //converts decimal number to binary and stores it 
        String binary = Integer.toBinaryString(number);

        //prints the binary result
        System.out.println("Binary representaion:" + binary);
        //close scanner
        console.close();
    
}

    
}

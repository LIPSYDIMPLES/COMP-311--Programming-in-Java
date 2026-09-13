/*
*Praise Hombarume 
*23018855
*
* DO-WHILE LOOP
* Write a program called Question4.java that repeatedly displays a simple menu (1. Continue   2. Exit) using a do-while loop. The 
program should keep showing the menu until the user enters 2.
 */
package Lab3;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
       
        //creating a scanner
        Scanner console= new Scanner(System.in);

        //declaring a variable
        int choice;

        do{
            //display the menu
            System.out.println("\n======== MENU ======");
            System.out.println("1. Continue");
            System.out.println("2. Exit");

            //prompts user to enter their choice
            System.out.println("Enter your choice");

            //read user input
            choice = console.nextInt();

            // checks the choice and displays the appropriate message
            if (choice ==1){
                System.out.println("You chose to continue");
               } else if (choice == 2){
                System.out.println("You chose to exit, GOODBYE!!!");
               } else{
                System.out.println("Invalid response,please enter the appropriate choice");
               }

            }

            //continue looping until the user chooses to exit
            while (choice !=2);

            console.close();
    }
    
    
}

/*
*Praise Hombarume
*23018855
*
*/


import java.util.*;

public class Question6 {
    public static void main(String[] args) {
        
        // Create a Scanner object to read user input
        Scanner console = new Scanner(System.in);
        System.out.print("Enter your a number from 1 to 7: ");

        // Read the number inputted by the user
        int dayNumber = console.nextInt();
        String dayName;

        // Switch statement to determine the day of the week based on the input number
        switch (dayNumber) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day number";
        }

        System.out.println("The day is: " + dayName);
        

        console.close();
    }

    
}

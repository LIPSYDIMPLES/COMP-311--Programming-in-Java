/*
*Praise Hombarume
*23018855
*
*/

import java.io.*;
import java.util.*;

public class Question8 {
	public static void main(String[] args) {
		try (Scanner file = new Scanner(new File("numbers.txt"));
			 PrintWriter output = new PrintWriter("evenodd.txt")) {

			int evenCount = 0;
			int oddCount = 0;
 
            // Read integers from the file and count even and odd numbers
			while (file.hasNextInt()) {
				int number = file.nextInt();

                // Check if the number is even or odd and update the respective count
				if (number % 2 == 0) {
					evenCount++;
				} else {
					oddCount++;
				}
			}

			output.println("Even numbers: " + evenCount);
			output.println("Odd numbers: " + oddCount);

            // Print a message indicating that the counts have been written to the output file
			System.out.println("Even and odd counts written to evenodd.txt.");
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		}
	}
}

/*
*Praise Hombarume
*23018855
*
*/

import java.io.*;
import java.util.*;

public class Question9 {
	public static void main(String[] args) {
		try (Scanner file = new Scanner(new File("numbers.txt"));
			 PrintWriter output = new PrintWriter("signs.txt")) {

			long positiveTotal = 0;
			long negativeTotal = 0;
			int positiveCount = 0;
			int negativeCount = 0;

            // Read integers from the file and calculate totals and counts for positive and negative numbers
			while (file.hasNextInt()) {
				int number = file.nextInt();

                // Check if the number is positive or negative and update the respective totals and counts
				if (number > 0) {
					positiveTotal += number;
					positiveCount++;
				} else if (number < 0) {
					negativeTotal += number;
					negativeCount++;
				}
			}

            // Write the totals and counts to the output file
			output.println("Positive total: " + positiveTotal);
			output.println("Positive count: " + positiveCount);
			output.println("Negative total: " + negativeTotal);
			output.println("Negative count: " + negativeCount);

            // Print a message showing that the totals and counts have been written to the output file
			System.out.println("Sign totals and counts written to signs.txt.");
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		}
	}
}

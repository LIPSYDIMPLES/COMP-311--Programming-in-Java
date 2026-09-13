/*
*Praise Hombarume
*23018855
*
*/

import java.io.*;
import java.util.*;

public class Question7 {
	public static void main(String[] args) {

        // Use try-with-resources to automatically close the Scanner and PrintWriter
		try (Scanner file = new Scanner(new File("numbers.txt"));
			 PrintWriter output = new PrintWriter("stats.txt")) {

                // Initialize variables to keep track of count, sum, smallest, and largest numbers
			int count = 0;
			int sum = 0;
			int smallest = 0;
			int largest = 0;

            // Read integers from the file and calculate statistics
			while (file.hasNextInt()) {
				int number = file.nextInt();

				if (count == 0) {
					smallest = number;
					largest = number;
				} else {
					if (number < smallest) {
						smallest = number;
					}
					if (number > largest) {
						largest = number;
					}
				}

				sum += number;
				count++;
			}

            // Calculate and write the statistics to the output file
			if (count > 0) {
				double average = (double) sum / count;
				output.println("Smallest: " + smallest);
				output.println("Largest: " + largest);
				output.println("Average: " + average);
			} else {
				output.println("The file contains no numbers.");
			}


			System.out.println("Statistics written to stats.txt.");

            // Handle the case where the input file is not found
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		}
	}
}

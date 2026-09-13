/*
*Praise Hombarume
*23018855
*
*/

import java.io.*;
import java.util.*;

public class Question10 {
	public static void main(String[] args) {
		try (Scanner console = new Scanner(System.in);
			 Scanner file = new Scanner(new File("numbers.txt"))) {

                // Prompt the user to enter a number to search for in the file
			System.out.print("Enter a number to search for: ");
			int searchNumber = console.nextInt();
			boolean found = false;

            // Read integers from the file and check if the search number is present
			while (file.hasNextInt()) {
				if (file.nextInt() == searchNumber) {
					found = true;
					break;
				}
			}

            // Print whether the number was found in the file
			System.out.println(found);
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		}
	}
}

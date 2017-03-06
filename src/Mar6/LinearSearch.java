package Mar6;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String args[]) {
		// Initialize variables
		int c, numberOfElements, search, array[];
		
		// Get number of elements
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of elements");
		numberOfElements = in.nextInt();
		
		// Populate the array with a set of integers
		array = new int[numberOfElements];
		System.out.println("Enter " + numberOfElements + " integers");
		
		for (c = 0; c < numberOfElements; c++) {
			array[c] = in.nextInt();
		}
		
		// Get search/target value
		System.out.println("What should I find? ");
		search = in.nextInt();
		
		// For each element
		for (c = 0; c < numberOfElements; c++) {
			// Check if its equal to the target
			if (array[c] == search) {
				// Print the value
				System.out.println(search + " is at " + (c + 1) + ".");
				// Exit from loop as we've found it and don't need to continue
				break;
			}
		}
		
		// If we have reached the end of the list
		// the element can't exist
		if (c == numberOfElements) {
			System.out.println(search + " doesn't exist");
		}
	}
}


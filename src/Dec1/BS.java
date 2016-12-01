package Post;

public class BS {
	public static void main(String args[]) {
		// Run a simple test and return the result
		//int[] testDataset = {8, 4, 7, 9, 1, 3, 78, 2, 6, 8, 2, 6, 6, 1, 6, 8, 2, 6, 6, 1, 6, 8, 2, 6, 6, 1, 6, 8, 2, 6, 6, 1, 6, 8, 2, 6, 6, 1, 6, 8, 2, 6, 6, 1, 6, 8, 2, 6, 6, 1, 6, 8, 2, 6, 6, 1, 6, 8, 2, 6, 6, 1, 47, 16, 27, 238, 983, 82, 21, 1, 1, 1, 1, 7, 2, 7, 2, 8};
		//int[] result = bubbleSort(testDataset);
		//printList(result);
		
		timeLen(100000);
		
		// Work up to a target of 10,000
		//for (int length=0;length<10000;length++) {
		//	timeLen(length);
		//}
	}
	
	// Prints time taken to sort list of length specified
	public static void timeLen(int length) {
		
		// Find the time taken to completet the sort of the datalength with the specified length
		long duration = timeSort(length);
		
		// And print it in a nice, human readable style
		System.out.println("took " + duration + " at length " + length);
	}
	
	// Returns result of bubble sort on dataset provided
	public static int[] bubbleSort(int dataset[]) {

		// Knows if a swap was made in the last step
		boolean swapMade = true;
		
		// Temp used for swapping
		int temp;
		
		// Keep looping over the dataset until no more swaps are made
		while (swapMade == true) {
			
			// Default swapMade to false until specified otherwise
			swapMade = false;
			
			// For each value in the dataset
			for (int position=1; position <= (dataset.length - 1); position++) {
				//System.out.println(position);
				
				// If the current position is greater than the next number
				if (dataset[position -1] > dataset[position]) {
					
					// Swap them
					temp = dataset[position - 1];
					dataset[position - 1] = dataset[position];
					dataset[position] = temp;
					
					// Signal to continue the loop next time
					swapMade = true;
				}
			}
		}
		
		// Return the sorted dataset
		return(dataset);
	}
	
	// Generate random int list of specified length
	public static int[] generateDataset(int length) {
		
		// Create a blank array of length specified
		int[] dataset = new int[length];
		
		// Loop through the array
		for (int i=0;i<length;i++) {
			
			// Adding a random int to each position
			dataset[i] = (int) (Math.random() * 10000);
		}
		
		// And return the result
		return(dataset);
	}
	
	// Run procedure to time a bubble sort
	public static long timeSort(int length) {
		// Start the timer
		long startTime = System.nanoTime();
		
		// Bubble sort a random dataset of length specified
		int[] dataset = generateDataset(length);
		bubbleSort(dataset);
		
		// End the timer and calculate it in ms
		long endTime = System.nanoTime();
		long duration = (endTime - startTime) / 1000000;
		
		// Return the duration
		return(duration);
	}
	
	// Print list on separate lines
	public static void printList(int dataset[]) {
		
		// Output the result dataset
		for (int i = 0; i < dataset.length; i++) {
			
			// Print the value at the current position
			System.out.println("Result position " + i + " is " + dataset[i]);
		}
	}
}

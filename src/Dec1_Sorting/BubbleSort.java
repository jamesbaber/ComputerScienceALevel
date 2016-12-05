package Dec1_Sorting;

public class BubbleSort {
	public static void main(String args[]) {
		// Populate the array
        int[] dataset = SortUtils.generateDataset(100);
        
        // And print the pre-sorted values
        System.out.print("Before sorting: ");
        SortUtils.printList(dataset);
        
        // Run a sort
        dataset = BubbleSort(dataset);
        
	    // Print the post-sorting values
	    System.out.print("After sorting:  ");
	    SortUtils.printList(dataset);
	}
	
	// Prints time taken to sort list of length specified
	public static void imeLen(int length) {
		
		// Populate the array
        int[] dataset = SortUtils.generateDataset(100);
        
        // And print the pre-sorted values
        System.out.print("Before sorting: ");
        SortUtils.printList(dataset);
        
        // Run a sort
        dataset = BubbleSort(dataset);
        
	    // Print the post-sorting values
	    System.out.print("After sorting:  ");
	    SortUtils.printList(dataset); //Find the time taken to completet the sort of the datalength with the specified length
		long duration = time// Populate the array
		        int[] dataset = SortUtils.generateDataset(100);
        
		        // And print the pre-sorted values
		        System.out.print("Before sorting: ");
		        SortUtils.printList(dataset);
		        
		        // Run a sort
		        dataset = InsertionSort(dataset);
		        
			    // Print the post-sorting values
			    System.out.print("After sorting:  ");
			    SortUtils.printList(dataset);+Sort(length);
		
		// And print it in a nice, human readable style
		System.out.println("took " + duration + " at length " + length);
	}
	
	// Returns result of bubble sort on dataset provided
	public static int[] BubbleSort(int dataset[]) {

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
}

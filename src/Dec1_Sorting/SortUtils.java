package Dec1_Sorting;

public class SortUtils {
	// Iterates through an integer list and prints each value
    public static void printList (int[] list)
    {
    	// Iterate through each value in the list
        for (int index = 0; index < list.length; index ++)
        {
            // Little snippet to ensure the length of the printed output is uniform regardless of integer digit count
            //if ((int) (Math.log10(list[index]) + 1) < 2) {
            //	// Print single space
            //	System.out.print(" ");
            //}
            
            // Print the value at the current index
            System.out.print(list[index] + " ");
        }
        
        // Print a blank newline
        System.out.println();
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
 	
 	// Start timer
 	public static long startTimer() {
 		// Start the timer
 		long startTime = System.nanoTime();
 		
 		// Return it
 		return(startTime);
 		
 	}
 	
 	// End timer
 	public static long endTimer(long startTime) {
 		// End the timer and calculate it in ms
 		long endTime = System.nanoTime();
 		long duration = (endTime - startTime) / 1000000;
 		
 		// Return the duration
 		return(duration);
 	}
}

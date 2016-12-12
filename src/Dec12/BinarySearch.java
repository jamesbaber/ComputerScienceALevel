package Dec12;

public class BinarySearch {
	public static void main(String[] args) {
		
		// Test data set
		int[] dataset = {1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 70, 100};
		
		// Test target
		int target = 90;
		
		// Do the binary search
		int index = BinarySearch(dataset, target);
		
		// Print the result
		System.out.println("Found target (" + target + ") at index " + index + " which is position " + (index + 1));
	
	}
	
	public static int BinarySearch(int[] dataset, int target) {
		
		// Initialize the target location (the value we will return)
		int targetIndex = 0;
		
		// Initialize the min, max and middle values
		int minimumIndex = 0;
		int maximumIndex = dataset.length;
		int middleIndex  = dataset.length / 2;
		
		// Found the target yet?
		boolean found = false;
		
		// Previous middle value, used for exiting from failed instances
		int prevMiddle = 	 0;
		
		// While its not found
		while (!found && prevMiddle != middleIndex) {
			
			// If the value is in the lower half
			if (target < dataset[middleIndex]) {
				
				// Go to the lower bit
				maximumIndex = middleIndex;
				middleIndex = minimumIndex + ((maximumIndex - minimumIndex) / 2);
				
			} else if (target > dataset[middleIndex]) {
				
				// Go to the upper bit
				minimumIndex = middleIndex;
				middleIndex = minimumIndex + ((maximumIndex - minimumIndex) / 2);
				
			}
			
			// Found the target
			if (target == dataset[middleIndex]) {
				
				// Break from the loop
				found = true;
				
				// Set the target index for return once the loop has been exited
				targetIndex = middleIndex;
				
			}
			
			System.out.println("min " + minimumIndex);
			System.out.println("max " + maximumIndex);
			System.out.println("avg " + middleIndex);
			
			
			prevMiddle = middleIndex;
		}
		
		if (prevMiddle == middleIndex) {
			targetIndex = -1;
		}
		
		// Return the location of the target
		return(targetIndex);
		
	}
}

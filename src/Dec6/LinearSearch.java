package Dec6;

public class LinearSearch {
	public static void main(String[] args) {
		
		// Has the target been found
		boolean found = false;
		
		// The current index to be checked
		int position = 0;
		
		// The target integer to find
		int target = 8;
		
		// The dataset to search in
		int[] dataset = {1, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 50, 51, 52, 53, 54, 54, 54, 54};
		
		// While the target haven't been found and the end of the list hasn't been reached
		while (found == false && position <= dataset.length - 1) {
			
			// If the current element is the target
			if (dataset[position] == target) {
				
				// Announce that its been found
				found = true;
			} else {
				
				// Increment the element
				position += 1;
			}
		}
		
		
		// If its been found, say so
		if (found == true) {
			
			// Say the element has been found
			System.out.println("Found the item at " + (position + 1) + " (thats " + position + " array position)");
		} else {
			
			// Say the element couldn't be found
			System.out.println("Item " + target + " is not in the list");
		}
	}
}

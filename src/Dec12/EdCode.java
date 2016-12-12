package Dec12;
/*
 * BinarySearch
 * Edward Callow
 * 161212
 */

public class EdCode {
	public static void main(String[] args) {
		int[] daList = {1, 2 ,3 ,4 ,5, 6, 7, 8, 9, 10};
		int target = 6;
	
		int upperBound = daList.length;
		int lowerBound = 0;
		int median = (daList.length / 2);
		boolean foundValue = false;
	
		while (!foundValue) {
			if (target < daList[median]) {
				// lower half
				upperBound = median;
				median = lowerBound + ((upperBound - lowerBound) /2);
			}
			else if (target > daList[median]) {
				// upper half
				lowerBound = median;
				median = lowerBound + ((upperBound - lowerBound) /2);
			}
			if (target = daList[median]) {
				foundValue = true;
				resultPosition = median;
			}
	
		}
		// print result location
		System.out.println("You were searching for " + target);
		System.out.println("We found " + daList[resultPosition]);
	}
}
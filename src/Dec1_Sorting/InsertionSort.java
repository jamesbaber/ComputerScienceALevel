package Dec1_Sorting;

import java.math.*;

public class InsertionSort
{
    public static void main (String[] args)
    {
        // Populate the array
        int[] dataset = SortUtils.generateDataset(100);
        
        // And print the pre-sorted values
        System.out.print("Before sorting: ");
        SortUtils.printList(dataset);
        
        // Run a sort
        dataset = InsertionSort(dataset);
        
	    // Print the post-sorting values
	    System.out.print("After sorting:  ");
	    SortUtils.printList(dataset);
    }
    
    public static int[] InsertionSort(int[] dataset) {
        // The element we are trying to insert
        int currentElement;
        
        // The previous elements index
        int lastIndex;
        
        // Iterate over the whole dataset once
        for (int datasetIndex = 1; datasetIndex < dataset.length; datasetIndex ++)
        {
        	// Set key to the current element
            currentElement = dataset[datasetIndex];
            
            // The index of the element before the current one
            lastIndex = datasetIndex - 1;
            
            // While the aforementioned last value is out of bounds (-1 or too big)
            while((lastIndex > -1) && (dataset[lastIndex] > currentElement))
            {
            	// Set the next index value to the current one
            	dataset[lastIndex + 1] = dataset[lastIndex];
                lastIndex = lastIndex - 1;
            }

            // place for new key
            dataset[lastIndex + 1] = currentElement;
        }
        
        // Return the sorted list
        return(dataset);
    }
}
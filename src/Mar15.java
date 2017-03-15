import java.util.*;
import java.io.*;

public class Mar15 {
	// Setup game
	public static void main(String args[]) {
		int[][] g = generate2DArray(10, 10);
		printGrid(g);
	}
	
	public static int[][] generate2DArray(int width, int height) {
		int[][] array = new int[width][height];
		
		int w = 0;
		int h = 0;
		
		while (w < 10) {
			while (h < 10) {
				array[w][h] = (int) (Math.random() * 50);
				h ++;
			}
			h = 0;
			w ++;
		}
		return(array);
	}
	
	public static void printGrid(int grid[][]) {
		for (int[] row : grid)
		{
		    System.out.println(Arrays.toString(row));
		}
		
	}
}



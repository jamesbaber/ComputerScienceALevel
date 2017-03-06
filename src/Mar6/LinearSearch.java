package Mar6;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String args[]) {
		int c, n, search, array[];
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of elements");
		n = in.nextInt();
		
		array = new int[n];
		System.out.println("Enter " + n + " integers");
		
		for (c = 0; c < n; c++) {
			array[c] = in.nextInt();
		}
		
		System.out.println("What should I find? ");
		search = in.nextInt();
		
		for (c = 0; c < n; c++) {
			if (array[c] == search) {
				System.out.println(search + " is at " + (c + 1) + ".");
				break;
			}
		}
		
		if (c == n) {
			System.out.println(search + " doesn't exist");
		}
	}
}


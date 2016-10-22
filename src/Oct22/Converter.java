package Oct22;

import java.util.Scanner;

public class Converter {
	public static String BeautifyBinString(String binary) {
		// Start with empty string
		String output = "";
		
		// Count down from right to left of binary string
		int counter = binary.length() - 1;
		
		// Count up from zero for spacing calculations
		int upcounter = 0;
		
		// Loop until we are at the left/end of the binary string
		while (counter >= 0) {
			// Work out remainders, i.e. is it a multiple of 4 or 8
			int fourthBit = upcounter % 4;
			int eigthBit = upcounter % 8;
			
			// If multiple of 4, add a space
			if (fourthBit == 0 && upcounter != 0) {
				output = " " + output;
			}
			
			// If multiple of 8, add another space
			if (eigthBit == 0 && upcounter != 0) {
				output = " " + output;
			}
			
			// Concat the binary character to the left of the output string
			output = binary.charAt(counter) + output;
			
			// Increment the counters
			counter -= 1;
			upcounter += 1;
			
		}
		
		// Return beautiful binary
		return(output);
	}
	
	public static String Den2Bin(int input) {
		// Start with an empty output string
		String binary = "";
		
		// Loop through division method until the input is exhausted
		while (input > 0) {
			
			// Use modulus to find remainder
			int remainder = input % 2;
			
			// Add the remainder to the binary output string
			binary = remainder + binary;
			
			// Divide the input by two for next loop
			input /= 2;
		}
		
		// Return binary string
		return(binary);
	}
	
	public static void main(String args[]) {
		// Setup scanner
		Scanner kb = new Scanner(System.in);
		
		// Get denary input value
		int denary = kb.nextInt();
		
		// Convert dennary to binary
		String binary = Den2Bin(denary);
		
		// Beautify the binary string for easy reading
		binary = BeautifyBinString(binary);
		
		// Output the result
		System.out.println("'" + denary + "' converted to binary using the division method is '" + binary + "'");
	}
}

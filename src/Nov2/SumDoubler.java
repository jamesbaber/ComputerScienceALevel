package Nov2;

public class SumDoubler {
	public static void main(String args[]) {
		System.out.println(Dubbz(1, 2));
		System.out.println(Dubbz(3, 2));
		System.out.println(Dubbz(2, 2));
	}
	
	public static int Dubbz(int num1, int num2) {
		// Start with 0 total
		int output = 0;
		
		// Add them together
		output = num1 + num2;
		
		// If they were the same, double the total
		if (num1 == num2) {
			output = output * 2;
		}
		
		// Return our total
		return(output);
	}
}

package Oct17;

import java.util.Scanner;

public class ReversingString {
	public static String reverse(String input) {
		String output = "";
		
		for (char character: input.toCharArray()) {			
			output = character + output;
		}
		
		return(output);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

        System.out.println("Enter a positive integer");
        String input = in.nextLine();
        
        String reversed = reverse(input);
        
        System.out.println(reversed);
	}
}

package Oct4;
import java.util.Scanner;

public class TimesTable {
	public static void main(String args[]) {
		
		int number;
		int current;
		
		System.out.println("Enter number");
		
	    Scanner in = new Scanner(System.in);
	    number = in.nextInt();
	    
	    for (current = 1; current <= 10; current++) {
	    	System.out.println(number + " * " + current + " = " + (number * current));
	    }
	}
}

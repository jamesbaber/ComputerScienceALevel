package Oct6;
import java.util.Scanner;

public class TempCheck {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter a temperature");
		int number = kb.nextInt();
		
		if (number <= 0) {
			System.out.println("Freezing");
		}
	}
}

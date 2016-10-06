package Oct6;
import java.util.Scanner;

public class PayCalc {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the number of hours you have worked.");
		int hours = kb.nextInt();
		double pay = 0;
		pay = (hours * 9.50);
		
		pay += (hours - 7) * 3;
		
		System.out.println(pay);
	}
}

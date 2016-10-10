package Oct2;
import java.util.Scanner;

public class NotString {
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		String name = kb.nextLine();
		
		System.out.println(name.charAt(0));
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.substring(0,3));
		
		
	}
}
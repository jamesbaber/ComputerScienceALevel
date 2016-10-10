package Oct10;

import java.util.Scanner;

public class AgeStuff {
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		int age = kb.nextInt();
		
		if (age <= 1) {
			System.out.println("baby");
		} else if (age > 1 && age < 13) {
			System.out.println("Child");
		} else if (age >= 13 && age < 18) {
			System.out.println("Teen");
		} else if (age >= 18) {
			System.out.println("Adult");
		} else {
			System.out.println("Alien");
		}
	}
}

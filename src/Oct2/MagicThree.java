package Oct2;


import java.util.Scanner;

public class MagicThree {
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		float originalNum = kb.nextInt();
		float newNum = 0;
		
		newNum = originalNum * originalNum;
		System.out.println(newNum);
		
		newNum = newNum + originalNum;
		System.out.println(newNum);
		
		newNum = newNum / originalNum;
		System.out.println(newNum);
		
		newNum = newNum + 17;
		System.out.println(newNum);
		
		newNum = newNum - originalNum;
		System.out.println(newNum);
		
		newNum = newNum / 6;
		System.out.println(newNum);
		
	}
}

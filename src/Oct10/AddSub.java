package Oct10;

public class AddSub {
	public static void main(String args[]) {
		int a = 10;
		int b = 6;
		
		int c = addition(a, b);
		int d = subtraction(a, b);
		System.out.println(c);
		System.out.println(d);
	}
	
	public static int addition(int num1, int num2) {
		int ans = num1 + num2;
		return ans;
	}
	public static int subtraction(int num1, int num2) {
		int ans = num1 - num2;
		return ans;
	}
}

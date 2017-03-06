package Feb5;

public class GoodDogTestDrive{
	public static void main(String[] args)
	{
		// Create instance of dog
		GoodDog one = new GoodDog();
		
		// Run a setter to change the size
		one.setSize(70);
		
		// Create instance of dog
		GoodDog two = new GoodDog();
		
		// Run a setter to change the size
		two.setSize(8);
		
		// Run a getter on both instances and print the result
		System.out.println("Dog one: " + one.getSize());
		System.out.println("Dog two: " + two.getSize());
		
		// Run normal methods of both
		one.bark();
		two.bark();
	}
}
		
class GoodDog
{
	// Private variable, only accessible from within this class's methods.
	private int size;
	
	// "Getter" method
	public int getSize() {
		return size;
	}
	
	// "Setter" method
	public void setSize(int s) {
		size = s;
	}

	// Normal method
	void bark() {
		
		if (size > 60) {
			System.out.println("Wooof! Wooof!");
		} else if (size > 60) {
			System.out.println("Ruff! Ruff!");
		} else {
			System.out.println("Yip! Yip!");
		}
	}
}
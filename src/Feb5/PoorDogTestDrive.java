package Feb5;

public class PoorDogTestDrive {
    public static void main(String[] args)
    {
        PoorDog one = new PoorDog(); // Make a new god class instance
        
        // Print the output of two "getter" methods.
        System.out.println("Dog size is " + one.getSize()); // 
        System.out.println("Dog name is " + one.getName());
    }
}

class PoorDog
{
	// Private variables. Only accessible from methods of this class.
    private int size;
    private String name;
    
    // "Getter" Returns value of private variable.
    // This stops the calling code from changing the private variable.
    public int getSize() {
    	return size;
    }
    
    // Another getter.
    public String getName() {
    	return name;
    }
}
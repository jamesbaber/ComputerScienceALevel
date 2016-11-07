package Nov7;

public class BadgerEyes {
	public static void main(String args[]) {
		// Initialise
		int die1 = 0;
		int die2 = 0;
		int count = 0;
		
		// Keep rolling
		do {
			die1 = rollDie();
			die2 = rollDie();
			count += 1;
			
		// Until they are both 1
		} while (!(die1 == 1 && die2 == 1));
		
		// Then tell the world
		System.out.println("Badger eyes. Took " + count + " attempts.");
		System.out.println(die1 + " " + die2);
	}
	
	// Returns an integer from 1 to 6
	public static int rollDie() {
		int die = (int) (Math.random() * 6) + 1;
		return(die);
	}
}

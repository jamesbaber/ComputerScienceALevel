package Nov13;

public class DiceRoll {
	public static void main(String args[]) {
		rollToSnakeEyes();
	}
	
	// Snake eyes subroutine
	public static void rollToSnakeEyes() {
		int rollsToSnakeEyes = rollToTarget(2);
		
		// Print the response
		System.out.println("To get snake eyes it took " + rollsToSnakeEyes + " rolls");
	}
	
	// Get number of rolls until total is target
	public static int rollToTarget(int target) {
		// Initialise rolls as 0
		int rolls = 0;
		
		// Are the parameters within range?
		if (!(target >= 2 && target <= 12)) {
			throw new IllegalArgumentException("Impossible target " + target);
		}
		
		// Set dice to 0
		int die1 = 0;
		int die2 = 0;
		
		// While total not target, keep rolling
		while ((die1 + die2) != target) {
			die1 = rollDie();
			die2 = rollDie();
			rolls += 1;
		}
		
		// Return the number of rolls it took
		return(rolls);
	}
	
	// Die roll function
	public static int rollDie() {
		// Roll a number
		int die = (int) (Math.random() * 6) + 1;
		
		// Return it
		return(die);
	}
}

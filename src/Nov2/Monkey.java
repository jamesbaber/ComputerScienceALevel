package Nov2;

public class Monkey {
	
	public static void main(String args[]) {
		// Lets just test everything
		TestAllPossibilities();
	}
	
	// Returns if we're in trouble or not depending on each monkeys state
	public boolean MonkeyTest(boolean aSmile, boolean bSmile) {		
		// The conditions for if we're in trouble or not
		if ((aSmile == true && bSmile == true) || (aSmile == false && bSmile == false)) {
			// We're in trouble
			return(true);
		}
		
		// We're not in trouble
		return(false);
	}
	
	// Routine to test every possibility of the monkey situation
	public static void TestAllPossibilities() {
		
		// Combinations
		boolean[] combinations = {false, true};
		
		// Will do   00, 01, 10, 11
		// Therefore the expected output is   1,0,0,1
		for (boolean a : combinations) {
			for (boolean b : combinations) {
				
				// Make a new monkey class
				Monkey mnk = new Monkey();
				
				// Print the result of this combination of monkeys
				System.out.println(StringifyTrouble(mnk.MonkeyTest(a, b)));
			}
		}
	}
	
	// Returns a human readable string describing if we're in trouble or not
	public static String StringifyTrouble(boolean inTrouble) {
		
		// In trouble
		if (inTrouble == true) {
			return("We're in trouble... For some reason...?");
			
		// Not in trouble
		} else if (inTrouble == false) {
			return("We're not in trouble... Which is nice...?");
		
		// The boolean wasn't true or false... This should never happen
		} else {
			return("Shroedinger's monkeys");
		}
	}
}

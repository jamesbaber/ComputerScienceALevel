package Nov13;

public class DiceRoll {
	public static void main(String args[]) {
		
	}
	
	public static int rollTotarget(int target) {
		int rolls = 0;
		
		if (!(target > 2 && target <= 12)) {
			throw new IllegalArgumentException("Impossible");
		}
		
		int die1 = -1;
		int die2 = -2;
		
		while (die1 != die2) {
			die1 = rollDie();
			die2 = rollDie();
			rolls += 1;
		}
		
		return(rolls);
	}
	
	public static int rollDie() {
		int die = (int) (Math.random() * 6) + 1;
		return(die);
	}
}

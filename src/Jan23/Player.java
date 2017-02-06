package Jan23;

public class Player {
	public int guessNumber;
	
	public int Guess() {
		guessNumber = (int) Math.round(Math.random() * 10);
	}
}

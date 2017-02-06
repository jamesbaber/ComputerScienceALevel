package Jan23;

public class GameLauncher {
	private int level;
	private boolean running;
	
	Player p1;
	Player p2;
	Player p3;
	
	public void Start() {
		running = true;
		level = 1;
		
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
	}
}

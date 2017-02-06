package Jan19;

public class Movie {
	String name;
	int length;
	boolean playing;
	
	public Movie(String name, int length) {
		playing = false;
	}
	
	void Play() {
		playing = true;
		System.out.println("Movie playing");
	}
}

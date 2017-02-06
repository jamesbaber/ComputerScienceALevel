package Jan19;

public class Main {
	public static void main(String[] args) {
		Movie MissSaigon = new Movie("Miss Saigon", 170);
		
		System.out.println(MissSaigon.playing);
		
		MissSaigon.Play();
		
		System.out.println(MissSaigon.playing);
	}
}

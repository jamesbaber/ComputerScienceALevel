package Nov7;

import java.util.Scanner;

public class RoutineBecauseThatsAThingAparently {
	public static void main(String args[]) {
		boolean play = true;		
		while (play == true) {
			gameRoutine();
			System.out.println("Do you want to play again?");
			
			Scanner steve = new Scanner(System.in);
			
			String response = steve.nextLine();

			response = response.toLowerCase();

			if (response.equals("yes")) {
				play = true;
				System.out.println("oh good.");
			} else {
				play = false;
				System.out.println("Fine, be that way!");
			}
		}
	}
	
	public static void gameRoutine() {
		// Initialize the game session
		int theNumber = (int) (Math.random() * 100);
		int maxTries = 6;
		int userNumber = -1;
		int guesses = 0;
		
		// Grab a new scanner
		Scanner in = new Scanner(System.in);
		
		while (userNumber != theNumber) {
			// Get the users number
			System.out.println("Enter a number");
			userNumber = in.nextInt();
			
			// Increment guesses
			guesses += 1;
			
			// Is it higher?
			if (userNumber > theNumber) {
				System.out.println("Too high you utter fool.");
			}
			
			// Is it lower?
			if (userNumber < theNumber) {
				System.out.println("Too low genuis.");
			}
		}
		//in.close();
		
		System.out.println("Huzah. Yes that was sarcastic, deal with it.");
		System.out.println("You got it in only " + guesses + " guesses. How impressive. A computer could do better, well... if it found a buffer overflow vulnerability in th... nevermind.");
	}
}

package Oct18;

import java.util.Scanner;

public class Challenge1 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

        System.out.println("Enter the distance to travel in km");
        int distance = in.nextInt();
        System.out.println("Enter the speed of travel in km/h");
        int speed    = in.nextInt();
        
        int time = 0;
        
        time = distance / speed;
        
        System.out.println("To travel " + distance + "km at " + speed + "km/h it would take " + time + "h");
	}
}

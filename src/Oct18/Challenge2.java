package Oct18;

import java.util.Scanner;

public class Challenge2 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

        System.out.println("Enter circle radius");
        int radius = in.nextInt();
        
        int circ = 0;
        double area = 3.14 * (radius * radius);
        double circumference = 3.14 * (radius * 2);
        
        area = Math.round(area);
        circumference = Math.round(circumference);
        
        System.out.println("A circle with radius " + radius + "m has a circumference of " + circumference + "m and an area of " + area + "m2");
	}
}

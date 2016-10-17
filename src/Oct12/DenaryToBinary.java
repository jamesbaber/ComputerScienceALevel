package Oct12;

import java.util.Scanner;

public class DenaryToBinary {

    public static void main(String[] args) {
        int number; 

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a positive integer");
        number = in.nextInt();

        if (number < 0) {
            System.out.println("Error: Not a positive integer");
        } else { 

            System.out.print("Convert to binary is:");
            convertToBinary(number);
        }
    }

    private static void convertToBinary(int denary) {
        int remainder;

        if (denary <= 1) {
            System.out.print(denary);
            return;
        }

        remainder = denary %2; 
        convertToBinary(denary >> 1);
        System.out.print(remainder);
    }
}

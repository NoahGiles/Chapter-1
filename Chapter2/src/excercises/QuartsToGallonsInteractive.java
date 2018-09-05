package excercises;

import java.util.Scanner;

public class QuartsToGallonsInteractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int Quarts;
		final int Gallons = 4;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many quarts?");
		Quarts = input.nextInt();
		
		int QuartsAndGallons = Quarts / Gallons;
		int LeftoverQuarts = Quarts % Gallons;
		
		System.out.println("A job that needs " + Quarts + " quarts requires " + QuartsAndGallons + " gallons and "
				+ LeftoverQuarts + " quarts.");
		
		
		
	}

}

package excercises;

import java.util.Scanner;

public class InchesToFeetInteractive {

	public static void main(String[] args) {
		
		final int InchesInFoot = 12;
		int Inches;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please insert a number of inches >> ");
		Inches = input.nextInt();
		
		
		int InchesRemaining = Inches % InchesInFoot;
		System.out.println("There are " + Inches / InchesInFoot + " feet with " + InchesRemaining +
				" inches remaining in " + Inches + " inches.");
	}
}

package excercises;

import java.util.Scanner;

public class Eggs {

	public static void main(String[] args) {
		
	
		int Dozen = 12;
		int NumberOfEggs;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please insert a number of eggs to order >> ");
		NumberOfEggs = input.nextInt();
		
		int RemainingEggs = NumberOfEggs % 12;
		int NumOfDozens = NumberOfEggs/Dozen;
		double TotalCost = (RemainingEggs * 0.45) + NumOfDozens * 3.25; 
		System.out.println("You ordered " + NumOfDozens + " dozen eggs at $3.25 per dozen and " 
		+ RemainingEggs + " loose eggs at 45 cents each for a total of $" + TotalCost +  ".");
		
		
	}
}

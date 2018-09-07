package gameZone;

import java.util.Scanner;

public class RandomGuessMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int randomInt;
		int MAX = 5;
		int Guess;
		
		
		
	
		Scanner input = new Scanner(System.in);
		
		randomInt = 1 +(int)(Math.random() * MAX);
		
		
		System.out.println("Guess a number from 1 to 5 >> ");
		Guess = input.nextInt();
		
		if (Guess==randomInt) {
			System.out.print("You got it right! The number was " + Guess + ".");
		}
		if (Guess!=randomInt) {
			System.out.println("You got it wrong. The number was " + randomInt + ".");
		}
		
	}

}

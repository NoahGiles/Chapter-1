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
		
		boolean ;

		System.out.println("The number was " + randomInt);
	}

}

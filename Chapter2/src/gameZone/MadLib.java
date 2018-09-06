package gameZone;

import java.util.Scanner;

public class MadLib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Adj1;
		String Verb1;
		String Noun1;
		String Verb2;
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Please insert an adjective >> ");
		Adj1 = input.next();
		System.out.println("Please insert a verb (with -ing) >> ");
		Verb1 = input.next();
		System.out.println("Please insert a noun >> ");
		Noun1 = input.next();
		System.out.println("Please insert another verb (with -ed) >> ");
		Verb2 = input.next();
		
		System.out.println("The " + Adj1 + " dog was " + Verb1 + " around the yard when he encountered a " + Noun1 + " in his dog house. He "
				+ "chased it around the yard until it " + Verb2 + " and ran away.");
		
		
	}

}

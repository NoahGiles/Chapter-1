package excercises;

import java.util.Scanner;

public class NauticalMilesInteractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int NauticalMile;
		
		Scanner input = new Scanner(System.in);

		
		System.out.print("Please insert a number of desired nautical miles >> ");
		NauticalMile = input.nextInt();
		
		
		
		
		
		final double Kilometer = 1.852 * NauticalMile;
		final double Mile = 1.150779 * NauticalMile;
		
		System.out.println(NauticalMile + " nautical miles are equal to " + Kilometer + " kilometers and " + Mile + 
				" miles.");
	}

}

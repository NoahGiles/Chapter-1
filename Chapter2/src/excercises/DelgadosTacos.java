package excercises;

import java.util.Scanner;

public class DelgadosTacos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("  XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX      ");
		System.out.println("  XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX    ");
		System.out.println("  XXXXXXXXXXXX            XXXXXXXXX  X       ");
		System.out.println("  XXXXXXXXXXX              XXXXXXXX   X      ");
		System.out.println("  X XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX   ");
		System.out.println("  X XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX ");
		System.out.println("  XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX ");
		System.out.println("      X                               X      ");
		int Tacos;
		int Burritos;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many tacos do you want >> ");
		Tacos = input.nextInt();
		System.out.println("How many burritos do you want >> ");
		Burritos = input.nextInt();
		double TacoPrice = Tacos * 1.00;
		double BurritoPrice = Burritos * 1.75;
		double Tax = Tacos + Burritos * .07;
		double TotalPrice = TacoPrice + BurritoPrice + Tax;
		System.out.println("Your total is " + TotalPrice);
		
	}

}

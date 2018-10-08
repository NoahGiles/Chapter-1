package excercises;

import java.util.Scanner;

public class DelgadosTacos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("      XXXXXXXXXXXXXXXXXXXXXXXXXXXXX             ");
		System.out.println("    XXXX                         XXXX           ");
		System.out.println("    XXX         T A C O S         XXX           ");
		System.out.println("    XXXX                         XXXX           ");
		System.out.println("  XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX      ");
		System.out.println("  XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX    ");
		System.out.println("  XXXXXXXXXXXXX            XXXXXXXXXXX  X       ");
		System.out.println("  XXXXXXXXXXXX              XXXXXXXXXX   X      ");
		System.out.println("  XX XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX   ");
		System.out.println("  XX XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX XXX ");
		System.out.println("  XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX ");
		System.out.println("      X                                  X      ");
		int Tacos;
		int Burritos;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many tacos do you want >> ");
		Tacos = input.nextInt();
		
		System.out.println("How many burritos do you want >> ");
		Burritos = input.nextInt();
		
		double TacoPrice = Tacos * 1.00;
		double BurritoPrice = Burritos * 1.75;
		double Tax = (Tacos + Burritos) * .07;
		double TotalPrice = TacoPrice + BurritoPrice + Tax;
		System.out.println("Your total is $" + TotalPrice + ". Enjoy your food.");
		
		
	}

}

package excercises;

import java.util.Scanner;

public class FreeLance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Name;
		int Num1;
		int Num2;
		int Total;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your name >> ");
		Name = input.nextInt();
		System.out.print("Please enter first number >> ");
		Num1 = input.nextInt();
		System.out.print("Please enter second number >> ");
		Num2 = input.nextInt();
		System.out.print("Your total is " + Total);
		Total = Num1 + Num2;
		
		
	}

}

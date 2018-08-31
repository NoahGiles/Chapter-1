package excercises;

import java.util.Scanner;

public class FreeLance {

	public static void main(String[] args) {
		String Name;
		int Num1;
		int Num2;
		int Total;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your name >> ");
		Name = input.nextLine();
		
		System.out.print("Please enter a first number >> ");
		Num1 = input.nextInt();
		
		System.out.print("Please enter a second number >> ");
		Num2 = input.nextInt();
	
		Total = Num1 + Num2;
		System.out.println("Your name is " + Name + ", and your total is " + Total);
		
		
		
		
	}

}

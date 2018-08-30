package youDoIt;

import java.util.Scanner;

public class IntegerDemoInteractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int anInt;
		byte AByte;
		short AShort;
		long ALong;
		String name;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter an integer >> ");
		anInt = input.nextInt();
		System.out.println("Please enter a Byte >> ");
		AByte = input.nextByte();
		System.out.println("Please enter a short >> ");
		AShort = input.nextShort();
		System.out.println("Please enter a long >> ");
		ALong = input.nextLong();
		System.out.println("What is your name >> ");
		name = input.next();
		
		System.out.println("Your name is " + name);
		System.out.println("The int is " + anInt);
		System.out.println("The byte is " + AByte);
		System.out.println("The short is " +AShort);
		System.out.println("The long is " + ALong);
		
		
	}

}

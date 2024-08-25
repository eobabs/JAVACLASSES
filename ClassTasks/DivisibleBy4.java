//Write a program that prompts the user to enter an integer and determines whether it is divisible by 4

import java.util.Scanner;

public class DivisibleBy4{

	public static void main(String... division){
		
		Scanner input = new Scanner(System.in);

		System.out.println();
		System.out.print("Enter your integer: ");
		int number = input.nextInt();

		if (number % 4 == 0) System.out.println("It is divisible by 4");
		else System.out.println("It is not divisible by 4");

	}

}
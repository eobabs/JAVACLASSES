import java.util.Scanner;

public class NumberOfFactors{

	public static void main(String... task){


		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		int count = 0;

		for (int number2 = 1; number2 <= number; number2++ ) {

		if (number % number2 == 0) count++;

			
		}System.out.print(count);

	}
}
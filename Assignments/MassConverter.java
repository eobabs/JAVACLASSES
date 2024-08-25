import java.util.Scanner;

public class MassConverter{
	public static void main (String [] args){

		Scanner input = new Scanner(System.in);

		System.out.println("\nThis program converts the mass of a user from pounds(lb) to kilograms(kg)\nThe coversion rate is 1lb = 0.454kg\n");

		System.out.print("Enter a number in pounds:   ");
		
		double userInput = input.nextDouble();
		
		double coversionValue = 0.454;
		
		double userOutput = userInput * coversionValue;

		System.out.printf(userInput + "   pounds is  " + userOutput + "  kilograms");


	}

}
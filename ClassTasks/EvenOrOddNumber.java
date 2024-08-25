import java.util.Scanner;

public class EvenOrOddNumber{

	public static void main(String... classtask){

		Scanner userInput = new Scanner (System.in);
		
		System.out.print("\nEnter your number: ");
		int numberEntered = userInput.nextInt();

		if (numberEntered % 2 == 0){
		 System.out.println(numberEntered + " is an even number");
		}

		else {System.out.println(numberEntered + " is an odd number");
		}

	}


}
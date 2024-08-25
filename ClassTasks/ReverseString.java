import java.util.Scanner;

public class ReverseString{

	public static void main(String... classtask){

		Scanner input = new Scanner (System.in);
		
		System.out.print("\nEnter a string: ");
		String word = input.nextLine();

		StringBuilder userInput= new StringBuilder (word);
		StringBuilder reverse = userInput.reverse();

		System.out.print(userInput);
	}
}
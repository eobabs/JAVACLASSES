import java.util.Scanner;

public class PalindromeInteger{

     public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("\nEnter a three-digit integer: ");

	int integer = input.nextInt();

	int unitValue = integer % 10;
	int tensValue = (integer/10) % 10;
	int hundredsValue = (integer/10) / 10;

	int newNumber = (unitValue * 100) + (tensValue * 10) + hundredsValue;

		if (integer == newNumber){
		 		System.out.println(integer + " is a palindrome");
			}

			else {
				System.out.println(integer + " is not a palindrome");
			}


	}

}
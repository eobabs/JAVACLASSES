import java.util.Scanner;

public class SumOfDigits{

     public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("\nEnter a number between 0 and 1000: ");

	int anyNumber = input.nextInt();

	int unitValue = anyNumber % 10;

	int newNumber = (anyNumber/10);

	int sum = unitValue + newNumb er/10 + newNumber%10;

	System.out.print("\nThe sum of the digits is  " + sum );

     }

}


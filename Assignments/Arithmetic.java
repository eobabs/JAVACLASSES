import java.util.Scanner;

public class Arithmetic{
   public static void main (String [] args){

	Scanner input = new Scanner(System.in);

	System.out.println("\nThis program obtains two INTEGERS (WHOLE NUMBERS)\nIt computes the square of each, the sum and difference of the squares\n");

	System.out.print("Enter the first integer:   ");
		
	int int1 = input.nextInt();
		
	System.out.print("Enter the second integer:   ");	

	int int2 = input.nextInt();
		
	int a = int1 * int1;
	int b = int2 * int2;
	int c = a + b;
	int d = a - b;

	System.out.printf("%nThe square of the first integer is: %d%nThe square of the second integer is: %d%nThe sum of their squares is: %d%nThe difference of their squares is:%d%n",  a , b , c, d);


	}

}
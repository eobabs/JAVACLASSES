import java.util.Scanner;

public class ArithmeticDetailsForThreeIntegers{
    public static void main(String[] args){
       
	Scanner input = new Scanner(System.in);

        System.out.print("\nEnter first integer: ");
        int number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int number2 = input.nextInt();

        System.out.print("Enter third integer: ");
        int number3 = input.nextInt();

        int largest = number1;
        int smallest = number1;

        if (number2 > largest) largest = number2;
        if (number3 > largest) largest = number3;
        
        if (number2 < smallest) smallest = number2;
        if (number3 < smallest) smallest = number3;
        
	int sum = number1 + number2 + number3;
        int average = sum/3;
	int product = number1 * number2 * number3;

	System.out.printf("\nThe sum of the three integers is %d%nThe product of the three integers is %d%nThe average of the three integers is %d%n", sum, product, average);
        
        System.out.printf("The largest of the three integers is %d%nThe smallest of the three integers is %d%n", largest, smallest);
    }
}
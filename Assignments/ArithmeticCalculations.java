import java.util.Scanner;

public class ArithmeticCalculations{
    public static void main(String[] args){
       
	Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int number1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int number2 = input.nextInt();
        System.out.print("Enter third integer: ");
        int number3 = input.nextInt();

        int largest = number1;
        int smallest = number1;
	int sum = number1 + number2 + number3;
	int product = number1 * number2 * number3;
	int average = sum/3;

        if (number2 > largest){
            largest = number2;}
        if (number3 > largest){
            largest = number3;}
      
        if (number2 < smallest){
            smallest = number2;}
        if (number3 < smallest){
            smallest = number3;}
        
        System.out.printf("%nThe sum of the numbers is %d%nThe average of the numbers is %d%nThe product of the numbers is %d%nThe smallest of the numbers is %d%nThe largest of the numbersis %d%n", sum, average, product, smallest, largest );
    }
}
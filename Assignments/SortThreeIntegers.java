import java.util.Scanner;

public class SortThreeNumbers{

	public static void main(String... classtask){

		Scanner input = new Scanner (System.in);
		
		System.out.print("\nEnter first number: ");
		double firstInput = input.nextDouble();

		System.out.print("\nEnter second number: ");
		double secondInput = input.nextDouble();

		System.out.print("\nEnter third number: ");
		double thirdInput = input.nextDouble();
		
		displaySortedNumbers(firstInput, secondInput, thirdInput);
		}


		public static void displaySortedNumbers(double numberOne, double numberTwo, double numberThree){
		if (numberOne >= numberTwo && numberOne >= numberThree) {
			if (numberTwo > numberThree) System.out.println("The numbers in decreasing order are " +  numberOne + " " + numberTwo + " " + numberThree);
			else System.out.println("The numbers in decreasing order are " +  numberOne + " " + numberThree  + " " + numberTwo);
			}

		if (numberTwo>= numberOne && numberTwo >= numberThree) {
			if (numberOne > numberThree) System.out.println("The numbers in decreasing order are " +  numberTwo + " " + numberOne + " " + numberThree);
			else System.out.println("The numbers in decreasing order are " +  numberTwo + " " + numberThree  + " " + numberOne);
			}
	
		if (numberThree>= numberOne && numberThree >= numberTwo ) {
			if (numberOne > numberTwo) System.out.println("The numbers in decreasing order are " + numberThree  + " " + numberOne + " " + numberTwo);
			else System.out.println("The numbers in decreasing order are " + numberThree  + " " + numberTwo + " " + numberOne);
			}


		}
}
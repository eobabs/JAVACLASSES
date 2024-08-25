import java.util.Scanner;

public class ComparisonInClass{

   public static void main (String [] args){

	Scanner input = new Scanner (System.in);

	System.out.print("Enter number one:");
	double numberOne = input.nextDouble();
	

	System.out.print("Enter number two:");
	double numberTwo = input.nextDouble();

	if (numberOne > numberTwo){
	System.out.print("Number One is Greater");
	}

	if (numberOne < numberTwo){
	System.out.print("Number Two is Greater");
	}
	if (numberOne == numberTwo){
	System.out.print("The Numbers are Equal");
	}

}

}
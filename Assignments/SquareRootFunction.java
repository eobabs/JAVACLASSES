import java.util.Scanner;

public class SquareRootFunction {

	public static void main(String[] args){ 

	calculate();

	}

	public static void calculate() {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter your primary number: ");
        double numberInputted = userInput.nextDouble();

	getSquareRoot(numberInputted);
    	

	}



	public static double getSquareRoot(double number){

	double squareRoot = Math.sqrt(number);

	System.out.printf("The square root of %f is %.4f" ,number, squareRoot);

	return squareRoot;

	}
}
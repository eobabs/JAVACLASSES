import java.util.Scanner;

public class Kata {

	public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int firstNumber = userInput.nextInt();
	System.out.print("\nEnter a number: ");
	int secondNumber = userInput.nextInt();

	factorialOf(firstNumber);

	isPrimeNumber(firstNumber);
	
	isEven(firstNumber);

	squareOf(firstNumber);

	subtract (firstNumber, secondNumber);

	System.out.println(isEven(firstNumber)); 
	System.out.println(isPrimeNumber(firstNumber));
	factorOf(firstNumber);
    	}




public static long squareOf (int check){

	long squareFunction = check * check;

	System.out.println("The square of " + check + " is " + squareFunction);

	return squareFunction;

}

public static int subtract (int numberOne, int numberTwo){

	if (numberOne < numberTwo) {
	int temporaryNumber = numberOne;
	numberOne = numberTwo;
	numberTwo = temporaryNumber;
	}

	int subtractionFraction = numberOne - numberTwo;

	System.out.println("The difference " + subtractionFraction);

	return subtractionFraction;

}





	public static boolean isEven(int evenNumber){

	if (evenNumber % 2 == 0) return true;
	else return false;

	}

	public static long factorialOf(int factorialNumber ) {

	long product =  1; 
	int counters = 1;

	while (counters <= factorialNumber) { 
 	product *= counters ;
	counters++;

	}
	System.out.println("The factorial is: " + product);
	return product; 

	}

	    	





	public static boolean isPrimeNumber (int numberCheck){
	int primefactors = factorOf(numberCheck);
	if (primefactors == 2) return true;  
        else return false;
        	
	}

	public static int factorOf(int numberChecker){
	 
        int counter = 0; 

        for (int count = 1;count<=numberChecker; count ++) {
            if (numberChecker % count == 0) counter++; 
            
        }
	return counter;
	} 










}
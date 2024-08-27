import java.util.Scanner;

public class Kata {

	public static void main(String[] args){ 

	calculateAll();

	}

	public static void calculateAll() {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter your primary number: ");
        int firstNumber = userInput.nextInt();

	System.out.print("\nEnter your secondary number: ");
	int secondNumber = userInput.nextInt();

	System.out.println();
	factorialOf(firstNumber);
	squareOf(firstNumber);
	subtract (firstNumber, secondNumber);
	divide (firstNumber, secondNumber);
	System.out.println(isEven(firstNumber)); 
	System.out.println(isPrimeNumber(firstNumber));
	System.out.println(isSquare(firstNumber));
	System.out.println("The number of factors is: " + factorOf(firstNumber));
	System.out.print(isNumberPalindrome(firstNumber));
    	

	}


	public static boolean isSquare (int numberToCheck){
	
	int squareRoot = (int) Math.sqrt(numberToCheck);
	return squareRoot * squareRoot == numberToCheck;
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


	public static float divide (int numberOne, int numberTwo){

	if (numberTwo != 0 ) { int quotient = numberOne/numberTwo;

	System.out.println("The quotient is " + quotient);

	return quotient;
	}
	else return 0;


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

	public static boolean isNumberPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;
        
        while (number != 0) {
            int extractedValue = number % 10;
            reversedNumber = reversedNumber * 10 + extractedValue;
            number /= 10;
        }
        if (originalNumber == reversedNumber) {
          return originalNumber == reversedNumber;         
        } else {
            return originalNumber == reversedNumber;
        }

	}









}
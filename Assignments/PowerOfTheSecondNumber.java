import java.util.Scanner;

public class PowerOfTheSecondNumber {
  public static void main(String[] args) {
        
     Scanner userInput = new Scanner(System.in);
        
    	int firstNumber = userInput.nextInt();
	int secondNumber = userInput.nextInt();

	double power     = firstNumber**secondNumber;
 
	System.out.println("The value of " + firstNumber + "raised to the power of " + secondNumber + "is " + exponent );

}

}
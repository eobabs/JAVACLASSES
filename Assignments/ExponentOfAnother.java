import java.util.Scanner;
public class ExponentOfAnother {

	public static void main(String[] args) {
     
     	Scanner userInput = new Scanner(System.in); 

	System.out.print("\nEnter the first number: "); 
	int firstNumber = userInput.nextInt();

	System.out.print("Enter the second number: "); 
	int secondNumber = userInput.nextInt();	

	int power = 1;
	int numberOfTimes = 1;
     
       	while (numberOfTimes <= secondNumber) {
		power *= firstNumber;
    
     		numberOfTimes =  numberOfTimes + 1;
                 
          }    
 	System.out.print("\nThe first number raised to power of the second number is: " + power + "\n"); 
        }
}

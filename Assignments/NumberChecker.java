import java.util.Scanner;
public class NumberChecker{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
			
		int totalNegativeNumbers=0;	
		int totalPositveNumbers=0;	
		int totalZero=0;	
		
		System.out.print("Enter first integer: ");	
		int number1 = input.nextInt();	
		
		System.out.print("Enter second integer: ");	
		int number2 = input.nextInt();	
		
		System.out.print("Enter third integer: ");	
		int number3 = input.nextInt();	
		
		System.out.print("Enter fourth integer: ");	
		int number4 = input.nextInt();	
		
		System.out.print("Enter fifth integer: ");	
		int number5 = input.nextInt();	
		
		
		if (number1 < 0) totalNegativeNumbers = totalNegativeNumbers + 1;
		if (number2 < 0) totalNegativeNumbers = totalNegativeNumbers + 1;
		if (number3 < 0) totalNegativeNumbers = totalNegativeNumbers + 1;
		if (number4 < 0) totalNegativeNumbers = totalNegativeNumbers + 1;
		if (number5 < 0) totalNegativeNumbers = totalNegativeNumbers + 1;
		
		if (number1 > 0) totalPositveNumbers = totalPositveNumbers + 1;
		if (number2 > 0) totalPositveNumbers = totalPositveNumbers + 1;
		if (number3 > 0) totalPositveNumbers = totalPositveNumbers + 1;
		if (number4 > 0) totalPositveNumbers = totalPositveNumbers + 1;
		if (number5 > 0) totalPositveNumbers = totalPositveNumbers + 1;

		if (number1 == 0) totalZero = totalZero + 1;
		if (number2 == 0) totalZero = totalZero + 1;
		if (number3 == 0) totalZero = totalZero + 1;
		if (number4 == 0) totalZero = totalZero + 1;
		if (number5 == 0) totalZero = totalZero + 1;
		
		System.out.printf("\nTotal negative numbers: %d\n", totalNegativeNumbers);		
		System.out.printf("Total postive numbers: %d\n", totalPositveNumbers);	
		System.out.printf("Total zero numbers: %d\n", totalZero);	

	} 

} 
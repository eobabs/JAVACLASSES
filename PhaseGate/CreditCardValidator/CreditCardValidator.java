import java.util.Scanner;
import java.util.Arrays;

public class CreditCardValidator {

	public static int checkValidity(long cardNumber){
		
		long [] cardDigits = extractDigits(cardNumber);
	
		int length = cardDigits.length; 

		System.out.println("Credit Card Type: " + getCardType(cardNumber));

		System.out.print("Credit Card Digits: ");
		for (long digits:cardDigits) System.out.print(digits);

		System.out.println("\nCredit Card Digit Length: " + length);

		int totalSum;
		
		if (length % 2 == 0) totalSum = getTotalCaseOne(cardDigits);
		else totalSum = getTotalCaseTwo(cardDigits);

		return totalSum;

	}

	public static int getTotalCaseOne(long [] card){ 
		
		int sum = 0;
		int sumTwo = 0;

		for (int index = 0; index < card.length; index++){

			if (index % 2 == 1) sum += card[index];
			
			if (index % 2 == 0){
				long product = 2 * card[index];
				if (product > 9) product -= 9;
				sumTwo += product;
			}

		}
			int totalSum = sum + sumTwo;

		
		return totalSum;

	}

	public static int getTotalCaseTwo(long [] card){ 
		
		int sum = 0;
		int sumTwo = 0;

		for (int index = 0; index < card.length; index++){

			if (index % 2 == 0) sum += card[index];
			
			if (index % 2 == 1){
				long product = 2 * card[index];
				if (product > 9) product -= 9;
				sumTwo += product;
			}

		}
			int totalSum = sum + sumTwo;



		return totalSum;

	}


	public static int getCardLength(long cardNumber){
        
	        int counter = 0;
        	long temp = cardNumber;

        	while (temp > 0) {
            		temp /= 10;
            		counter++;
        	}

		return counter;
		
	}

   	public static long[] extractDigits(long cardNumber) {

		int length = getCardLength(cardNumber);

        	long[] extractedDigits = new long[length];

        	for (int index = length - 1; index >= 0; index--) {
            		extractedDigits[index] = cardNumber % 10; 
            		cardNumber /= 10;            
        	}

		
		
        	return extractedDigits;
    	}

	public static String getCardType(long card){

		long [] cardType = extractDigits(card);

		if (cardType[0] == 4){
			return "Visa Cards";
		}else if (cardType[0] == 5){
			return "MasterCard";
		}else if(cardType[0] == 6){
			return "Discover Cards";
		}else if (cardType[0] == 3 && cardType[1] == 7){
			return "American Express Cards";
		}else{		
			return "Unknown Card";	
		}
	}

    	public static void main(String[] args) {
        	Scanner numberToArray = new Scanner(System.in);

        	System.out.println("Hello, Kindly Enter Card details to verify");
	        long number = numberToArray.nextLong();

		if (number < 0) number = -number;
	
        	int totalSum = checkValidity(number);

		if (totalSum % 10 == 0) System.out.println("Credit Card Validity Status: Valid");
		else System.out.println("Credit Card Validity Status: Invalid");
		
					
		
 	}
}


import java.util.Scanner;
import java.util.Arrays;

public class CreditCardValidator {

   	public static long[] extractDigits(long number) {

		if (number < 0) number = number * -1;
        
	        int counter = 0;
        	long temp = number;

        	while (temp > 0) {
            		temp /= 10;
            		counter++;
        	}

        	long[] extractedDigits = new long[counter];

        	for (int index = counter - 1; index >= 0; index--) {
            		extractedDigits[index] = number % 10; 
            		number /= 10;            
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

        	System.out.print("Enter a number: ");
	        long number = numberToArray.nextLong();
	
        	System.out.println("List of Digits: ");

		System.out.println(Arrays.toString(extractDigits(number)));
		System.out.print(getCardType(number));
 	}
}


public class PrimeNumberMethod{


	public static void main(String... prime){
		System.out.print("The prime numbers between 1 and 10000 are\n");
		printPrimeNumbers(700);

	}

	public static void printPrimeNumbers(int numberOfPrimeNumbers){
		
		int counter = 0;
		int number = 2;
		
		for (int count = 0;count < numberOfPrimeNumbers;count++){

		if (isPrimeNumber (number)) {
			counter++;
			if (counter % 8 == 0)
			System.out.println(number + " ");
			else System.out.print(number + " ");
			}
		number++;
		}
	}
			
	public static boolean isPrimeNumber (int numberCheck){
	int primefactors = factorOf(numberCheck);
	if (primefactors == 2) return true;  
        else return false;
        	
	}

	public static int factorOf(int numberChecker){
	 
        int counter = 0; 

        for (int count = 1; count<=numberChecker; count ++) {
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
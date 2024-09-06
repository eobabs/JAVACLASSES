public class NumberOfPrimeNumberMethod{


	public static void main(String... prime){
		System.out.print("The first 10000 prime numbers are\n");
		printPrimeNumbers(10000);

	}

	public static void printPrimeNumbers(int numberOfPrimeNumbers){
		int count = 0;
		int number = 2;
		while (count < numberOfPrimeNumbers){ 
		
		if (isPrimeNumber (number)) {
			count++;
			if (count % 15 == 0)
			System.out.print(number + " ");
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




} 
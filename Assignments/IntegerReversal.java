import java.util.*;

public class IntegerReversal{

	public static void main(String... args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a number: ");
	int integer = input.nextInt();
	
	reverse(integer);



	}



	public static int reverse(int number){
        int originalNumber = number;
        int reversedNumber = 0;
        
        while (number != 0) {
            int extractedValue = number % 10;
            reversedNumber = reversedNumber * 10 + extractedValue;
            number /= 10;
        }
	System.out.println("The reverse of " + originalNumber + " is " + reversedNumber );
          return reversedNumber;         
        

	}


}
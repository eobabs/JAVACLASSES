import java.util.*;

public class ReverseandPalindromeCheck{

	public static void main(String... args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a number: ");
	int integer = input.nextInt();
	
	System.out.println(isNumberPalindrome(integer));



	}


	public static boolean isNumberPalindrome(int number) {
        if (number == reverse(number)) {
          return number == reverse(number);         
        } else {
            return  number == reverse(number);
        }

	}

	public static int reverse(int number){
        int originalNumber = number;
        int reversedNumber = 0;
        
        while (number != 0) {
            int extractedValue = number % 10;
            reversedNumber = reversedNumber * 10 + extractedValue;
            number /= 10;
        }

          return reversedNumber;         
        

	}


}
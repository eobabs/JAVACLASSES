import java.util.Scanner;

public class SeperationOfDigits{

     public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("\nEnter a five digits integer: ");

	int theInteger = input.nextInt();

	int unitDigit = theInteger % 10;
	int first4Digits = theInteger/10;
	int tensDigit = first4Digits % 10;
	int first3Digits = first4Digits/10;
	int hundredsDigit = first3Digits % 10;
	int first2Digits = first3Digits/10;
	int thousandsDigit = first2Digits % 10;
	int firstDigit = first2Digits/10;
		
	
	if (theInteger > 99999){System.out.print("Not valid for this program");}
	else{
	if (theInteger < 9999){System.out.print("Not valid for this program");}
	else{
	System.out.printf("%d   %d   %d   %d   %d", firstDigit, thousandsDigit, hundredsDigit, tensDigit, unitDigit);
	}
	}
}

}


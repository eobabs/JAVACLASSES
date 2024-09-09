import java.util.*;

public class PrivacyCryptography{


	public static void main(String... args){

	Scanner encrypt = new Scanner(System.in);
		
	System.out.print("\nEnter a four digit integer: ");
	int code = encrypt.nextInt();

	int digitA = code/1000;
	int digitB = (code/100) % 10;
	int digitC = (code/10) % 10;
	int digitD = code % 10;

	int newCodeA = (digitA + 7) % 10;
	int newCodeB = (digitB + 7) % 10;
	int newCodeC = (digitC + 7) % 10;
	int newCodeD = (digitD + 7) % 10;

	System.out.println("Your four digit integer is " + code + " and your encrypted code is " + newCodeC + newCodeD + newCodeA + newCodeB);

	//To decrypt the code

	int reverseNewCodeA = newCodeA - 7;
	int reverseNewCodeB = newCodeB - 7;
	int reverseNewCodeC = newCodeC - 7;
	int reverseNewCodeD = newCodeD - 7;

	if (reverseNewCodeA < 0) reverseNewCodeA = reverseNewCodeA + 10;
	if (reverseNewCodeB < 0) reverseNewCodeB = reverseNewCodeB + 10;
	if (reverseNewCodeC < 0) reverseNewCodeC = reverseNewCodeC + 10;
	if (reverseNewCodeD < 0) reverseNewCodeD = reverseNewCodeD + 10;



	System.out.println("\nUpon decryption " +  reverseNewCodeA + reverseNewCodeB + reverseNewCodeC + reverseNewCodeD);


	





	}	


}

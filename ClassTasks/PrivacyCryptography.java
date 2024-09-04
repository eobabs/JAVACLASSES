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

	int encryptedCode = (1000 * newCodeC) + (100 * newCodeD) + (10 * newCodeA) + newCodeB;

	System.out.printf("%nYour four digit integer is %d and your encrypted code is %d %n", code, encryptedCode);

	//To decrypt the code

	int reverseNewCodeA = newCodeA + 3;
	int reverseNewCodeB = newCodeB + 3;
	int reverseNewCodeC = newCodeC + 3;
	int reverseNewCodeD = newCodeD + 3;

	int decryptedCode = (1000 * reverseNewCodeA) + (100 * reverseNewCodeB) + (10 * reverseNewCodeC) + reverseNewCodeD;

	System.out.printf("%nYour encrypted code is %d and your decrypted code is %d %n", encryptedCode, decryptedCode);


	





	}	


}

import java.util.*;
public class ValidatingUserInput {

	public static void main (String... args){

	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter a number: ");
	int number = scanner.nextInt();
	
	while(number != 1) {

	System.out.print("Enter a number: ");
	number = scanner.nextInt();

	}

	}

}
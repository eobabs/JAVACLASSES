import java.util.Scanner;

public class TestIncrement {

    public static void main(String... args) {

	Scanner test = new Scanner (System.in);

	int answer = 1;
	
	int number = test.nextInt();

	for (int count = 1; count <= number; ++count){ answer = answer * count; if (answer == number){ 

	System.out.print(answer + " ");}

		
	}
   }
}
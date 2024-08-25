import java.util.Scanner;

public class PassOrFail2 {

    public static void main(String... args) {

        Scanner userInput = new Scanner(System.in);
	int failedGuys = 0;
	int passedGuys = 0;
	
	for (int count = 1; count <=10; count++){

	System.out.print("Enter a number: ");
	int number = userInput.nextInt();
	if (number < 50){System.out.println("You failed");
	failedGuys++;
	}
	else {System.out.println("You passed");
	passedGuys++;
		}
	


	}

	System.out.println("Nunmber of people that passed: " + passedGuys);
	System.out.println("Nunmber of people that failed: " + failedGuys);
	
}

}

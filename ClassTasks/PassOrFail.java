import java.util.Scanner;

public class PassOrFail {

    public static void main(String... args) {

        Scanner userInput = new Scanner(System.in);
	
	int count = 1;
	
	while (count <=10){
	System.out.print("Enter a number: ");
	int number = userInput.nextInt();
	if (number < 50){System.out.println("You failed");}
	else {System.out.println("You passed");}
	count++;
	}
	
}

}

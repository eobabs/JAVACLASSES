import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = userInput.nextInt();

        int count = 1; 
        int counter = 0; 

        while (count <= number) {
            if (number % count == 0) counter++; 
            count++;
        }

        if (counter == 2) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        
    }
}

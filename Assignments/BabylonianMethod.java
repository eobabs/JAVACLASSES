import java.util.Scanner;

public class BabylonianMethod {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        double number = scanner.nextDouble();

        if (number < 0) {
            System.out.println("Invalid input. Please enter a positive number.");
        } else {
            double result = sqrt(number);
            System.out.printf("The square root of %.2f is approximately %.4f%n", number, result);
        }

    }

	public static double sqrt(double numberToCheck) {
 
        double guess = 1.0;
        double accuracyMeasure = 0.0000001; 

        while (true) {
            double nextGuess = (guess + (numberToCheck / guess)) / 2;
            
            if (Math.abs(nextGuess - guess) < accuracyMeasure) {
                return nextGuess;
            }
            
            guess = nextGuess;
        }
    }
}
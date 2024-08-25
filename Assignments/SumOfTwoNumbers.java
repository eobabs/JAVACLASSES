import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String continuationRequest = "yes";

        do {
            System.out.print("\nEnter the first number: ");
            int numberOne = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int numberTwo = scanner.nextInt();

            int sum = numberOne + numberTwo;
            System.out.println("\nThe sum of the two numbers is: " + sum);

            System.out.print("Do you want to continue? (yes/no): ");
            continuationRequest = scanner.next();

        } while (continuationRequest.equalsIgnoreCase("yes"));

        System.out.println("\nThank you for trying this application.");
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first and second numbers separated by a space:");
        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();

        System.out.print("Your numbers are: " + firstNumber + " " + secondNumber);
}

}
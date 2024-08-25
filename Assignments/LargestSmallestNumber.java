import java.util.Scanner;

public class LargestSmallestNumber {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String continuePrompt;

      System.out.print("Enter your number: ");
      int number = scanner.nextInt();
      int largestNumber = number;
      int smallestNumber = number;

      do {
           System.out.print("Enter your number: ");
           number = scanner.nextInt();

           if (number > largest) largest = number;
           if (number < smallest) smallest = number; 

           System.out.print("Do you want to enter another number? (yes/no): ");
            continuePrompt = scanner.next();

        } while (continuePrompt.equalsIgnoreCase("yes"));

        System.out.println("The largest number of the list is: " + largestNumber);
        System.out.println("The largest number of the list is: " + smallestNumber);

         }
}

import java.util.Scanner;

public class Multiple{
    public static void main(String[] args){
       
	Scanner input = new Scanner(System.in);

        System.out.print("\nEnter first integer: ");
        int a = input.nextInt();

	System.out.print("Enter second integer: ");
        int b = input.nextInt();

	int tripleA = 3 * a;
	int doubleB = 2 * b;
        
        if (tripleA % doubleB > 0){
            System.out.printf("%n%d is not a mutiple of %d%n", a, b);
	}
        if (tripleA % doubleB == 0){
            System.out.printf("%n%d is a mutiple of %d%n", a, b);
	}
      
    }
}
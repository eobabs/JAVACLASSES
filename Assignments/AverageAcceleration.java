import java.util.Scanner;

public class AverageAcceleration{
    public static void main (String [] args){

	Scanner sc = new Scanner(System.in);
	Scanner input = new Scanner(System.in);

	System.out.print("\nEnter v0, v1 and t: ");
		
	double intialVelocity = input.nextDouble();
		
	double finalVelocity = input.nextDouble();

	double timeTaken = input.nextDouble();
		
	double acceleration = (finalVelocity - intialVelocity)/(timeTaken);

	System.out.printf("%nThe average acceleration is %.4fm%cs%c%d%n", acceleration, '/', '^',2);


	}

}
import java.util.Scanner;

public class RunwayLength{
    public static void main (String [] args){

	Scanner input = new Scanner(System.in);

	System.out.print("\nEnter speed and acceleration: ");
		
	double takeOffSpeed = input.nextDouble();
		
	double acceleration = input.nextDouble();
		
	double runwayLength = Math.pow(takeOffSpeed,2)/(2*acceleration);

	System.out.printf("%nThe minimum runway length for this airplane is %.3fm%n", runwayLength);


	}

}
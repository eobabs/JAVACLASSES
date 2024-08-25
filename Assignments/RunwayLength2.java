import java.util.Scanner;

public class RunwayLength2{
    public static void main (String [] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter speed and acceleration: ");
		
	double takeOffSpeed = input.nextDouble(); 

	double acceleration = input.nextDouble();
		
	double runwayLength = Math.pow(takeOffSpeed,2)/(2*acceleration);

	System.out.printf("The minimum runway length for this airplane is %.3fm", runwayLength);


	}

}
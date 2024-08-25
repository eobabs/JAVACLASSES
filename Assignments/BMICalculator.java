import java.util.Scanner;

public class BMICalculator{
    public static void main (String [] args){

	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the weight in pounds: ");
		
	double weight = input.nextDouble();

	System.out.print("\nEnter the height in inches: ");
		
	double height = input.nextDouble();

	double massConvertConstant = 0.45359237;

	double heightConvertConstant = 0.0254;

	double newMass = weight * massConvertConstant;'s
		
	double newHeight = height * heightConvertConstant;

	double bodyMassIndex = newMass /(Math.pow(newHeight,2));

	System.out.printf("%nBMI IS %.4f%n", bodyMassIndex);

	if (bodyMassIndex <= 8.5) System.out.print("\nYou are underweight");

	}

}
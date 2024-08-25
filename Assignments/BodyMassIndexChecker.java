import java.util.Scanner;

public class BodyMassIndexChecker{
    public static void main (String [] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter the weight in pounds: ");
	double massInPounds = input.nextDouble();

	System.out.print("\nEnter the height in inches: ");
	double heightInInches = input.nextDouble();

	double bodyMassIndex = (massInPounds*703)/(Math.pow(heightInInches,2));

	System.out.printf("%nBMI IS %.4f%n", bodyMassIndex);

	if (bodyMassIndex >= 30) {System.out.print("You are Obese");}
	else {
	if (bodyMassIndex >= 25) {System.out.print("You are overweight");}
	else {
	if (bodyMassIndex >= 18.5) {System.out.print("You are Normal weight");}
	else{
	System.out.print("You are underweight");
		}
		}
		}
		
     }

}
import java.util.Scanner;

public class EnergyCalculator{
    public static void main (String [] args){

	Scanner sc = new Scanner(System.in);
	Scanner input = new Scanner(System.in);

	System.out.print("\nEnter the amount of water in kilograms: ");
		
	double waterWeight = input.nextDouble();

	System.out.print("Enter the initial temperature: ");
		
	double initialT = input.nextDouble();

	System.out.print("Enter the final temperature: ");

	double finalT = input.nextDouble();
		
	double energy = waterWeight * (finalT - initialT) * 4184;

	System.out.printf("%nThe energy needed is %.1fJ%n", energy);


	}

}
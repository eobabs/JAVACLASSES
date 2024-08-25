import java.util.Scanner;

public class TripCost{
	public static void main (String [] args){

		Scanner input = new Scanner(System.in);

		System.out.println("\nThis program calculates the cost of a trip\nIt takes into consideration Fuel Efficiency, Price of fuel and the Distance Covered\n");

		System.out.print("Enter the driving distance:   ");
		
		double distanceCovered = input.nextDouble();

		System.out.print("Enter miles per gallon:   ");
		
		double fuelEfficiency = input.nextDouble();
		
		System.out.print("Enter price per gallon:   ");
		
		double fuelPrice = input.nextDouble();
		
		double transportFare = (distanceCovered * fuelPrice)/fuelEfficiency;

		System.out.printf("The cost of driving is %c%.2f", '$', transportFare);


	}

}
import java.util.Scanner;

public class GasMileage{

	public static void main(String... gas){

	Scanner driver = new Scanner(System.in);

	System.out.print("Enter number of trips: ");
	int numberOfTrips = driver.nextInt();
	
	float sumOfMiles = 0;
	float numberOfGallons = 0;
	float grandAverage = 1;
		
	for (int count = 1; count <= numberOfTrips; count+=1) {
	System.out.print("\nTrip" + count);
	System.out.print("\nEnter miles driven: ");
	int miles = driver.nextInt();
	
	System.out.print("Enter number of gallons used: ");
	int gallons = driver.nextInt();

	float average = miles/gallons;
	sumOfMiles = sumOfMiles + miles;
	numberOfGallons = numberOfGallons + gallons;
	

		
	System.out.println("The average miles per gallon for this trip is " + average + "miles per gallon");

	} grandAverage = sumOfMiles/numberOfGallons;
		System.out.println("\nThe overall miles per gallon for the " + numberOfTrips + " trips is " + grandAverage + "miles per gallon");


	}


}
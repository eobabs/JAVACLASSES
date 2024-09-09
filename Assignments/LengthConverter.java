import java.util.*;

public class LengthConverter{

	public static void main(String... args){

	Scanner input = new Scanner(System.in);
	
	System.out.println("How many integers do you want to see on your table? ");
	int numberOfRows = input.nextInt();

	printMileToKilometerTable(numberOfRows);
	
	}

	public static void printMileToKilometerTable (int number){

		System.out.printf("%s%5s%s%8s%s%5s%s%n", "Miles", "", "Kilometers", "", "Kilometers","", "Miles" );
		for (int count = 1; count <= number ; count ++){
		double kilometerValue = mileToKilometer(count);
		double milesValue = kilometerToMile(count);
	
		System.out.printf("%d%10s%f%12s%d%10s%f%n", count, "" ,kilometerValue, "", count, "", milesValue);
		}

	}



	public static double mileToKilometer(double mile){
	
	double kilometerConverted = mile * 1.60934;

	
	return kilometerConverted;

	}

	public static double kilometerToMile(double kilometer){
	
	double mileConverted = kilometer * 0.621371;

	
	return mileConverted;	

	}

}
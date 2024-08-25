import java.util.Scanner;

public class DistanceConverter{
	public static void main (String [] args){

		Scanner input = new Scanner(System.in);

		System.out.println("\nThis program converts the length/height/distance measured in feet(ft) to meters(m)\nThe coversion rate is 1ft = 0.305m\n");

		System.out.print("Enter a number for feet:   ");
		
		double feetValue = input.nextDouble();
		
		double coversionValue = 0.305;
		
		double meterValue = feetValue * coversionValue;

		System.out.printf(feetValue + "   feet  is   " + meterValue + "  meters");


	}

}
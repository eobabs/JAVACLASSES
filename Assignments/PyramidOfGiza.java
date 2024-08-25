import java.util.Scanner;

public class PyramidOfGiza{
    public static void main(String[] args){

	Scanner input = new Scanner (System.in);
        
	
	System.out.print("Enter the number of stones used: ");
        double noOfStones = input.nextDouble();

	System.out.print("Enter the number of years: ");
	double noOfYears = input.nextDouble();

	System.out.print("Enter the average weight of stones used: ");
	double averageWeight = input.nextDouble();

	
        double averageByYear = (averageWeight * noOfStones)/noOfYears ;
	double averageByHour = (averageWeight * noOfStones)/(noOfYears*365 * 24) ;
	double averageByMinute = (averageWeight * noOfStones)/(noOfYears*365 * 24 * 60) ;
	
	        
        System.out.printf("%nThe estimated weight per year is: %.3ftonnes%nThe estimated weight per hour is: %.3ftonnes%nThe estimated weight per minute is: %.3ftonnes%n", averageByYear, averageByHour, averageByMinute);
      
    }
}
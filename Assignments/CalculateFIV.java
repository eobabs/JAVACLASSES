import java.util.Scanner;

class CalculateFIV{

  public static void main (String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("\nEnter investment amount:  ");

	double amount = input.nextDouble();

	System.out.print("Enter annual rate in percentage:  ");

	double rate = input.nextDouble();

	System.out.print("Enter number of years:  ");

	double numberOfYears = input.nextDouble();
	
	double time = numberOfYears*12;

	double compoundRate = (1 + (rate/1200));
	
	double totalRate = Math.pow(compoundRate, time);

	double futureValue = amount * totalRate;

	System.out.printf("%nAccumulated value is  %c%.2f%n", '$', futureValue);


  }

}
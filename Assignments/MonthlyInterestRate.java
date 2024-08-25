import java.util.Scanner;

class MonthlyInterestRate{

  public static void main (String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("\nEnter balance and interest rate:  ");

	double balance = input.nextDouble();

	double interestRate = input.nextDouble();
	
	double newInterest = balance * (interestRate/1200);

	System.out.printf("%nThe interest for next month is  %.5f%n", newInterest);


  }

}
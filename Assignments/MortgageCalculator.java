import java.util.*;

public class MortgageCalculator{

	public static void main(String... args){

	double mortgageEvaluated = 0;
	mortgageEvaluator(mortgageEvaluated);

	}

	public static void mortgageEvaluator(double mortgage){

	Scanner userInput = new Scanner(System.in);

	System.out.print("Enter the principal: ");
	double principal = userInput.nextDouble();
 
	System.out.print("Enter the annual rate: ");
	double annualRate = userInput.nextDouble();

	System.out.print("Enter the number of years to repay: ");
	double timeInYears = userInput.nextDouble();

	double timeInMonths = timeInYears * 12;
	
	double monthlyPercentageRate = (annualRate/100)/12;

	double powerOfRate = Math.pow((1 +monthlyPercentageRate), timeInMonths);

	double monthlyMortgagePayment = principal * monthlyPercentageRate * powerOfRate /(powerOfRate - 1);


	System.out.print("Your monthly payment is $" + monthlyMortgagePayment);
	

	}

}
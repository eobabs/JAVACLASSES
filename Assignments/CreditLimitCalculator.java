import java.util.Scanner;

public class CreditLimitCalculator{

	public static void main(String... creditlimit){

	Scanner credit = new Scanner(System.in);

	System.out.print("Enter account number: ");
	int accountNumber = credit.nextInt();

	System.out.print("Enter balance at the beginning of the month: ");
	int balance = credit.nextInt();

	System.out.print("Enter total items charged by customer this month: ");
	int totalCharge = credit.nextInt();

	System.out.print("Enter total credit applied to customer's account this month: ");
	int totalCredit = credit.nextInt();

	System.out.print("Enter allowed credit limit to customer's account this month: ");
	double allowedCreditLimit = credit.nextInt();

	int newBalance = balance + totalCharge - totalCredit;

	if (newBalance > allowedCreditLimit) {System.out.print("Credit Limit Exceeded");}
	else {System.out.print("\nYou are eligible");}
	

	}


}
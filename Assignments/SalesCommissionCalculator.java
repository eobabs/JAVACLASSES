import java.util.Scanner;

public class SalesCommissionCalculator{

	public static void main(String... sales){

	Scanner inputs = new Scanner(System.in);

	double itemOne = 239.99;
	double itemTwo = 129.75;
	double itemThree = 99.95;
	double itemFour = 350.89;
	int statutory = 200;
	int typeOne = 0;
	int typeTwo = 0;
	int typeThree = 0;
	int typeFour = 0;


	System.out.print("Enter number of items bought: ");
	int items = inputs.nextInt();

	for (int number = 1; number <= items; number++){
	System.out.print("Enter type of item bought: ");
	int itemsBought = inputs.nextInt();

	if (itemsBought == 1)	typeOne++;
	if (itemsBought == 2)	typeTwo++;
	if (itemsBought == 3)	typeThree++;
	if (itemsBought == 4)	typeFour++;


	}

	double totalSales =  (itemOne * typeOne) + (itemTwo * typeTwo) + (itemThree * typeThree) + (itemFour * typeFour);
	double totalPay = statutory + 0.09 * totalSales;

	System.out.print("The total amount of things sold is " + items + " and the commission to be paid is $" + totalPay);
	
	}

}
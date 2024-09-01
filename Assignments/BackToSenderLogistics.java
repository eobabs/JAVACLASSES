import java.util.*;

public class BackToSenderLogistics{

	public static void main(String... args){

	payTheRider();

	}
	
	public static double processPaymentTypeOne(int ordersFulfilled) {

	double grossPay = (ordersFulfilled * 160) + 5000 ;
	
	System.out.println("You delivered " + ordersFulfilled + " orders today\nYour payment for the day is $" + grossPay); 
	return grossPay;
	
	}

	public static double processPaymentTypeTwo (int ordersFulfilled) {

	double grossPay = (ordersFulfilled * 200) + 5000 ;
	
	System.out.println("You delivered " + ordersFulfilled + " orders today\nYour payment for the day is $" + grossPay); 
	return grossPay; 
	
	}

	public static double processPaymentTypeThree (int ordersFulfilled) {

	double grossPay = (ordersFulfilled * 250) + 5000 ;
	
	System.out.println("You delivered " + ordersFulfilled + " orders today\nYour payment for the day is $" + grossPay); 

	return grossPay;
	
	}

	public static double processPaymentTypeFour (int ordersFulfilled) {

	double grossPay = (ordersFulfilled * 500) + 5000 ;
	
	System.out.println("You delivered " + ordersFulfilled + " orders today\nYour payment for the day is $" + grossPay); 

	return grossPay;
	
	}

	public static void payTheRider(){
	Scanner inputCollector = new Scanner(System.in);

	System.out.print("Enter number of packages delivered: ");
	int numberofFulfilledOrders = inputCollector.nextInt();
	
	if (numberofFulfilledOrders < 50 && numberofFulfilledOrders > 0)processPaymentTypeOne(numberofFulfilledOrders);

	if (numberofFulfilledOrders <= 59 && numberofFulfilledOrders >= 50)processPaymentTypeTwo(numberofFulfilledOrders);

	if (numberofFulfilledOrders <= 69 && numberofFulfilledOrders > 60)processPaymentTypeThree(numberofFulfilledOrders);

	if (numberofFulfilledOrders <= 100 && numberofFulfilledOrders >= 70)processPaymentTypeFour(numberofFulfilledOrders);	

	}

}
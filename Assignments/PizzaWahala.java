import java.util.*;
public class PizzaWahala{

	public static void main(String... args){
	Scanner orders = new Scanner(System.in);

	System.out.println("What type of pizza do you want?");
	String pizzaType = orders.nextLine();

	System.out.println("How many people are you hosting?");
	int numberOfGuests = orders.nextInt();


	if (pizzaType.equalsIgnoreCase("Sapa size") && numberOfGuests > 0 ) {

		if (numberOfGuests % 4 == 0){
		int ordersProcessed = numberOfGuests / 4;
		int leftovers = (ordersProcessed * 4) - numberOfGuests;
		System.out.println("Hello Customer\nYou have " + ordersProcessed + " boxes of " + pizzaType + " and it costs $" + ordersProcessed * 2000);
		System.out.println("Also, you will have " + leftovers + " slice(s) left after serving your guests.");
		}
		else { int ordersProcessed = numberOfGuests / 4;
		int leftovers = ((ordersProcessed + 1)* 4) - numberOfGuests;
  		System.out.printf("Hello Customer\nYou have %d boxes of %s and it costs $ %d%n", ordersProcessed + 1, pizzaType, (ordersProcessed +1)*2000);
		System.out.println("Also, you will have " + leftovers + " slice(s) left after serving your guests."); 
}
	}



		if (pizzaType.equalsIgnoreCase("SMALL MONEY") && numberOfGuests > 0 ) {

		if (numberOfGuests % 6 == 0){
		int ordersProcessed = numberOfGuests / 6;
		int leftovers = (ordersProcessed * 6) - numberOfGuests;
		System.out.println("Hello Customer\nYou have " + ordersProcessed + " boxes of " + pizzaType + " and it costs $" + ordersProcessed * 2400);
		System.out.println("Also, you will have " + leftovers + " slice(s) left after serving your guests.");
		}
		else { int ordersProcessed = numberOfGuests / 6;
		int leftovers = ((ordersProcessed + 1)* 6) - numberOfGuests;
  		System.out.printf("Hello Customer\nYou have %d boxes of %s and it costs $ %d%n", ordersProcessed + 1, pizzaType, (ordersProcessed +1)*2400);
		System.out.println("Also, you will have " + leftovers + " slice(s) left after serving your guests."); 
}
	}




		if (pizzaType.equalsIgnoreCase("BIG BOYS") && numberOfGuests > 0 ) {

		if (numberOfGuests % 8 == 0){
		int ordersProcessed = numberOfGuests / 8;
		int leftovers = (ordersProcessed * 8) - numberOfGuests;
		System.out.println("Hello Customer\nYou have " + ordersProcessed + " boxes of " + pizzaType + " and it costs $" + ordersProcessed * 3000);
		System.out.println("Also, you will have " + leftovers + " slice(s) left after serving your guests.");
		}
		else { int ordersProcessed = numberOfGuests / 8;
		int leftovers = ((ordersProcessed + 1)* 8) - numberOfGuests;
  		System.out.printf("Hello Customer\nYou have %d boxes of %s and it costs $ %d%n", ordersProcessed + 1, pizzaType, (ordersProcessed +1)*3000);
		System.out.println("Also, you will have " + leftovers + " slice(s) left after serving your guests."); 
}
	}

	

	if (pizzaType.equalsIgnoreCase("Odogwu") && numberOfGuests > 0 ) {

		if (numberOfGuests % 12 == 0){
		int ordersProcessed = numberOfGuests / 12;
		int leftovers = (ordersProcessed * 12) - numberOfGuests;
		System.out.println("Hello Customer\nYou have " + ordersProcessed + " boxes of " + pizzaType + " and it costs $" + ordersProcessed * 4200);
		System.out.println("Also, you will have " + leftovers + " slice(s) left after serving your guests.");
		}
		else { int ordersProcessed = numberOfGuests / 12;
		int leftovers = ((ordersProcessed + 1)* 12) - numberOfGuests;
  		System.out.printf("Hello Customer\nYou have %d boxes of %s and it costs $ %d%n", ordersProcessed + 1, pizzaType, (ordersProcessed +1)*4200);
		System.out.println("Also, you will have " + leftovers + " slice(s) left after serving your guests."); 
}
	}




	}
}
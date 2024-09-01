import java.util.*;
public class PizzaWahala{

	public static void main(String... args){
	Scanner orders = new Scanner(System.in);

	


         String introduction = """
Iya A
Kindly place your order as you deem fit

Find below our menu

****************************************************
Pizza type   |  Number of Slices   | Price per box
		in a Box

Sapa Size    |  4		   | 2.000
Small Money  |  6		   | 2,400
Big boys     |  8		   | 3,000
Odogwu       |  12		   | 4,200
                
****************************************************

                What will you like to have?

                """;
        	System.out.print(introduction);

        	
        	int menuOptions = input.nextLine();

	        switch (menuOptions) {
        	    	case "Sapa Size" : processSapaOrder(); break;
            		case "Small Money" : System.out.println("\nThank you for using this service\nPIZZA WAHALA... eat and be merry."); break;
            		case "Big Boys" : System.out.println("Chat"); break;
            		case "Odogwu" : System.out.println("\jdwjd you for using this service\nPIZZA WAHALA... eat and be merry."); break;
            		
            		default : System.out.println("This number is invalid. Thank you"); break;
        			}

        	System.out.println("\nThank you for using this service\nPIZZA WAHALA... eat and be merry.");

	public static int processSapaOrder(){

	if (pizzaType.equalsIgnoreCase("Sapa size") && numberOfGuests > 0 ) {

		if (numberOfGuests % 4 == 0){
		int ordersProcessed = numberOfGuests / 4;
		System.out.println("Hello Customer\nYou have " + ordersProcessed + " boxes of " + pizzaType + "and it costs $" + ordersProcessed*2000);
		}
		else { int ordersProcessed = numberOfGuests / 4;
  System.out.printf("Hello Customer\nYou have %d boxes of %s and it costs $ %d", ordersProcessed + 1, pizzaType, (ordersProcessed +1)*2000); }
	}
	else System.out.println("invalid order");
}


}
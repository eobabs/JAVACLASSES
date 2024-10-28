import java.util.*;

pubic class CheckOutApp{

	public static Scanner details = new Scanner(System.in); 

	public static void main(String[] args) {
		String cashierName = getCashierName();
		String customerName = getCustomerName();

		System.out.println("How many products are in your supermarket?");
		int maximumNumberOfProducts = validateEntries();

		String[] productNames = new String[maximumNumberOfProducts];
		double[] productPrices = new double[maximumNumberOfProducts];
		int[] productQuantities = new int[maximumNumberOfProducts];
		int productNumber = 0;

		boolean isMoreProductAvailable = true;
		while (isMoreProductAvailable && productNumber < maximumNumberOfProducts) {
			inputProduct(productNames, productPrices, productQuantities, productNumber);
			productNumber++;
			isMoreProductAvailable = isMoreProduct();
		}

		double subTotal = calculateTotal(productPrices, productQuantities, productNumber);
		double discount = calculateDiscount(subTotal);
		double vat = calculateVAT(subTotal);
		double finalAmount = subTotal - discount + vat;

		displayInvoice(productNames, productPrices, productQuantities, subTotal, discount, vat, finalAmount, cashierName, customerName, productNumber);

		double amountPaid = getAmountPaid(finalAmount);
		double balance = amountPaid - finalAmount;

		displayReceipt(productNames, productPrices, productQuantities, subTotal, discount, vat, finalAmount, amountPaid, balance, cashierName, customerName, productNumber);
	}

	public static String getCashierName() {
		System.out.println("Enter cashier name:");
		return details.nextLine();
	}

	public static String getCustomerName() {
		System.out.println("Enter customer name:");
		return details.nextLine();
	}

	public static void inputProduct(String[] nameOfProducts, double[] pricesOfProduct, int[] numberOfItems, int index) {
		System.out.println("Enter product name: ");
		nameOfProducts[index] = details.nextLine();

		System.out.println("Enter product price: ");
		pricesOfProduct[index] = validateDoubleEntries(); 

		System.out.println("Enter number of product to be bought: ");
		numberOfItems[index] = validateEntries(); 
	}

	public static double validateDoubleEntries() {
		double amount;

		while (true) {
			try {
				amount = details.nextDouble();
				details.nextLine(); 
				if (amount < 0) {
					System.out.println("Amount cannot be negative. Please enter again.");
					continue;
				}
				break;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input. Please enter a valid amount.");
				details.nextLine(); 
			}
		}
		return amount;
	}

	public static int validateEntries() {
		int quantity;

		while (true) {
			try {
				quantity = details.nextInt();
				details.nextLine(); 
				if (quantity < 0) {
					System.out.println("Quantity cannot be negative. Please enter again.");
					continue;
				}
				break;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input. Please enter a valid quantity.");
				details.nextLine(); 
			}
		}
		return quantity;
	}

	public static boolean isMoreProduct() {
		System.out.println("Do you want to add more products? (yes/no)");
		String response = details.nextLine();
		return response.equalsIgnoreCase("yes");
	}

	public static double calculateTotal(double[] prices, int[] quantities, int numberOfProducts) {
		double total = 0;
		for (int index = 0; index < numberOfProducts; index++) {
			total += prices[index] * quantities[index];
		}
		return total;
	}

	public static double calculateDiscount(double subTotal) {
		if (subTotal > 100) return subTotal * 0.08;
		else return 0;
	}

	public static double calculateVAT(double subTotal) {
		return subTotal * 0.075;
	}

	public static void displayInvoice(String[] productNames, double[] prices, int[] quantities, double subTotal, double discount, double vat, double finalAmount, String cashierName, String customerName, int numberOfProducts) {

		printStoreInfo();
		displayCurrentDateAndTime();
		System.out.println("Cashier: " + cashierName);
		System.out.println("Customer Name: " + customerName);
		printInvoiceDetails(productNames, prices, quantities, subTotal, discount, vat, finalAmount, numberOfProducts);

		System.out.printf("THIS IS NOT A RECEIPT. KINDLY PAY %.2f%n", finalAmount);
		System.out.println("====================================================");
	}

	public static double getAmountPaid(double finalAmount) {
		double amountPaid = 0;

		while (amountPaid < finalAmount) {
			System.out.println("How much did the customer give to you?");
			amountPaid = validateDoubleEntries(); 
		}
		return amountPaid;
	}

	public static void displayReceipt(String[] names, double[] prices, int[] quantities, double subTotal, double discount, double vat, double finalAmount, double amountPaid, double balance, String cashierName, String customerName, int numberOfProducts) {

		System.out.println("\n====================================================");
		printStoreInfo();
		displayCurrentDateAndTime();
		System.out.println("Cashier: " + cashierName);
		System.out.println("Customer Name: " + customerName);
		printInvoiceDetails(names, prices, quantities, subTotal, discount, vat, finalAmount, numberOfProducts);
		System.out.printf("%30s: %.2f%n", "Amount Paid", amountPaid);
		System.out.printf("%30s: %.2f%n", "Balance", balance);
		System.out.println("====================================================");
		System.out.println("            THANK YOU FOR YOUR PATRONAGE            ");
		System.out.println("====================================================");
	}

	public static void printStoreInfo() {

		System.out.println();

		String storeDetails = """
		SEMICOLON STORES
		MAIN BRANCH
		LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
		TEL: 03293828343
		""";

		System.out.println(storeDetails);
		System.out.println("====================================================");
	}

	public static void printInvoiceDetails(String[] productNames, double[] prices, int[] quantities, double subTotal, double discount, double vat, double finalAmount, int numberOfProducts) {

		System.out.printf("%-15s %-5s %-10s %-10s%n", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
		System.out.println("----------------------------------------------------");

		for (int index = 0; index < numberOfProducts; index++) {

			double productTotal = prices[index] * quantities[index];
			System.out.printf("%-15s %-5d %-10.2f %-10.2f%n", productNames[index], quantities[index], prices[index], productTotal);
		}

		System.out.println("----------------------------------------------------");
		System.out.printf("%30s: %.2f%n", "Sub Total", subTotal);
		System.out.printf("%30s: %.2f%n", "Discount", discount);
		System.out.printf("%30s: %.2f%n", "VAT @ 7.5%", vat);
		System.out.println("====================================================");
		System.out.printf("%30s: %.2f%n", "Bill Total", finalAmount);
		System.out.println("====================================================");
	}

	public static void displayCurrentDateAndTime() {
		long millisecondsSince1970 = System.currentTimeMillis();

		long currentSeconds = (millisecondsSince1970 / 1000) % 60;
		long currentMinutes = (millisecondsSince1970 / (1000 * 60)) % 60;
		long totalHours = (millisecondsSince1970 / (1000 * 60 * 60));
		long currentHours = (millisecondsSince1970 / (1000 * 60 * 60)) % 24;

		long totalDays = totalHours / 24;

		int currentYear = 1970;
		while (true) {
			int daysInYear = 365; 
			if (isLeapYear(currentYear)) {
				daysInYear = 366; 
			}
			if (totalDays < daysInYear) {
				break; 
			}
			totalDays -= daysInYear;
			currentYear++;
		}

		int currentMonth = 0;
		int[] daysInMonth;
        
		if (isLeapYear(currentYear)) {
			daysInMonth = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		} else {
			daysInMonth = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		}

		while (totalDays >= daysInMonth[currentMonth]) {
			totalDays -= daysInMonth[currentMonth];
			currentMonth++;
		}

		int currentDay = (int) totalDays + 1; 

		System.out.printf("Current Date: %02d-%02d-%d %02d:%02d:%02d%n", currentDay, currentMonth + 1, currentYear, currentHours + 1, currentMinutes, currentSeconds);
	}

	public static boolean isLeapYear(int year) {
		boolean leapYear = false;

		if (year % 4 == 0) {
			if (year % 100 != 0) {
				leapYear = true; 
			} else {
				if (year % 400 == 0) {
					leapYear = true; 
				}
			}
		}

		return leapYear; 
	}
}

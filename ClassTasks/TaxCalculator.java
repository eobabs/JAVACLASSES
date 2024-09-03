import java.util.*;

public class PrivacyCryptography{


	public static void main(String... args){

	Scanner tax = new Scanner(System.in);
		
	System.out.print("\nEnter your name: ");
	String nameOfCitizen = tax.nextLine();

	System.out.print("\nEnter your earnings for the year: ");
	double earnings = tax.nextDouble();


	if (earnings >= 0 && earnings <= 30000)
		System.out.print(nameOfCitizen + "'s tax for the year is $" + earnings * 0.15);

	if (earnings >30000)
		System.out.print(nameOfCitizen + "'s tax for the year is $" + earnings * 0.2);
	
	}	


}

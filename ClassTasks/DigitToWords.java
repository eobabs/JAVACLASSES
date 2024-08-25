import java.util.Scanner;

public class DigitToWords{

   public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number between 1 and 10: ");
	int number = input.nextInt();

	if (number ==1){
	System.out.print("One");
	}
	if (number ==2){
	System.out.print("Two");
	}
	if (number ==3){
	System.out.print("Three");
	}
	if (number ==4){
	System.out.print("Four");
	}
	if (number ==5){
	System.out.print("Five");
	}
	if (number ==6){
	System.out.print("Six");
	}
	if (number ==7){
	System.out.print("Seven");
	}
	if (number ==8){
	System.out.print("Eight");
	}
	if (number ==9){
	System.out.print("Nine");
	}
	if (number ==10){
	System.out.print("Ten");
	}
	if (number > 10){
	System.out.print("Not Available");
	}


}
   



}
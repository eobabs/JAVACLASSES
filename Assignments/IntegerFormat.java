import java.util.*;

public class IntegerFormat{

	public static void main(String... args){

	Scanner input = new Scanner (System.in);

	format (234,9);

	}	

	public static String format(int number, int width){
	
	String addedZero = "";


	
	number = 353;
	 width = 5;
	addedZero += number;


	if (addedZero.length() > width) System.out.print(number);
	
	else {

	String name = "0" ;
	for(int count = 1; count <= 5-addedZero.length() ; count++) {
				System.out.print(name);

	}
		System.out.print(number);

		}

		return addedZero;
	}

}


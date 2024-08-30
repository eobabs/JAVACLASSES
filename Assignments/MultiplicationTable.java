import java.util.*;

public class MultiplicationTable{

	public static void main(String... args){

	Scanner inputCollector = new Scanner(System.in);

	System.out.print("Enter number of choice: ");
	int number = inputCollector.nextInt();

	System.out.print("Enter the number of multiples you want: ");
	int numberOfMultiples = inputCollector.nextInt();

	int product = 1;

	for (int count = 1; count <= numberOfMultiples; count++){

	product = count*number;
	
	System.out.println("|" + number + " * " + count + " = " + product + "|");
	}

  
	}

}
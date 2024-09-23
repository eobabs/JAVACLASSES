import java.util.*;

public class NumberOfScores{

	public static void main(String... args){

	Scanner index = new Scanner(System.in);

	System.out.print("Enter the number of scores: ");
	int numberOfScores = index.nextInt();

	int [] number = new int [numberOfScores];
	int sum = 0;

	for (int count = 0; count < numberOfScores; count++){
		System.out.print("Enter your number: ");
		number [count] = index.nextInt();
	}

      int largestNumber = 0;
      int smallestNumber = number[0];
	
	for (int count = 0; count < numberOfScores; count++) {
	System.out.printf("%5d%8d%n", count, number[count]);
	sum += number[count]; 
	   if (number[count] > largestNumber) largestNumber = number[count];
           if (number[count] < smallestNumber) smallestNumber = number[count];
	}
		System.out.println("The sum of the numbers is " + sum );
		System.out.println("The average of the numbers is " + (double) sum/numberOfScores );
        System.out.println("The largest number of the list is: " + largestNumber);
        System.out.println("The lowest number of the list is: " + smallestNumber);



	}

}

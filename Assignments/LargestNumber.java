import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
      
	
	Scanner numberchecker = new Scanner(System.in);


      	int counter = 1;
      	int largestNumber = 0;
    
	while (counter <= 10){
      	
        	System.out.print("Enter your number: ");
           	int number = numberchecker.nextInt();

           	if (number > largestNumber) largestNumber = number;
	counter++;

       	}

        System.out.println("The largest number of the list is: " + largestNumber );


         }
}

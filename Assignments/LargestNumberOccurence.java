import java.util.Scanner;

public class LargestNumberOccurence {
	public static void main(String[] args) {
      
	
	Scanner numberchecker = new Scanner(System.in);


      	
      	int largestNumber = 0;
    	int count = 0;
	for (int counter = 1 ; counter <= 10;counter++){
      	
        	System.out.print("Enter your number: ");
           	int number = numberchecker.nextInt();

           	if (number > largestNumber) {
		largestNumber = number;
	 	count++;
		}
		
       	}
	System.out.println("The occurrence count of the largest number is: " + count );
        System.out.println("The largest number of the list is: " + largestNumber );
       


         }
}

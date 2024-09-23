import java.util.*;

public class ArraySnacks{

	public static void main(String... args){

	Scanner index = new Scanner(System.in);

	System.out.print("Enter the number of scores: ");
	int numberOfScores = index.nextInt();

	int [] number = new int [numberOfScores];
	int sum = 0;

	for (int count = 0; count < number.length; count++){
		System.out.print("Enter your number: ");
		number [count] = index.nextInt();
	}
	System.out.print("Enter the number you want to check for: ");
	int keyNumber = index.nextInt();

	displayArray(number);
	printArray(number);
	if (isContained(number, keyNumber)) System.out.println(keyNumber + " is in the array.");
	else System.out.println(keyNumber + " is not in the array.");
	}

	public static void displayArray(int [] numbersList){
      	int largestNumber = numbersList[0];
	int sum = 0;
	
	System.out.println("The original array is:");
	for (int count = 0; count < numbersList.length; count++) {
	System.out.printf("%5d", numbersList[count]);
	sum += numbersList[count];
	   if (numbersList[count] > largestNumber) largestNumber = numbersList[count];
	}
	System.out.println();
	System.out.println("The sum of the list is: " + sum);
	System.out.println("The largest number of the list is: " + largestNumber);
  
	System.out.println("The array in reverse order is:");
	for (int count = numbersList.length - 1; count >=0; count--) 
	System.out.printf("%5d", numbersList[count]);
	System.out.println();

	}

	public static boolean isContained(int[] numberlist, int key) {
	for (int index = 0; index < numberlist.length; index++) {
	if (key == numberlist[index])
	return true;
	}
	return false;
 	}

 	public static void printArray(int [] numbersList){
      	
	System.out.println("The array filled with odd indexes only is listed thus:");
	for (int count = 0; count < numbersList.length; count++) {
	if (count % 2 == 1)
	System.out.printf("%5d", numbersList[count]);
	}
	System.out.println();
  
	System.out.println("The array filled with even indexes only is listed thus:");
	for (int count = 0; count < numbersList.length; count++) {
	if (count % 2 == 0)
	System.out.printf("%5d", numbersList[count]);
	}
	System.out.println();

	}

}

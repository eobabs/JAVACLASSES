import java.util.*;

public class TwoArrays{


	public static void main(String... args){




	int [] numberlistOne = {10, 2, 7, 5, 28, 90};	
	int [] numberlistTwo = {-3, -5, -2, -5, 12};


	int [] combinedArray = combineArrays(numberlistOne, numberlistTwo);

	for (int index = 0; index < combinedArray.length; index++ ) {
	System.out.printf("%5d", combinedArray[index]);
	}

	}

	public static int[] combineArrays(int[]numbers, int[] numbersTwo){

	int [] newList = new int [numbers.length + numbersTwo.length];
	
	for(int index = 0; index < numbers.length; index ++)
		newList[index] = numbers[index];

	for(int index = 0; index < numbersTwo.length; index ++)
		newList[numbers.length + index] = numbersTwo[index];


	return newList;
	
	}

}




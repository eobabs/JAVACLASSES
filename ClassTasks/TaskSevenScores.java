import java.util.*;


public class TaskSevenScores{

	public static void main(String... args){

	Scanner inputCollector = new Scanner(System.in);

	final int NUMBER_OF_STUDENTS = 10;

	double sum = 0;;
	int counter = 0;
	for (int count = 1; count <= NUMBER_OF_STUDENTS; count++) {

	System.out.print("Enter score: ");
	double scores = inputCollector.nextDouble();

	if (scores % 2 == 0){
	counter++;
	sum += scores;
	}
	}
		System.out.printf("The sum is %.2f and the average score is %.2f", sum, sum/counter);
	}

}
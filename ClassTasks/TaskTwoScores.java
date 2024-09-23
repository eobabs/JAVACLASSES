import java.util.*;


public class TaskTwoScores{

	public static void main(String... args){

	Scanner inputCollector = new Scanner(System.in);

	final int NUMBER_OF_STUDENTS = 10;

	double sum = 0;
	for (int count = 1; count <= NUMBER_OF_STUDENTS; count++) {

	System.out.print("Enter score: ");
	double scores = inputCollector.nextDouble();
	sum += scores;
	}
		System.out.printf("The average score is: %.2f", sum/NUMBER_OF_STUDENTS);
	}

}
import java.util.Scanner;

public class HighestScore{

	public static void main(String... classtask){

		Scanner scoreInput = new Scanner (System.in);
		
		System.out.print("\nEnter number of students: ");
		int numberOfStudents = scoreInput.nextInt();

		int largestScore = 0;
		String nameOfHighest = "";

		for(int counter = 1; counter <= numberOfStudents; counter++){
		
		System.out.print("\nEnter name of student: ");
		String name = scoreInput.next();

		System.out.print("Enter score of student: ");
		int score = scoreInput.nextInt();

			if (score > largestScore) {

				nameOfHighest = name;
				largestScore = score;
			}			
		
		} 

		System.out.print("\nThe highest score is " + largestScore + "\nThe name of the highest scorer is " + nameOfHighest);
	}
}
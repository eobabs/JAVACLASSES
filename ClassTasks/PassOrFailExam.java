import java.util.Scanner;

public class PassOrFailExam{

	public static void main(String... classtask){

		Scanner scoreInput = new Scanner (System.in);
		
		for(int counter = 1; counter != -1; counter++){
			System.out.print("\nEnter scores: ");
			counter = scoreInput.nextInt();

			if (counter >= 60){
		 		System.out.println("You passed the exam");
			}

			else {
				System.out.println("You failed the exam");
			}

			if (counter == -1)break;
		}
	}
}
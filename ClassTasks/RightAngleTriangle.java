import java.util.*;

public class RightAngleTriangle {
    public static void main(String[] args) {
        
	Scanner number = new Scanner(System.in);

	System.out.print("Enter the length of the right angle");
	int length = number.nextInt();

        for (int count = 1; count <= length; count++) {
            for (int counter = 1; counter <= count; counter++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
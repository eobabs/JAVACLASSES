import java.util.Scanner;

public class AreaAndPerimeter{

     public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("\nEnter width of the reactangle: ");

	double width = input.nextDouble();

	System.out.print("\nEnter height of the reactangle: ");

	double height = input.nextDouble();

	double perimeter = 2 * (width + height);

	double area = width * height;

	System.out.printf("\nThe area of the rectangle  is %.2fm%c2%nThe perimeter of the rectangle is %.2fm%n", area , '^' , perimeter);

     }

}


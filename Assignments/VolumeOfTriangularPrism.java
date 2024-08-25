import java.util.Scanner;

public class VolumeOfTriangularPrism{

     public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("\nEnter length of sides and height of the prism: ");

	double length = input.nextDouble();
	double height = input.nextDouble();

	double area = ((Math.sqrt(3)) * (Math.pow(length,2)))/4;

	double volume = area * height;

	System.out.printf("\nThe area is %.2fm%c2%nThe volume of the triangular prism is %.2fm%c3%n", area , '^' , volume, '^');

     }

}


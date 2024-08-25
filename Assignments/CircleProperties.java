import java.util.Scanner;

public class CircleProperties{

     public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("\nEnter radius of circle: ");

	int radius = input.nextInt();

	System.out.printf("\nThe Diameter of the circle is %dm%nThe circumference of the circle is %.4fm%nThe area of the circle  is %.4fm%c2%n", 2 * radius,2 * radius * Math.PI, (Math.pow(radius, 2)) * Math.PI , '^');

     }

}


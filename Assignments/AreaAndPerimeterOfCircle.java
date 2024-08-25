import java.util.Scanner;

import java.lang.Math.*;

public class AreaAndPerimeterOfCircle{

     public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("\nEnter radius of circle: ");

	double radius = input.nextDouble();

	double perimeter = 2 * radius * Math.PI;

	double area = (Math.pow(radius, 2)) * Math.PI;

	System.out.printf("\nThe area of the circle  is %.2fm%c2%nThe perimeter of the circle is %.2fm%n", area , '^' , perimeter);

     }

}


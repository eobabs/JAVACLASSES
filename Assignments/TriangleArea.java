import java.util.Scanner;

public class TriangleArea{

     public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("\nEnter three points for a triangle: ");

	double x1 = input.nextDouble();
	double y1 = input.nextDouble();
	double x2 = input.nextDouble();
	double y2 = input.nextDouble();
	double x3 = input.nextDouble();
	double y3 = input.nextDouble();

	double side1 = Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
	double side2 = Math.sqrt(Math.pow((x2-x3),2) + Math.pow((y2-y3),2));
	double side3 = Math.sqrt(Math.pow((x3-x1),2) + Math.pow((y3-y1),2));

	double sP = (side1 + side2 + side3)/2;
	double area = Math.sqrt(sP*(sP-side1)*(sP-side2)*(sP-side3));

	System.out.printf("\nThe area of the triangle is %.1f square unit", area);

     }

}


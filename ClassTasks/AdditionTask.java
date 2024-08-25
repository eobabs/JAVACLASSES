import java.util.Scanner;

public class AdditionTask{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter first value: ");
double value1 = input.nextDouble();

System.out.print("Enter second value: ");
double value2 = input.nextDouble();

double sum = value1 + value2;

System.out.printf("The result of the sum is: %.2f ", sum);


}

}


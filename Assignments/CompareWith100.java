import java.util.Scanner; 

public class CompareWith100{
  public static void main(String[] args) {
 
   	Scanner input = new Scanner(System.in);

	System.out.print("Enter integer: ");  
	int a = input.nextInt(); 
	int b = a * a;

	if (a == 100){
	System.out.printf("%n%d == %d%n", a, 100);
	}
	if (a != 100) {
	System.out.printf("%d != %d%n", a, 100);
	}
	if (a < 100) {
	System.out.printf("%d < %d%n", a, 100);
	}
	if (a > 100) {
	System.out.printf("%d > %d%n", a, 100);
	}
	if (b == 100){
	System.out.printf("%d == %d%n", b, 100);
	}
	if (b != 100) {
	System.out.printf("%d != %d%n", b, 100);
	}
	if (b < 100) {
	System.out.printf("%d < %d%n", b, 100);
	}
	if (b > 100) {
	System.out.printf("%d > %d%n", b, 100);
	}
   } 
} 
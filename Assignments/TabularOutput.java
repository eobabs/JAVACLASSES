public class TabularOutput{
	
	public static void main(String... args){

	System.out.println("N	N^2	N^3	N^4");

	for (int count = 1; count <= 5; count++) {
		
	double square = Math.pow(count,2);
	double cube = Math.pow(count,3);
	double fourthPower = Math.pow(count,4);


	System.out.printf("%d	%s	%s	%s%n", count, (int)square, (int)cube, (int)fourthPower );
		}

	}

}
public class PyramidOfNumbers {
	public static void main(String[] args) {

        for (int count = 0; count <=8; count++) {

           	for (int counter = 0; counter <= 8 - count - 1; counter++) {
                	System.out.print("    ");             
		}

		for (int counter = 0; counter < count; counter++){
                	System.out.printf("%4s",((int)Math.pow(3, counter))); 
		
		}

		for (int counter = count - 2 ; counter >= 0; counter--) {
                	System.out.printf("%4s",((int)Math.pow(3, counter))); 

		 }

      	System.out.println();
	}  

	}
}

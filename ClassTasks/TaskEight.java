public class TaskEight {
    public static void main(String[] args) {

	int sumOfSum = 0;
        for (int count = 1; count <= 10; count++) {

            if (count % 4 == 0) {
		
		int product = 1;
		int sum = 0;

                for (int counter = 1; counter <= 5; counter++) {
			
		    product*=count;
		    
		    sum+=product;

                }   sumOfSum += sum;
		    
            }
		
        }
        	System.out.print(sumOfSum + " ");
    }
}

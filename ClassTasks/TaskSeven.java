public class TaskSeven {
    public static void main(String[] args) {

        for (int count = 1; count <= 10; count++) {

            if (count % 4 == 0) {
		
		int product = 1;
		int sum = 0;

                for (int counter = 1; counter <= 5; counter++) {
			
		    product*=count;
		    
		    sum+=product;

                }
		    System.out.print(sum + " ");
            }
        }
        
    }
}

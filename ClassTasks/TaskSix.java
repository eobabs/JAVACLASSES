public class TaskSix {
    public static void main(String[] args) {

        for (int count = 1; count <= 10; count++) {

            if (count % 4 == 0) {
		
		int product = 1;

                for (int counter = 1; counter <= 5; counter++) {
			
		    product*=count;

                    System.out.print(product + " ");
                }
            }
        }
        
    }
}

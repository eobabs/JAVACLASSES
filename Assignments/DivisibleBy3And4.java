public class DivisibleBy3And4{

	public static void main(String... classtask){

		int lineCounter = 0;
			
		for (int count = 100; count<= 1000; count++){

				if (count % 3 == 0 && count % 4 == 0) {

					System.out.print(count + " ");
					lineCounter++;

               				 if (lineCounter == 10) { 
                   			 System.out.println();
                    				lineCounter = 0; 
               				 }
					
				}

		}
		
	}

}

public class SumOfFirstTenNumbers {

	public static void main(String[] args) {
     
     		  int sum = 0;
		int numberCount = 1;
     
       	while (numberCount <= 10) {
		sum += numberCount;
    
     		numberCount =  numberCount + 1;
                 
          }    
 System.out.print("\nThe sum of the first ten natural numbers is: " + sum + "\n"); 
        }
}

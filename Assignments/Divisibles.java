
public class Divisibles{

	public static void main (String... divide){


	int counter = 0;

	for (int check = 100 ; check <= 1000; check++) {

	if (check % 3 ==0 && check %4 == 0) {counter++;
	System.out.print (check + " ");

	if (counter % 10 == 0) {
	System.out.println();
	
	}

	}
	}

	System.out.println ("\n\n");

	int count = 0;

	for (int checker = 100 ; checker <= 200; checker++) {

	if (checker % 3 == 0 || checker % 4 == 0) { count++;
	System.out.print (checker + " ");

	if (count % 10== 0) { System.out.println();
	
	}

	}

	}
	}

}






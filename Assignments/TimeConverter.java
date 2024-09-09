import java.util.*;
public class TimeConverter {

	public static String convertMillis(long millis) {

        
        long totalSeconds = millis / 1000;
        
        long hours = totalSeconds / 3600;
        long minutes = (totalSeconds % 3600) / 60;
        long seconds = totalSeconds % 60;
        
        return String.format("%d:%d:%d", hours, minutes, seconds);
  	}

	public static void main(String[] args) {
        Scanner clock = new Scanner(System.in);

        System.out.print("Enter milliseconds: ");
        long millis = clock.nextLong();

        String timeString = convertMillis(millis);

        System.out.println("Time: " + timeString);


    	}	
}

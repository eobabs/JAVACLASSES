public class DisplayDateAndTime {

    public static void main(String[] args) {

        long currentTimeMillis = System.currentTimeMillis();
        
        long totalSeconds = currentTimeMillis / 1000;
        
        long seconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long minutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long hours = totalHours % 24;
        long totalDays = totalHours / 24;
        
        long years = totalDays / 365;
        long days = totalDays % 365;
        long months = days / 30; 
        days = days % 30;
        

        System.out.printf("Current date and time: %d-%d-%d %d:%d:%d%n",
                          years + 1970, months + 1, days + 1, hours, minutes, seconds);
    }
}




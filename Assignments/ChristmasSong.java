import java.util.*;

public class ChristmasSong{

	
	public static void main(String[] args) {
		System.out.println("Lyrics of Christmas Song according to Wikipedia\n\n"); 
		playSong();
    }

	public static void playSong(){
        for (int daysOfChristmas = 1; daysOfChristmas <= 12; daysOfChristmas++) {
            printTheDay(daysOfChristmas);
            printEachVerse(daysOfChristmas);
            System.out.println(); 
        }

	}


  	public static void printTheDay(int daysOfChristmas) {
        switch (daysOfChristmas) {
            case 1:
                System.out.println("On the first day of Christmas my true love sent to me: ");
                break;
            case 2:
                System.out.println("On the second day of Christmas my true love sent to me: ");
                break;
            case 3:
                System.out.println("On the third day of Christmas my true love sent to me: ");
                break;
            case 4:
                System.out.println("On the fourth day of Christmas my true love sent to me: ");
                break;
            case 5:
                System.out.println("On the fifth day of Christmas my true love sent to me: ");
                break;
            case 6:
                System.out.println("On the sixth day of Christmas my true love sent to me: ");
                break;
            case 7:
                System.out.println("On the seventh day of Christmas my true love sent to me: ");
                break;
            case 8:
                System.out.println("On the eighth day of Christmas my true love sent to me: ");
                break;
            case 9:
                System.out.println("On the ninth day of Christmas my true love sent to me: ");
                break;
            case 10:
                System.out.println("On the tenth day of Christmas my true love sent to me: ");
                break;
            case 11:
                System.out.println("On the eleventh day of Christmas my true love sent to me: ");
                break;
            case 12:
                System.out.println("On the twelfth day of Christmas my true love sent to me: ");
                break;
        }
    }

	public static void printEachVerse(int daysOfChristmas) {
        	int verse = daysOfChristmas; 
            	switch (verse) {
           		case 12 : System.out.println("Twelve drummers drumming,");
			case 11 : System.out.println("Eleven pipers piping,");
            		case 10 : System.out.println("Ten lords a-leaping,");
            		case 9 : System.out.println("Nine ladies dancing,");
            		case 8 : System.out.println("Eight maids a-milking,");
            		case 7 : System.out.println("Seven swans a-swimming,");
            		case 6 : System.out.println("Six geese a-laying,");
            		case 5 : System.out.println("FIVE GOLDEN RINGS");
            		case 4 : System.out.println("Four calling birds"); 
            		case 3 : System.out.println("Three French hens,");
            		case 2 : System.out.println("Two turtle doves,");
            		case 1 : System.out.println("And a partridge in a pear tree.\n"); 
       
                    		}
  		}

}
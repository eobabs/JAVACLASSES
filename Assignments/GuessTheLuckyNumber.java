import java.util.Scanner;

public class GuessTheLuckyNumber {
  public static void main(String[] args) {
        
     Scanner userInput = new Scanner(System.in);
        
     int userGuess = 0;
     int luckyNumber = 45;
        
     while (userGuess != luckyNumber) {

     System.out.print("Guess the lucky number: ");
     userGuess = userInput.nextInt();
            
     if (userGuess < luckyNumber) System.out.println("Too low! Try again.");
     if (userGuess > luckyNumber) System.out.println("Too high! Try again.");
     if (userGuess == luckyNumber) System.out.println("Awesome! " + luckyNumber + " guessed correctly");
            }
        
        
        }
}

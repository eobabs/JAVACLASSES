import java.util.*;

public class PalindromeStringChecker {

   	public static boolean isPalindrome(String words) {

        String editedString = words.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

	char [] editedTexts = editedString.toCharArray();
        
        char [] reversedTexts = new char [editedTexts.length];

	for (int index = 0; index < editedTexts.length; index++)
		reversedTexts[index] = editedTexts [editedTexts.length - index - 1];

	for (int index = 0; index < editedTexts.length; index++)
		if (reversedTexts[index] != editedTexts [index]) return false;
	
		        
        return true;
   	}

    	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter String to be tested: ");
        String textTest = input.nextLine();

        if (isPalindrome(textTest)) {
            System.out.println(textTest + " is a palindrome.");
        } else {
            System.out.println(textTest + " is not a palindrome.");
        }
    }
}

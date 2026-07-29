/**
 * Program Name : StringBasics
 * Topic        : Strings
 * Difficulty   : Beginner
 * Concepts     : String Creation, Immutability, Scanner Reading (next vs nextLine)
 * -------------------------------------------------------------
 * Description  :
 * Demonstrates string creation methods, string immutability, and reading string inputs.
 */
import java.util.Scanner;

public class StringBasics {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'd'};
        String str1 = "abcdef";
        String str2 = new String("xyz");

        // Note: Strings in Java are IMMUTABLE (cannot be changed once created)
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        // nextLine() reads the entire line including spaces, unlike next() which stops at space
        String userInput = scanner.nextLine();
        System.out.println("You entered: " + userInput);
        scanner.close();
    }
}

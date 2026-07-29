/**
 * Program Name : ReverseStringUsingStack
 * Topic        : Stacks
 * Difficulty   : Beginner
 * Concepts     : LIFO Property, String Inversion
 * -------------------------------------------------------------
 * Description  :
 * Reverses a string character-by-character using the Last-In-First-Out (LIFO) property of Stack.
 */
import java.util.Stack;

public class ReverseStringUsingStack {

    public static String reverseString(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        StringBuilder reversed = new StringBuilder("");
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        String input = "helloworld";
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reverseString(input));
    }
}

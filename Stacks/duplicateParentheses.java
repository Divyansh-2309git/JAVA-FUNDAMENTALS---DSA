/**
 * Program Name : duplicateParentheses
 * Topic        : Stacks
 * Difficulty   : Intermediate
 * Concepts     : Stack Traversal, Parentheses Matching, Redundant Brackets Detection
 * -------------------------------------------------------------
 * Description  :
 * Determines if a given balanced expression string contains duplicate (redundant) parentheses in O(N) time.
 */
import java.util.Stack;

public class duplicateParentheses {

    public static boolean hasDuplicateParentheses(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ')') {
                int count = 0;
                while (!stack.isEmpty() && stack.peek() != '(') {
                    stack.pop();
                    count++;
                }
                if (count < 1) {
                    return true; // Duplicate parentheses detected like ((a+b))
                } else if (!stack.isEmpty()) {
                    stack.pop(); // Pop opening bracket '('
                }
            } else {
                stack.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str1 = "((a+b))"; // Duplicate
        String str2 = "(a+b)";   // Not duplicate

        System.out.println("Expression 1: \"" + str1 + "\" has duplicates? " + hasDuplicateParentheses(str1));
        System.out.println("Expression 2: \"" + str2 + "\" has duplicates? " + hasDuplicateParentheses(str2));
    }
}

/**
 * Program Name : ValidParenthesesCheck
 * Topic        : Stacks
 * Difficulty   : Beginner
 * Concepts     : Balanced Brackets Matching, Stack Operations
 * -------------------------------------------------------------
 * Description  :
 * Validates whether an expression string containing parentheses '()', '{}', '[]' is balanced (LeetCode 20).
 */
import java.util.Stack;

public class ValidParenthesesCheck {

    public static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                // Closing bracket with empty stack
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.peek();
                if ((top == '(' && ch == ')') || 
                    (top == '{' && ch == '}') || 
                    (top == '[' && ch == ']')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str1 = "({[]})";
        String str2 = "([)]";

        System.out.println("Expression 1 \"" + str1 + "\" is valid? " + isValid(str1));
        System.out.println("Expression 2 \"" + str2 + "\" is valid? " + isValid(str2));
    }
}

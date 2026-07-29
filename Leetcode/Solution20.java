/**
 * Program Name : Solution20
 * Topic        : LeetCode / Stacks
 * Difficulty   : Easy (20. Valid Parentheses)
 * Concepts     : Stack Operations, Matching Opening/Closing Brackets
 * -------------------------------------------------------------
 * Description  :
 * Checks if a string containing parentheses '()[]{}' is valid using a Stack.
 */
import java.util.Stack;

public class Solution20 {

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                char top = st.peek();
                if ((top == '(' && ch == ')')
                        || (top == '{' && ch == '}')
                        || (top == '[' && ch == ']')) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println("Is \"" + s + "\" valid? " + isValid(s));
    }
}

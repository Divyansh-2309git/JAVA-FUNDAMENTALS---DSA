/**
 * Program Name : StackJCFDemo
 * Topic        : Stacks
 * Difficulty   : Beginner
 * Concepts     : Java Collections Framework (JCF), java.util.Stack API
 * -------------------------------------------------------------
 * Description  :
 * Demonstrates using Java's built-in java.util.Stack standard library API.
 */
import java.util.Stack;

public class StackJCFDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}

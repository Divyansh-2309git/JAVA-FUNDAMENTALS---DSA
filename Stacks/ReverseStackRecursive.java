/**
 * Program Name : ReverseStackRecursive
 * Topic        : Stacks
 * Difficulty   : Intermediate
 * Concepts     : Stack Reversal, Recursion, Memory Stack Unwinding
 * -------------------------------------------------------------
 * Description  :
 * Reverses a stack in-place using recursion without allocating extra data structures.
 */
import java.util.Stack;

public class ReverseStackRecursive {

    public static void pushAtBottom(Stack<Integer> stack, int data) {
        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }
        int top = stack.pop();
        pushAtBottom(stack, data);
        stack.push(top);
    }

    public static void reverse(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int top = stack.pop();
        reverse(stack);
        pushAtBottom(stack, top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Original Stack: [1, 2, 3]");
        reverse(stack);

        System.out.print("Reversed Stack elements (Top to Bottom): ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }
}

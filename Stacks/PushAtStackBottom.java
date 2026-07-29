/**
 * Program Name : PushAtStackBottom
 * Topic        : Stacks
 * Difficulty   : Beginner
 * Concepts     : Recursion, Stack Unwinding, In-place Stack Modification
 * -------------------------------------------------------------
 * Description  :
 * Pushes an element to the bottom of a stack recursively.
 */
import java.util.Stack;

public class PushAtStackBottom {

    public static void pushBottom(Stack<Integer> stack, int data) {
        // Base case: Stack is empty, push data
        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }

        int top = stack.pop();
        pushBottom(stack, data);
        stack.push(top); // Restore top element
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        pushBottom(stack, 4); // Pushes 4 to the bottom

        System.out.print("Stack elements (Top to Bottom): ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }
}

/**
 * Program Name : nextGreater
 * Topic        : Stacks
 * Difficulty   : Intermediate
 * Concepts     : Monotonic Stack, Next Greater Element
 * -------------------------------------------------------------
 * Description  :
 * Finds the Next Greater Element for every array element in O(N) time using a Monotonic Decreasing Stack.
 */
import java.util.Stack;

public class nextGreater {

    public static int[] findNextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] nextGreater = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            nextGreater[i] = stack.isEmpty() ? -1 : arr[stack.peek()];
            stack.push(i);
        }
        return nextGreater;
    }

    public static void main(String[] args) {
        int[] arr = {6, 8, 0, 1, 3};
        int[] result = findNextGreaterElements(arr);

        System.out.print("Next Greater Elements: ");
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}

/**
 * Program Name : maxAreaHistogram
 * Topic        : Stacks
 * Difficulty   : Advanced
 * Concepts     : Monotonic Stack, Next Smaller Left (NSL), Next Smaller Right (NSR)
 * -------------------------------------------------------------
 * Description  :
 * Computes the maximum rectangular area in a histogram (LeetCode 84) using monotonic stacks in O(N) time.
 */
import java.util.Stack;

public class maxAreaHistogram {

    public static int maxArea(int[] heights) {
        int maxArea = 0;
        int n = heights.length;

        int[] nsl = new int[n]; // Next Smaller Left
        int[] nsr = new int[n]; // Next Smaller Right

        // Next Smaller Right calculation
        Stack<Integer> stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            nsr[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }

        // Next Smaller Left calculation
        stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            nsl[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        // Calculate maximum area: height * width (nsr[i] - nsl[i] - 1)
        for (int i = 0; i < n; i++) {
            int height = heights[i];
            int width = nsr[i] - nsl[i] - 1;
            int currentArea = height * width;
            maxArea = Math.max(maxArea, currentArea);
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3};
        System.out.println("Maximum Area in Histogram: " + maxArea(heights));
    }
}

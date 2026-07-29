/**
 * Program Name : StockSpanProblem
 * Topic        : Stacks
 * Difficulty   : Intermediate
 * Concepts     : Stock Span Problem, Monotonic Stack Indexing
 * -------------------------------------------------------------
 * Description  :
 * Calculates the Stock Span for each day (number of consecutive previous days with price <= current day).
 */
import java.util.Stack;

public class StockSpanProblem {

    public static void calculateStockSpan(int[] stocks, int[] span) {
        Stack<Integer> stack = new Stack<>();
        span[0] = 1;
        stack.push(0);

        for (int i = 1; i < stocks.length; i++) {
            int currentPrice = stocks[i];
            while (!stack.isEmpty() && currentPrice > stocks[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                span[i] = i + 1;
            } else {
                int prevHigh = stack.peek();
                span[i] = i - prevHigh;
            }
            stack.push(i);
        }
    }

    public static void main(String[] args) {
        int[] stocks = {100, 80, 60, 70, 60, 85, 100};
        int[] span = new int[stocks.length];

        calculateStockSpan(stocks, span);

        System.out.print("Stock Spans: ");
        for (int val : span) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}

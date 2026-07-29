/**
 * Program Name : fibonacci
 * Topic        : RecursionBasics
 * Difficulty   : Beginner
 * Concepts     : Multiple Recursive Calls, Fibonacci Sequence
 * -------------------------------------------------------------
 * Description  :
 * Computes the N-th Fibonacci number recursively (0-indexed: 0, 1, 1, 2, 3, 5, 8...).
 */
public class fibonacci {

    public static int getFibonacci(int n) {
        // Base cases
        if (n == 0) return 0;
        if (n == 1) return 1;

        // Recursive formula: F(n) = F(n-1) + F(n-2)
        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(n + "th Fibonacci number: " + getFibonacci(n));
    }
}

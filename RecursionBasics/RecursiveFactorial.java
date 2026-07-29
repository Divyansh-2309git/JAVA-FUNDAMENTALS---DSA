/**
 * Program Name : RecursiveFactorial
 * Topic        : RecursionBasics
 * Difficulty   : Beginner
 * Concepts     : Base Case, Recursive Call Stack, Mathematical Induction
 * -------------------------------------------------------------
 * Description  :
 * Computes the factorial of N (N!) recursively.
 */
public class RecursiveFactorial {

    public static int calculateFactorial(int n) {
        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive call
        return n * calculateFactorial(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of " + n + " is: " + calculateFactorial(n));
    }
}

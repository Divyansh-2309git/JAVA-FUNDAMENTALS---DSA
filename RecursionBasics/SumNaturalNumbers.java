/**
 * Program Name : SumNaturalNumbers
 * Topic        : RecursionBasics
 * Difficulty   : Beginner
 * Concepts     : Accumulative Recursion, Mathematical Summation
 * -------------------------------------------------------------
 * Description  :
 * Computes the sum of the first N natural numbers recursively.
 */
public class SumNaturalNumbers {

    public static int calculateSum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + calculateSum(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Sum of first " + n + " natural numbers: " + calculateSum(n));
    }
}

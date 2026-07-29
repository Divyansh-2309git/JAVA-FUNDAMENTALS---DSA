/**
 * Program Name : numInInc
 * Topic        : Practice / Recursion
 * Difficulty   : Beginner
 * Concepts     : Tail Recursion, Factorial Recursion
 * -------------------------------------------------------------
 * Description  :
 * Recursively prints numbers in increasing order and calculates factorial.
 */
public class numInInc {

    public static void increasing(int num) {
        if (num == 0) {
            return;
        }
        increasing(num - 1);
        System.out.print(num + " ");
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.print("Increasing order up to " + n + ": ");
        increasing(n);
        System.out.println();
        System.out.println("Factorial of " + n + " is: " + factorial(n));
    }
}

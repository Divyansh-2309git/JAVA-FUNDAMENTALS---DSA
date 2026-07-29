/**
 * Program Name : PrintIncreasingNumbers
 * Topic        : RecursionBasics
 * Difficulty   : Beginner
 * Concepts     : Call-stack unwinding, Post-recursive action
 * -------------------------------------------------------------
 * Description  :
 * Prints numbers from 1 to N in increasing order using recursion.
 */
public class PrintIncreasingNumbers {

    public static void printIncreasing(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printIncreasing(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.print("Numbers in increasing order: ");
        printIncreasing(n);
        System.out.println();
    }
}

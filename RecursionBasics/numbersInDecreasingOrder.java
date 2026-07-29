/**
 * Program Name : numbersInDecreasingOrder
 * Topic        : RecursionBasics
 * Difficulty   : Beginner
 * Concepts     : Head-Recursive Printing, Tail Calls
 * -------------------------------------------------------------
 * Description  :
 * Prints numbers from N down to 1 in decreasing order using recursion.
 */
public class numbersInDecreasingOrder {

    public static void printDecreasing(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDecreasing(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.print("Numbers in decreasing order: ");
        printDecreasing(n);
    }
}

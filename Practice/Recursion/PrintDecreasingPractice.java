/**
 * Program Name : PrintDecreasingPractice
 * Topic        : Practice / Recursion
 * Difficulty   : Beginner
 * Concepts     : Recursion Base Case, Head Recursion
 * -------------------------------------------------------------
 * Description  :
 * Recursively prints numbers from N down to 1 in decreasing order.
 */
public class PrintDecreasingPractice {

    public static void decreasing(int num) {
        if (num == 0) {
            return;
        }
        System.out.print(num + " ");
        decreasing(num - 1);
    }

    public static void main(String[] args) {
        int num = 4;
        System.out.print("Decreasing order: ");
        decreasing(num);
        System.out.println();
    }
}

/**
 * Program Name : pairing
 * Topic        : Arrays
 * Difficulty   : Beginner
 * Concepts     : Nested Loops, Combinatorics, Array Pairs
 * -------------------------------------------------------------
 * Description  :
 * Prints all unique pairs of elements in an array. Total pairs = N*(N-1)/2.
 */
public class pairing {

    public static void printPairs(int[] numbers) {
        int totalPairs = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + numbers[i] + "," + numbers[j] + ") ");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs: " + totalPairs);
    }

    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5};
        printPairs(numbers);
    }
}

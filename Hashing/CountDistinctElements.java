/**
 * Program Name : CountDistinctElements
 * Topic        : Hashing
 * Difficulty   : Beginner
 * Concepts     : HashSet, Counting Unique Elements
 * -------------------------------------------------------------
 * Description  :
 * Counts the total number of unique/distinct elements in an integer array using a HashSet in O(N) time.
 */
import java.util.HashSet;

public class CountDistinctElements {

    /**
     * Returns the count of distinct elements in the given array.
     * Time Complexity: O(N), Space Complexity: O(N)
     */
    public static int countDistinct(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int val : arr) {
            set.add(val);
        }

        return set.size();
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 4, 5, 6, 2, 5, 6, 9};

        System.out.println("Distinct elements count: " + countDistinct(arr));
    }
}
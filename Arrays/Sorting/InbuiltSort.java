/**
 * Program Name : InbuiltSort
 * Topic        : Sorting
 * Difficulty   : Beginner
 * Concepts     : Java Standard Collections, Arrays.sort(), Custom Comparator
 * -------------------------------------------------------------
 * Description  :
 * Demonstrates Java's built-in sorting method Arrays.sort() for ascending and descending orders.
 */
import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort {
    public static void main(String[] args) {
        Integer[] arr = {5, 4, 2, 3, 1};

        // Sort in descending order using Collections.reverseOrder()
        Arrays.sort(arr, Collections.reverseOrder());

        System.out.print("Sorted in Descending Order: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

/**
 * Program Name : CountingSort
 * Topic        : Sorting
 * Difficulty   : Intermediate
 * Concepts     : Non-Comparison Sorting, Frequency Array
 * -------------------------------------------------------------
 * Description  :
 * Sorts an array of non-negative integers in O(N + K) time using Counting Sort.
 */
public class CountingSort {

    public static void sort(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int[] count = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Reconstruct sorted array
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 1, 3, 2, 4, 3, 7};
        sort(arr);

        System.out.print("Sorted Array (Counting Sort): ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

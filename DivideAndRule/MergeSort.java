/**
 * Program Name : MergeSort
 * Topic        : Divide and Conquer
 * Difficulty   : Intermediate
 * Concepts     : Divide & Conquer, Recursion, Merge Step, O(N log N) Sorting
 * -------------------------------------------------------------
 * Description  :
 * Implements the Merge Sort algorithm using a divide-and-conquer strategy.
 */
public class MergeSort {

    public static void sort(int[] arr, int startIndex, int endIndex) {
        // Base case: 1 or 0 elements
        if (startIndex >= endIndex) {
            return;
        }

        int mid = startIndex + (endIndex - startIndex) / 2;
        sort(arr, startIndex, mid);      // Sort left half
        sort(arr, mid + 1, endIndex);   // Sort right half
        merge(arr, startIndex, mid, endIndex); // Merge sorted halves
    }

    public static void merge(int[] arr, int startIndex, int mid, int endIndex) {
        int[] temp = new int[endIndex - startIndex + 1];
        int i = startIndex; // Left sub-array pointer
        int j = mid + 1;     // Right sub-array pointer
        int k = 0;           // Temp array pointer

        // Compare elements from both halves and copy smaller element
        while (i <= mid && j <= endIndex) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining elements from left half
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from right half
        while (j <= endIndex) {
            temp[k++] = arr[j++];
        }

        // Copy temp array back into original array
        for (k = 0, i = startIndex; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};
        sort(arr, 0, arr.length - 1);

        System.out.print("Sorted Array (Merge Sort): ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

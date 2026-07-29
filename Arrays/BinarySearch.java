/**
 * Program Name : BinarySearch
 * Topic        : Arrays
 * Difficulty   : Beginner
 * Concepts     : Divide and Conquer, Binary Search Algorithm
 * -------------------------------------------------------------
 * Description  :
 * Performs Binary Search on a sorted array to find a target key in O(log N) time.
 */
public class BinarySearch {

    public static int search(int[] numbers, int key) {
        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2; // Prevents overflow

            if (numbers[mid] == key) {
                return mid; // Target found
            }
            if (numbers[mid] < key) {
                start = mid + 1; // Search right half
            } else {
                end = mid - 1;   // Search left half
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;
        
        int index = search(numbers, key);
        if (index != -1) {
            System.out.println("Key found at index: " + index);
        } else {
            System.out.println("Key not found.");
        }
    }
}

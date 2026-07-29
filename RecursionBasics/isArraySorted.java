/**
 * Program Name : isArraySorted
 * Topic        : RecursionBasics
 * Difficulty   : Beginner
 * Concepts     : Array Validation, Recursive Divide-and-Conquer Check
 * -------------------------------------------------------------
 * Description  :
 * Checks recursively if an array is sorted in strictly non-decreasing order.
 */
public class isArraySorted {

    public static boolean checkSorted(int[] arr, int index) {
        // Base case: last element reached
        if (index == arr.length - 1) {
            return true;
        }
        // Violation check
        if (arr[index] > arr[index + 1]) {
            return false;
        }
        // Recurse for rest of array
        return checkSorted(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Is array sorted? " + checkSorted(arr, 0));
    }
}

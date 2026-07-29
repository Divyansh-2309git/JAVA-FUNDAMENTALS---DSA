/**
 * Program Name : lastOccurrence
 * Topic        : RecursionBasics
 * Difficulty   : Intermediate
 * Concepts     : Backtracking Traversal, Post-order Evaluation
 * -------------------------------------------------------------
 * Description  :
 * Finds the index of the last occurrence of a key in an array recursively.
 */
public class lastOccurrence {

    public static int findLastOccurrence(int[] nums, int key, int index) {
        // Base case: reached end of array
        if (index == nums.length) {
            return -1;
        }

        // Recurse to end first
        int isFoundLater = findLastOccurrence(nums, key, index + 1);

        // If target was found in later elements, return that index
        if (isFoundLater != -1) {
            return isFoundLater;
        }

        // Otherwise check current index
        if (nums[index] == key) {
            return index;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 7, 4, 9, 2, 0, 4, 6, 5};
        int key = 4;
        System.out.println("Last occurrence of " + key + " is at index: " + findLastOccurrence(nums, key, 0));
    }
}

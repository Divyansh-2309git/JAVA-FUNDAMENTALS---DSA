/**
 * Program Name : FirstOccurrence
 * Topic        : RecursionBasics
 * Difficulty   : Beginner
 * Concepts     : Linear Search via Recursion, Forward Traversal
 * -------------------------------------------------------------
 * Description  :
 * Finds the index of the first occurrence of a key in an array recursively.
 */
public class FirstOccurrence {

    public static int findFirstOccurrence(int[] nums, int key, int index) {
        // Base case: end of array reached
        if (index == nums.length) {
            return -1;
        }
        // Check current index
        if (nums[index] == key) {
            return index;
        }

        // Recurse for remaining array
        return findFirstOccurrence(nums, key, index + 1);
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 7, 4, 9, 2, 0, 4, 6, 5};
        int key = 4;
        System.out.println("First occurrence of " + key + " is at index: " + findFirstOccurrence(nums, key, 0));
    }
}

/**
 * Program Name : solution26
 * Topic        : LeetCode / Arrays
 * Difficulty   : Easy (26. Remove Duplicates from Sorted Array)
 * Concepts     : Two Pointers, In-Place Array Mutation
 * -------------------------------------------------------------
 * Description  :
 * Removes duplicate values from a sorted array in-place and returns number of unique elements.
 */
public class solution26 {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int left = 0;
        for (int right = 1; right < nums.length; right++) {
            if (nums[left] != nums[right]) {
                left++;
                nums[left] = nums[right];
            }
        }
        return left + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 3, 3, 4};
        int k = removeDuplicates(nums);
        System.out.println("Number of unique elements: " + k);
        System.out.print("Modified Array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}

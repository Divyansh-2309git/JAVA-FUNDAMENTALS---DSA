/**
 * Program Name : Solution75
 * Topic        : LeetCode / Sorting
 * Difficulty   : Medium (75. Sort Colors)
 * Concepts     : Dutch National Flag Algorithm, 3-Way Partitioning
 * -------------------------------------------------------------
 * Description  :
 * Sorts an array with 0s, 1s, and 2s in-place in linear O(N) time.
 */
public class Solution75 {

    public static void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
        System.out.print("Sorted Colors: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

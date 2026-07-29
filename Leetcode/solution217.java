/**
 * Program Name : solution217
 * Topic        : LeetCode / Arrays
 * Difficulty   : Easy (217. Contains Duplicate)
 * Concepts     : Sorting, Neighboring Element Check
 * -------------------------------------------------------------
 * Description  :
 * Checks whether an array contains any duplicate values by sorting.
 */
import java.util.Arrays;

public class solution217 {

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 1};
        System.out.println("Contains duplicate? " + containsDuplicate(nums));
    }
}

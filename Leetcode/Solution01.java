/**
 * Program Name : Solution01
 * Topic        : LeetCode / Arrays
 * Difficulty   : Easy (1. Two Sum)
 * Concepts     : Brute-Force Array Search, Pair Sum Matching
 * -------------------------------------------------------------
 * Description  :
 * Finds two indices in an array such that their values sum up to a target number.
 */
public class Solution01 {

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] ans = twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println("Indices: " + ans[0] + ", " + ans[1]);
    }
}

/**
 * Program Name : Solution53
 * Topic        : LeetCode / Dynamic Programming
 * Difficulty   : Medium (53. Maximum Subarray)
 * Concepts     : Kadane's Algorithm, Dynamic Programming
 * -------------------------------------------------------------
 * Description  :
 * Finds the contiguous subarray with the largest sum using Kadane's algorithm in O(N) time.
 */
public class Solution53 {

    public static int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSoFar = Math.max(maxSoFar, currentSum);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Subarray Sum: " + maxSubArray(nums));
    }
}

/**
 * Program Name : Solution560
 * Topic        : LeetCode / Arrays
 * Difficulty   : Medium (560. Subarray Sum Equals K)
 * Concepts     : Prefix Sum, Cumulative Sum Matching
 * -------------------------------------------------------------
 * Description  :
 * Finds total number of contiguous subarrays whose sum equals K.
 */
public class Solution560 {

    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int currentSum = 0;
            for (int j = i; j < nums.length; j++) {
                currentSum += nums[j];
                if (currentSum == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        int k = 2;
        System.out.println("Total subarrays with sum " + k + ": " + subarraySum(nums, k));
    }
}

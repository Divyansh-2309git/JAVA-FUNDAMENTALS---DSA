/**
 * Program Name : maxSubArrays
 * Topic        : Arrays
 * Difficulty   : Beginner
 * Concepts     : Brute Force, Subarray Sum Calculation
 * -------------------------------------------------------------
 * Description  :
 * Calculates maximum subarray sum using 3 nested loops (Brute Force O(N^3)).
 */
public class maxSubArrays {

    public static void printMaxSubarraySumBruteForce(int[] nums) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int currentSum = 0;
                for (int k = i; k <= j; k++) {
                    currentSum += nums[k];
                }
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("Maximum Subarray Sum (Brute Force): " + maxSum);
    }

    public static void main(String[] args) {
        int[] nums = {1, -2, 6, -1, 3};
        printMaxSubarraySumBruteForce(nums);
    }
}

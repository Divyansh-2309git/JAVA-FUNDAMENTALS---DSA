/**
 * Program Name : MaxSumSubarrayKadanes
 * Topic        : Arrays
 * Difficulty   : Intermediate
 * Concepts     : Kadane's Algorithm (Dynamic Programming)
 * -------------------------------------------------------------
 * Description  :
 * Finds maximum subarray sum using Kadane's Algorithm in optimal O(N) time and O(1) space.
 */
public class MaxSumSubarrayKadanes {

    public static int kadanesMaxSubarraySum(int[] numbers) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            currentSum += numbers[i];
            if (currentSum < 0) {
                currentSum = 0; // Reset current sum if negative
            }
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] numbers = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Subarray Sum (Kadane's Algorithm): " + kadanesMaxSubarraySum(numbers));
    }
}

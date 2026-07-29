/**
 * Program Name : MaxSumSubarrayPrefix
 * Topic        : Arrays
 * Difficulty   : Intermediate
 * Concepts     : Prefix Sum Array Technique
 * -------------------------------------------------------------
 * Description  :
 * Calculates maximum subarray sum using Prefix Sum Array technique in O(N^2) time complexity.
 */
public class MaxSumSubarrayPrefix {

    public static int maxSubarraySumPrefix(int[] numbers) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int[] prefix = new int[numbers.length];

        prefix[0] = numbers[0];
        // Calculate prefix sums
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currentSum = (start == 0) ? prefix[end] : prefix[end] - prefix[start - 1];

                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] numbers = {2, -4, -5, 7, 3};
        System.out.println("Maximum Subarray Sum (Prefix Sum approach): " + maxSubarraySumPrefix(numbers));
    }
}

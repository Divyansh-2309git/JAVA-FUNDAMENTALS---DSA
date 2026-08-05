/**
 * Program Name : LargestSubarrayWithSum0
 * Topic        : Hashing
 * Difficulty   : Intermediate
 * Concepts     : HashMap, Prefix Sum, Subarray Sum
 * -------------------------------------------------------------
 * Description  :
 * Finds the length of the largest contiguous subarray with a sum of 0 using Prefix Sum and HashMap in O(N) time.
 */
import java.util.HashMap;

public class LargestSubarrayWithSum0 {

    /**
     * Returns the length of the longest subarray with sum equal to 0.
     * Time Complexity: O(N), Space Complexity: O(N)
     */
    public static int findLargestSubarrayWithSum0(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>(); // Key: Prefix Sum, Value: Index

        int sum = 0;
        int len = 0;

        map.put(0, -1); // Handles sub-arrays starting from index 0 with sum 0

        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];

            if (map.containsKey(sum)) {
                len = Math.max(len, j - map.get(sum));
            } else {
                map.put(sum, j);
            }
        }

        return len;
    }

    public static void main(String[] args) {
        int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};

        System.out.println("Length of largest subarray with sum 0: " + findLargestSubarrayWithSum0(arr));
    }
}

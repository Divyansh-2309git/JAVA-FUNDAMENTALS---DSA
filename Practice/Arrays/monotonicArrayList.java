/**
 * Program Name : monotonicArrayList
 * Topic        : Practice / Arrays
 * Difficulty   : Beginner
 * Concepts     : Monotonic Array / List Check, Monotonicity logic
 * -------------------------------------------------------------
 * Description  :
 * Checks whether an array is monotonic (either entirely non-increasing or non-decreasing).
 */
public class monotonicArrayList {

    public static boolean isMonotonic(int[] nums) {
        boolean inc = true;
        boolean dec = true;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                inc = false;
            }
            if (nums[i] < nums[i + 1]) {
                dec = false;
            }
        }
        return inc || dec;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3};
        System.out.println("Is array monotonic? " + isMonotonic(nums));
    }
}

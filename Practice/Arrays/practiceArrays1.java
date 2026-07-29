/**
 * Program Name : practiceArrays1
 * Topic        : Practice / Arrays
 * Difficulty   : Beginner
 * Concepts     : Array Brute Force Search, Duplicate Detection
 * -------------------------------------------------------------
 * Description  :
 * Checks if any element in an array appears at least twice (contains duplicates).
 */
public class practiceArrays1 {

    public static boolean isRepeated(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println("Contains repeated elements? " + isRepeated(nums));
    }
}

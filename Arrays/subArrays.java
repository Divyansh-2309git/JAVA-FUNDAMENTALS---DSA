/**
 * Program Name : subArrays
 * Topic        : Arrays
 * Difficulty   : Beginner
 * Concepts     : Subarray Generation, Nested Loops
 * -------------------------------------------------------------
 * Description  :
 * Prints all contiguous subarrays of an array. Total subarrays = N*(N+1)/2.
 */
public class subArrays {

    public static void printSubArrays(int[] nums) {
        int totalSubarrays = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                System.out.print("[");
                for (int k = i; k <= j; k++) {
                    System.out.print(nums[k] + (k < j ? ", " : ""));
                }
                System.out.print("] ");
                totalSubarrays++;
            }
            System.out.println();
        }
        System.out.println("Total Subarrays: " + totalSubarrays);
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8};
        printSubArrays(nums);
    }
}

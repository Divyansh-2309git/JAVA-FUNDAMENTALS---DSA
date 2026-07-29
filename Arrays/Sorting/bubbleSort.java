/**
 * Program Name : bubbleSort
 * Topic        : Sorting
 * Difficulty   : Beginner
 * Concepts     : Adjacent Swapping, Pass-by-Pass Sorting
 * -------------------------------------------------------------
 * Description  :
 * Sorts an array in ascending order using Bubble Sort algorithm in O(N^2) time complexity.
 */
public class bubbleSort {

    public static void sort(int[] nums) {
        int n = nums.length;
        for (int pass = 0; pass < n - 1; pass++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - pass; j++) {
                if (nums[j] > nums[j + 1]) {
                    // Swap adjacent elements
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; // Optimization: early exit if already sorted
        }
    }

    public static void main(String[] args) {
        int[] nums = {5, 4, 1, 3, 2};
        sort(nums);

        System.out.print("Sorted Array (Bubble Sort): ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

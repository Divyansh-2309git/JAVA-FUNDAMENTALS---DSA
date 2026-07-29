/**
 * Program Name : SelectionSort
 * Topic        : Sorting
 * Difficulty   : Beginner
 * Concepts     : Minimum Element Selection, Swapping
 * -------------------------------------------------------------
 * Description  :
 * Sorts an array using Selection Sort by finding the minimum element from the unsorted part.
 */
public class SelectionSort {

    public static void sort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap minimum element with current element
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = {5, 4, 1, 3, 2};
        sort(nums);

        System.out.print("Sorted Array (Selection Sort): ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

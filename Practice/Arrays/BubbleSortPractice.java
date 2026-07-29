/**
 * Program Name : BubbleSortPractice
 * Topic        : Practice / Arrays
 * Difficulty   : Beginner
 * Concepts     : Bubble Sort Practice, Array Sorting
 * -------------------------------------------------------------
 * Description  :
 * Practice implementation of Bubble Sort to sort an integer array in ascending order.
 */
public class BubbleSortPractice {

    public static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        bubbleSort(nums);
        System.out.print("Sorted Array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

/**
 * Program Name : question1
 * Topic        : Practice / Recursion
 * Difficulty   : Beginner
 * Concepts     : Recursive Searching, Index Printing
 * -------------------------------------------------------------
 * Description  :
 * Finds and prints all index positions of a target key in an array using recursion.
 */
public class question1 {

    public static void findAllOccurrences(int[] nums, int key, int index) {
        if (index == nums.length) {
            return;
        }
        if (nums[index] == key) {
            System.out.print(index + " ");
        }
        findAllOccurrences(nums, key, index + 1);
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 5, 2, 8, 7, 2, 2, 9, 2};
        int key = 2;
        System.out.print("Indices of key " + key + ": ");
        findAllOccurrences(nums, key, 0);
        System.out.println();
    }
}

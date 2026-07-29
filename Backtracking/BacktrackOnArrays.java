/**
 * Program Name : BacktrackOnArrays
 * Topic        : Backtracking
 * Difficulty   : Beginner
 * Concepts     : Recursion Stack, Backtracking Step, Array State Mutation
 * -------------------------------------------------------------
 * Description  :
 * Demonstrates backtracking on an array: values are assigned during forward recursion calls
 * and modified (backtracked) during stack unwinding.
 */
public class BacktrackOnArrays {

    public static void changeArr(int[] arr, int index, int value) {
        // Base case: full array populated
        if (index == arr.length) {
            System.out.print("Array at base case: ");
            printArr(arr);
            return;
        }

        // Forward step: Assign value
        arr[index] = value;
        changeArr(arr, index + 1, value + 1);

        // Backtracking step: Modify array value as recursion unwinds
        arr[index] = arr[index] - 2;
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = new int[5];
        changeArr(nums, 0, 1);

        System.out.print("Array after backtracking: ");
        printArr(nums);
    }
}

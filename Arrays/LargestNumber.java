/**
 * Program Name : LargestNumber
 * Topic        : Arrays
 * Difficulty   : Beginner
 * Concepts     : Array Traversal, Linear Search for Maximum
 * -------------------------------------------------------------
 * Description  :
 * Finds the maximum value element in an integer array.
 */
public class LargestNumber {

    public static int findLargest(int[] numbers) {
        int largestNum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largestNum) {
                largestNum = numbers[i];
            }
        }
        return largestNum;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 5, 423, 2432, 423};
        System.out.println("Largest number: " + findLargest(numbers));
    }
}

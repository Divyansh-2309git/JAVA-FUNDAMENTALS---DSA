/**
 * Program Name : ReverseArray
 * Topic        : Arrays
 * Difficulty   : Beginner
 * Concepts     : Two-pointer Technique, In-place Array Reversal
 * -------------------------------------------------------------
 * Description  :
 * Reverses an array in-place using two pointers (first & last) in O(N) time and O(1) space.
 */
public class ReverseArray {

    public static void reverseArray(int[] numbers) {
        int first = 0;
        int last = numbers.length - 1;

        while (first < last) {
            int temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp;

            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 5, 6, 8, 10};
        reverseArray(numbers);

        System.out.print("Reversed Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

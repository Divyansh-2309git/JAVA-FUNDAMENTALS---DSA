/**
 * Program Name : linearSearch
 * Topic        : Arrays
 * Difficulty   : Beginner
 * Concepts     : Linear Search, Sequential Iteration
 * -------------------------------------------------------------
 * Description  :
 * Performs linear search on an array to find the index of a key element. Time Complexity O(N).
 */
public class linearSearch {

    public static int search(int[] numbers, int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i; // Return index of target key
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 14, 15, 20, 10, 56, 123, 232};
        int key = 20;

        int index = search(numbers, key);
        if (index != -1) {
            System.out.println("Key " + key + " found at index: " + index);
        } else {
            System.out.println("Key not found in array.");
        }
    }
}

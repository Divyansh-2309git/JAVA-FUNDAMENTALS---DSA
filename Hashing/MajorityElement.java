/**
 * Program Name : MajorityElement
 * Topic        : Hashing
 * Difficulty   : Intermediate
 * Concepts     : HashMap Frequency Counting, Majority Element
 * -------------------------------------------------------------
 * Description  :
 * Finds all elements in an array that appear more than N/3 times using HashMap frequency mapping in O(N) time.
 */
import java.util.HashMap;
import java.util.Set;

public class MajorityElement {

    /**
     * Prints all elements occurring more than N / 3 times in the array.
     */
    public static void printMajorityElements(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        System.out.println("Majority elements (> N/3 times):");
        Set<Integer> keySet = map.keySet();
        for (int key : keySet) {
            if (map.get(key) > arr.length / 3) {
                System.out.println(key);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 1, 3, 1, 5, 1};
        printMajorityElements(arr);
    }
}
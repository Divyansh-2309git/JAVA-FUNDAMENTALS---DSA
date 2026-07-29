/**
 * Program Name : PairSumRotated
 * Topic        : ArrayList
 * Difficulty   : Intermediate
 * Concepts     : Rotated Sorted Array, Modular Arithmetic Two-Pointer Approach
 * -------------------------------------------------------------
 * Description  :
 * Finds if a target pair sum exists in a sorted & rotated ArrayList in O(N) time using modulo indexing.
 */
import java.util.ArrayList;

public class PairSumRotated {

    public static boolean pairSumRotated(ArrayList<Integer> list, int target) {
        int pivot = -1;
        int n = list.size();

        // Find pivot (breaking point where list[i] > list[i+1])
        for (int i = 0; i < n - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                pivot = i;
                break;
            }
        }

        int right = pivot;         // Index of largest element
        int left = (pivot + 1) % n; // Index of smallest element

        while (left != right) {
            int currentSum = list.get(left) + list.get(right);
            if (currentSum == target) {
                return true;
            }
            if (currentSum > target) {
                right = (n + right - 1) % n; // Move right pointer backward circularly
            } else {
                left = (left + 1) % n;        // Move left pointer forward circularly
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;
        System.out.println("Pair with sum " + target + " exists: " + pairSumRotated(list, target));
    }
}

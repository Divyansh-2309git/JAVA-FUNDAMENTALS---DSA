/**
 * Program Name : PairSumSorted
 * Topic        : ArrayList
 * Difficulty   : Intermediate
 * Concepts     : Sorted ArrayList, Two-Pointer Pair Sum
 * -------------------------------------------------------------
 * Description  :
 * Determines if there exists a pair in a sorted ArrayList that sums up to a target key in O(N) time.
 */
import java.util.ArrayList;

public class PairSumSorted {

    public static boolean hasPairSum(ArrayList<Integer> nums, int target) {
        int left = 0;
        int right = nums.size() - 1;

        while (left < right) {
            int currentSum = nums.get(left) + nums.get(right);
            if (currentSum == target) {
                return true;
            } else if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 5;
        System.out.println("Pair with sum " + target + " exists: " + hasPairSum(list, target));
    }
}

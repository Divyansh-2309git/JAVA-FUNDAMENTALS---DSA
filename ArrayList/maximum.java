/**
 * Program Name : maximum
 * Topic        : ArrayList
 * Difficulty   : Beginner
 * Concepts     : List Traversal, Finding Maximum Value
 * -------------------------------------------------------------
 * Description  :
 * Finds the maximum element present in an ArrayList in O(N) time.
 */
import java.util.ArrayList;

public class maximum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(8);
        list.add(11);
        list.add(92);

        int maxVal = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            maxVal = Math.max(maxVal, list.get(i));
        }

        System.out.println("Maximum element in ArrayList: " + maxVal);
    }
}

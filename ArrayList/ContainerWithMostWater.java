/**
 * Program Name : ContainerWithMostWater
 * Topic        : ArrayList
 * Difficulty   : Intermediate
 * Concepts     : Container With Most Water, Two-Pointer Technique
 * -------------------------------------------------------------
 * Description  :
 * Solves the Container With Most Water problem (LeetCode 11) using 2 pointers in O(N) time.
 */
import java.util.ArrayList;

public class ContainerWithMostWater {

    public static int maxWater(ArrayList<Integer> height) {
        int left = 0;
        int right = height.size() - 1;
        int maxWater = 0;

        while (left < right) {
            int minHeight = Math.min(height.get(left), height.get(right));
            int width = right - left;
            int currentWater = minHeight * width;
            maxWater = Math.max(maxWater, currentWater);

            // Move pointer pointing to shorter line to potentially find a taller line
            if (height.get(left) < height.get(right)) {
                left++;
            } else {
                right--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println("Maximum Water Trapped: " + maxWater(height));
    }
}

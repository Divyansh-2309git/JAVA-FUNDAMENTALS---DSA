/**
 * Program Name : Solution11
 * Topic        : LeetCode / Two Pointers
 * Difficulty   : Medium (11. Container With Most Water)
 * Concepts     : Two Pointers, Greedy Strategy, Area Calculation
 * -------------------------------------------------------------
 * Description  :
 * Calculates the maximum area of water a container can hold formed by lines at different heights.
 */
public class Solution11 {

    public static int maxWaterContainer(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;

        while (left < right) {
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int currentWater = minHeight * width;
            maxWater = Math.max(maxWater, currentWater);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Maximum Water Container Capacity: " + maxWaterContainer(height));
    }
}

/**
 * Program Name : Solution2965
 * Topic        : LeetCode / Matrix
 * Difficulty   : Easy (2965. Find Missing and Repeated Values)
 * Concepts     : Matrix Traversal, Frequency Array / Hash Table
 * -------------------------------------------------------------
 * Description  :
 * Given an n x n 2D grid containing values from 1 to n^2, finds the repeated number
 * and the missing number.
 */
public class Solution2965 {

    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] freq = new int[n * n + 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                freq[grid[i][j]]++;
            }
        }

        int repeated = -1;
        int missing = -1;

        for (int i = 1; i < freq.length; i++) {
            if (freq[i] == 2) {
                repeated = i;
            }
            if (freq[i] == 0) {
                missing = i;
            }
        }
        return new int[]{repeated, missing};
    }

    public static void main(String[] args) {
        int[][] grid = {{1, 3}, {2, 2}};
        int[] ans = findMissingAndRepeatedValues(grid);
        System.out.println("Repeated: " + ans[0] + ", Missing: " + ans[1]);
    }
}

/**
 * Program Name : solution74
 * Topic        : LeetCode / 2D Arrays & Binary Search
 * Difficulty   : Medium (74. Search a 2D Matrix)
 * Concepts     : Staircase Search, Binary Search in Matrix
 * -------------------------------------------------------------
 * Description  :
 * Searches for a target value in an m x n 2D matrix where rows are sorted left to right.
 */
public class solution74 {

    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        System.out.println("Is 3 in matrix? " + searchMatrix(matrix, 3));
    }
}

/**
 * Program Name : searchInSortedMatrix
 * Topic        : 2D Arrays
 * Difficulty   : Intermediate
 * Concepts     : Staircase Search, Sorted Matrix Traversal
 * -------------------------------------------------------------
 * Description  :
 * Searches for a target key in a row-wise and column-wise sorted matrix in O(N + M) time.
 */
public class searchInSortedMatrix {

    public static boolean search(int[][] matrix, int key) {
        // Start search from top-right corner (row 0, last column)
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("Key " + key + " found at cell (" + row + ", " + col + ")");
                return true;
            }
            if (matrix[row][col] > key) {
                col--; // Move left
            } else {
                row++; // Move down
            }
        }
        System.out.println("Key " + key + " not found in matrix.");
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 49, 50}
        };
        search(matrix, 33);
    }
}

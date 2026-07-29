/**
 * Program Name : diagonalSum
 * Topic        : 2D Arrays
 * Difficulty   : Intermediate
 * Concepts     : Primary & Secondary Diagonals, Matrix Traversal Optimization
 * -------------------------------------------------------------
 * Description  :
 * Calculates the sum of primary and secondary diagonals of an N x N matrix in optimal O(N) time.
 */
public class diagonalSum {

    public static int calculateDiagonalSum(int[][] matrix) {
        int sum = 0;
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            // Primary diagonal: matrix[i][i]
            sum += matrix[i][i];

            // Secondary diagonal: matrix[i][n - i - 1]
            // Avoid adding middle element twice when N is odd
            if (i != n - 1 - i) {
                sum += matrix[i][n - 1 - i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        System.out.println("Diagonal Sum: " + calculateDiagonalSum(matrix));
    }
}

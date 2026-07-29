/**
 * Program Name : creation
 * Topic        : 2D Arrays
 * Difficulty   : Beginner
 * Concepts     : 2D Matrix Creation, Input Reading, Matrix Traversal
 * -------------------------------------------------------------
 * Description  :
 * Demonstrates 2D array declaration, filling matrix via Scanner, and searching for an element.
 */
import java.util.Scanner;

public class creation {

    public static boolean search(int[][] matrix, int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Key " + key + " found at position (" + i + ", " + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key not found in matrix.");
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        search(matrix, 5);
    }
}

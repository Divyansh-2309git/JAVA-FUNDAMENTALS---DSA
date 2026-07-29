/**
 * Program Name : ArrayBasics
 * Topic        : Arrays
 * Difficulty   : Beginner
 * Concepts     : Array Creation, Pass-by-Reference in Arrays
 * -------------------------------------------------------------
 * Description  :
 * Demonstrates that array references are passed by value (modifying elements inside
 * a method directly updates the original array in heap memory).
 */
public class ArrayBasics {

    public static void update(int[] marks) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1; // Increment each mark by 1
        }
    }

    public static void main(String[] args) {
        int[] marks = {2, 3, 6};
        update(marks);
        
        System.out.print("Updated marks: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}

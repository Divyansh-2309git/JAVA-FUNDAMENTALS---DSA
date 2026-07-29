/**
 * Program Name : ArrayListBasics
 * Topic        : ArrayList
 * Difficulty   : Beginner
 * Concepts     : Dynamic Array Operations, CRUD in ArrayList
 * -------------------------------------------------------------
 * Description  :
 * Demonstrates basic operations on Java ArrayList: add, get, remove, set, size, traversal, and reversal.
 */
import java.util.ArrayList;

public class ArrayListBasics {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Add operation - O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Original List: " + list);

        // Get operation - O(1)
        int element = list.get(0);
        System.out.println("Element at index 0: " + element);

        // Remove element - O(N)
        list.remove(2); // Removes element at index 2
        System.out.println("After removing index 2: " + list);

        // Set element - O(1)
        list.set(2, 10); // Replaces element at index 2 with 10
        System.out.println("After updating index 2 to 10: " + list);

        // Size of ArrayList
        System.out.println("List size: " + list.size());

        // Forward traversal
        System.out.print("Forward Traversal: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Reverse traversal
        System.out.print("Reverse Traversal: ");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}

/**
 * Program Name : HashSets
 * Topic        : Hashing
 * Difficulty   : Beginner
 * Concepts     : HashSet Operations (add, contains, remove, clear)
 * -------------------------------------------------------------
 * Description  :
 * Demonstrates basic operations of Java HashSet (unordered collection of unique elements).
 */
import java.util.HashSet;

public class HashSets {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        // Add elements - O(1)
        set.add(1);
        set.add(23);
        set.add(43);
        set.add(90);
        set.add(23); // Duplicate element, will not be added

        System.out.println("HashSet contents: " + set);

        // Check existence - O(1)
        if (set.contains(23)) {
            System.out.println("Set contains " + 23);
        } else {
            System.out.println("Set does not contain " + 23);
        }

        // Remove element - O(1)
        set.remove(23);
        System.out.println("HashSet after removing 23: " + set);

        // Size of set
        System.out.println("Size of set: " + set.size());

        // Clear set
        set.clear();
        System.out.println("Is set empty? " + set.isEmpty());
    }
}
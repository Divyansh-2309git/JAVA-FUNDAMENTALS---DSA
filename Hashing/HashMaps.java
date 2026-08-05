/**
 * Program Name : HashMaps
 * Topic        : Hashing
 * Difficulty   : Beginner
 * Concepts     : HashMap Operations (put, get, containsKey, remove, size, clear)
 * -------------------------------------------------------------
 * Description  :
 * Demonstrates basic operations of Java HashMap (key-value pairs) with time complexity breakdown.
 */
import java.util.HashMap;

public class HashMaps {

    public static void main(String[] args) {
        // Create a HashMap to store Country -> Population mapping
        HashMap<String, Integer> hm = new HashMap<>();

        // Insert - O(1)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println("HashMap contents: " + hm);

        // Get - O(1)
        int population = hm.get("India");
        System.out.println("Population of India: " + population);

        // Return null for key that does not exist
        System.out.println("Population of Brazil: " + hm.get("Brazil"));

        // ContainsKey - O(1)
        System.out.println("Contains India? " + hm.containsKey("India")); // true
        System.out.println("Contains Spain? " + hm.containsKey("Spain")); // false

        // Remove - O(1)
        System.out.println("Removed India: " + hm.remove("India")); // Removes key and returns value
        System.out.println("Removed Japan: " + hm.remove("Japan")); // Returns null

        // Size - O(1)
        System.out.println("Size of HashMap: " + hm.size());

        // Clear - O(1)
        hm.clear(); // Empties the HashMap
        System.out.println("Is HashMap empty after clear? " + hm.isEmpty());
    }
}
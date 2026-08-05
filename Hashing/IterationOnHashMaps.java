/**
 * Program Name : IterationOnHashMaps
 * Topic        : Hashing
 * Difficulty   : Beginner
 * Concepts     : HashMap Iteration, KeySet, EntrySet
 * -------------------------------------------------------------
 * Description  :
 * Demonstrates how to iterate over entries in a HashMap using keySet() and entrySet().
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IterationOnHashMaps {

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 200);
        hm.put("Nigeria", 20);
        hm.put("Japan", 50);

        // Iteration method 1: Using keySet()
        System.out.println("--- Iteration using keySet() ---");
        Set<String> keys = hm.keySet();
        for (String key : keys) {
            System.out.println("Key = " + key + ", Value = " + hm.get(key));
        }

        // Iteration method 2: Using entrySet()
        System.out.println("--- Iteration using entrySet() ---");
        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }
}
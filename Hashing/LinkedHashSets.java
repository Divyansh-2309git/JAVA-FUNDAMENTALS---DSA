/**
 * Program Name : LinkedHashSets
 * Topic        : Hashing
 * Difficulty   : Beginner
 * Concepts     : LinkedHashSet, Insertion Order Set
 * -------------------------------------------------------------
 * Description  :
 * Demonstrates Java LinkedHashSet which stores unique elements while maintaining their insertion order.
 */
import java.util.LinkedHashSet;

public class LinkedHashSets {

    public static void main(String[] args) {
        LinkedHashSet<String> cities = new LinkedHashSet<>();

        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Tokyo");
        cities.add("Kyoto");

        System.out.println("LinkedHashSet (Insertion Order Preserved): " + cities);
    }
}
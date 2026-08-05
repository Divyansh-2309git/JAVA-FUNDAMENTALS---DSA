/**
 * Program Name : IterationOnHashSets
 * Topic        : Hashing
 * Difficulty   : Beginner
 * Concepts     : HashSet Iteration, Iterator, For-Each Loop
 * -------------------------------------------------------------
 * Description  :
 * Demonstrates different ways to iterate over elements of a HashSet using Iterators and Enhanced For-Loops.
 */
import java.util.HashSet;
import java.util.Iterator;

public class IterationOnHashSets {

    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Agra");
        cities.add("Bareli");

        // Method 1: Iteration using Iterator interface
        System.out.println("--- Iteration using Iterator ---");
        Iterator<String> it = cities.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Method 2: Iteration using Enhanced For-Each Loop
        System.out.println("--- Iteration using For-Each Loop ---");
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
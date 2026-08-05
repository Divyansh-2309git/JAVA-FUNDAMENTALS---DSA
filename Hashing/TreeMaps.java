/**
 * Program Name : TreeMaps
 * Topic        : Hashing
 * Difficulty   : Intermediate
 * Concepts     : TreeMap, Red-Black Tree, Sorted Map Key Order
 * -------------------------------------------------------------
 * Description  :
 * Demonstrates Java TreeMap which maintains keys in natural sorted order with O(log N) operations.
 */
import java.util.TreeMap;

public class TreeMaps {

    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();

        tm.put("India", 200);
        tm.put("China", 190);
        tm.put("USA", 150);
        tm.put("Japan", 90);

        System.out.println("TreeMap (Sorted Key Order): " + tm);
    }
}
/**
 * Program Name : LinkedHashMaps
 * Topic        : Hashing
 * Difficulty   : Beginner
 * Concepts     : LinkedHashMap, Insertion Order Preservation
 * -------------------------------------------------------------
 * Description  :
 * Demonstrates Java LinkedHashMap which maintains insertion order of keys using a doubly-linked list.
 */
import java.util.LinkedHashMap;

public class LinkedHashMaps {

    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("Usa", 150);
        lhm.put("Canada", 200);

        System.out.println("LinkedHashMap (Insertion Order Preserved): " + lhm);
    }
}
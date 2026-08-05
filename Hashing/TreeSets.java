/**
 * Program Name : TreeSets
 * Topic        : Hashing
 * Difficulty   : Intermediate
 * Concepts     : TreeSet, Self-Balancing BST, Sorted Set
 * -------------------------------------------------------------
 * Description  :
 * Demonstrates Java TreeSet which maintains unique elements in natural sorted order with O(log N) operations.
 */
import java.util.TreeSet;

public class TreeSets {

    public static void main(String[] args) {
        TreeSet<Integer> marks = new TreeSet<>();
        marks.add(100);
        marks.add(50);
        marks.add(121);
        marks.add(106);

        System.out.println("TreeSet (Sorted Order): " + marks);
    }
}
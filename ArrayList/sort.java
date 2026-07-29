/**
 * Program Name : sort
 * Topic        : ArrayList
 * Difficulty   : Beginner
 * Concepts     : Collections.sort(), Sorting Algorithms in Java
 * -------------------------------------------------------------
 * Description  :
 * Demonstrates sorting an ArrayList in ascending order using Java's Collections.sort() method.
 */
import java.util.ArrayList;
import java.util.Collections;

public class sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(8);
        list.add(11);
        list.add(92);

        System.out.println("Before sorting: " + list);
        Collections.sort(list);
        System.out.println("After sorting (Ascending): " + list);
    }
}

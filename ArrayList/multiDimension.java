/**
 * Program Name : multiDimension
 * Topic        : ArrayList
 * Difficulty   : Beginner
 * Concepts     : 2D ArrayList, Nested Generic Data Structures
 * -------------------------------------------------------------
 * Description  :
 * Demonstrates creating and populating multi-dimensional (nested) ArrayLists in Java.
 */
import java.util.ArrayList;

public class multiDimension {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(5);
        list1.add(3);
        mainList.add(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(12);
        list2.add(16);
        mainList.add(list2);

        System.out.println("Multi-Dimensional ArrayList: " + mainList);
    }
}

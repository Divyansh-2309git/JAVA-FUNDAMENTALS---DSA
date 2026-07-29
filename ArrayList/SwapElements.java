/**
 * Program Name : SwapElements
 * Topic        : ArrayList
 * Difficulty   : Beginner
 * Concepts     : List Element Swapping, Auxiliary Variable
 * -------------------------------------------------------------
 * Description  :
 * Swaps two elements in an ArrayList at given index positions.
 */
import java.util.ArrayList;

public class SwapElements {

    public static void swapElements(ArrayList<Integer> list, int index1, int index2) {
        int temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(8);

        System.out.println("Before swap: " + list);
        swapElements(list, 1, 2);
        System.out.println("After swapping index 1 and 2: " + list);
    }
}

/**
 * Program Name : HeapPeek
 * Topic        : Heaps
 * Difficulty   : Beginner
 * Concepts     : Heap Implementation, Peek Operation, Min-Heap
 * -------------------------------------------------------------
 * Description  :
 * Implements and demonstrates the peek operation in a Heap using an ArrayList.
 * Peek returns the top/minimum element (root) located at index 0 in O(1) time complexity.
 */
import java.util.ArrayList;

public class HeapPeek {

    public static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            arr.add(data);
        }

        public int peek() {
            return arr.get(0);
        }
    }

    public static void main(String[] args) {
        Heap heap = new Heap();
        heap.add(3);
        heap.add(4);
        heap.add(1);
        heap.add(5);

        System.out.println("Min element in heap: " + heap.peek());
    }
}
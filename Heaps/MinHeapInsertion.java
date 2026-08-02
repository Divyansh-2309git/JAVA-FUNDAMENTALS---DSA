/**
 * Program Name : MinHeapInsertion
 * Topic        : Heaps
 * Difficulty   : Intermediate
 * Concepts     : Min-Heap Implementation, Insertion, Heapify (Up-Heapify)
 * -------------------------------------------------------------
 * Description  :
 * Implements Min-Heap insertion and heapify up algorithm using an ArrayList.
 */
import java.util.ArrayList;

public class MinHeapInsertion {

    public static class MinHeap {
        ArrayList<Integer> arr = new ArrayList<>();

        /**
         * Inserts element into heap and restores min-heap property via up-heapify.
         */
        public void add(int data) {
            arr.add(data);
            int childIndex = arr.size() - 1;
            int parentIndex = (childIndex - 1) / 2;

            // Up-heapify (swap with parent while child < parent) O(log N)
            while (childIndex > 0 && arr.get(childIndex) < arr.get(parentIndex)) {
                // Swap
                int temp = arr.get(childIndex);
                arr.set(childIndex, arr.get(parentIndex));
                arr.set(parentIndex, temp);

                childIndex = parentIndex;
                parentIndex = (childIndex - 1) / 2;
            }
        }

        public int peek() {
            return arr.get(0);
        }
    }

    public static void main(String[] args) {
        MinHeap heap = new MinHeap();
        heap.add(3);
        heap.add(4);
        heap.add(1);
        heap.add(5);

        System.out.println("Min element in heap: " + heap.peek());
    }
}

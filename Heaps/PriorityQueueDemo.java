/**
 * Program Name : PriorityQueueDemo
 * Topic        : Heaps
 * Difficulty   : Beginner
 * Concepts     : PriorityQueue, Min-Heap, Max-Heap, Custom Comparators
 * -------------------------------------------------------------
 * Description  :
 * Demonstrates usage of Java's built-in PriorityQueue (Min-Heap by default)
 * and reversing priority using Comparator.reverseOrder() (Max-Heap).
 */
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        // PriorityQueue with Comparator.reverseOrder() creates a Max-Heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(1); // O(log N)
        pq.add(2);
        pq.add(3);
        pq.add(7);
        pq.add(5);

        System.out.print("Priority Queue elements in descending order (Max-Heap): ");
        while (!pq.isEmpty()) {
            System.out.print(pq.peek() + " ");// O(1)
            pq.remove(); // O(log N)
        }
        System.out.println();
    }
}

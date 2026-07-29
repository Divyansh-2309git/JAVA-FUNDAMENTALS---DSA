/**
 * Program Name : InterleaveQueueHalves
 * Topic        : Queue
 * Difficulty   : Intermediate
 * Concepts     : Queue Manipulation, Halves Interleaving
 * -------------------------------------------------------------
 * Description  :
 * Interleaves the first half of a queue with the second half (e.g., [1 2 3 4 5 6 7 8 9 10] -> [1 6 2 7 3 8 4 9 5 10]).
 */
import java.util.LinkedList;
import java.util.Queue;

public class InterleaveQueueHalves {

    public static void interleave(Queue<Integer> q) {
        Queue<Integer> firstHalf = new LinkedList<>();
        int size = q.size();

        // Push first half to auxiliary queue
        for (int i = 0; i < size / 2; i++) {
            firstHalf.add(q.remove());
        }

        // Interleave elements
        while (!firstHalf.isEmpty()) {
            q.add(firstHalf.remove());
            q.add(q.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            q.add(i);
        }

        System.out.println("Original Queue: " + q);
        interleave(q);
        System.out.println("Interleaved Queue: " + q);
    }
}

/**
 * Program Name : queueUsingDeque
 * Topic        : Queue
 * Difficulty   : Beginner
 * Concepts     : Deque API Adaptation, Queue Interface Simulation
 * -------------------------------------------------------------
 * Description  :
 * Implements a Queue using java.util.Deque container.
 */
import java.util.Deque;
import java.util.LinkedList;

public class queueUsingDeque {

    static class DequeQueue {
        private Deque<Integer> deque = new LinkedList<>();

        public void add(int data) {
            deque.addLast(data);
        }

        public int remove() {
            return deque.removeFirst();
        }

        public int peek() {
            return deque.getFirst();
        }

        public boolean isEmpty() {
            return deque.isEmpty();
        }
    }

    public static void main(String[] args) {
        DequeQueue q = new DequeQueue();
        q.add(10);
        q.add(20);
        q.add(30);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
